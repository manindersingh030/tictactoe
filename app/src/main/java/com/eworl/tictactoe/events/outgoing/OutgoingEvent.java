package com.eworl.tictactoe.events.outgoing;

import com.eworl.tictactoe.events.Event;

/**
 * Created by Maninder Taggar on 26/1/17.
 */

public abstract class OutgoingEvent extends Event {

    public abstract void send();
}
