package com.ss.android.ugc.aweme.shortvideo.edit.capcut;

import X.AbstractC26082ALm;
import X.C145425nG;
import X.C26092ALw;
import X.C45927I0t;
import X.C5SM;
import X.C76800UCe;
import X.F9E;
import X.InterfaceC61312at;
import X.KS3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EditCapCutState extends F9E implements InterfaceC61312at {
    public final C45927I0t<KS3> gotoCCEvent;
    public final C145425nG gotoGPPlayEvent;
    public final AbstractC26082ALm<C76800UCe> loadingEvent;
    public final C145425nG saveDraftToastEvent;
    public final C45927I0t<C5SM> uiElements;

    public EditCapCutState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditCapCutState copy$default(EditCapCutState editCapCutState, C45927I0t c45927I0t, AbstractC26082ALm abstractC26082ALm, C145425nG c145425nG, C45927I0t c45927I0t2, C145425nG c145425nG2, int i, Object obj) {
        if ((i & 1) != 0) {
            c45927I0t = editCapCutState.uiElements;
        }
        if ((i & 2) != 0) {
            abstractC26082ALm = editCapCutState.loadingEvent;
        }
        if ((i & 4) != 0) {
            c145425nG = editCapCutState.gotoGPPlayEvent;
        }
        if ((i & 8) != 0) {
            c45927I0t2 = editCapCutState.gotoCCEvent;
        }
        if ((i & 16) != 0) {
            c145425nG2 = editCapCutState.saveDraftToastEvent;
        }
        return editCapCutState.copy(c45927I0t, abstractC26082ALm, c145425nG, c45927I0t2, c145425nG2);
    }

    public final EditCapCutState copy(C45927I0t<C5SM> uiElements, AbstractC26082ALm<C76800UCe> loadingEvent, C145425nG gotoGPPlayEvent, C45927I0t<KS3> gotoCCEvent, C145425nG saveDraftToastEvent) {
        o.LJIIIZ(uiElements, "uiElements");
        o.LJIIIZ(loadingEvent, "loadingEvent");
        o.LJIIIZ(gotoGPPlayEvent, "gotoGPPlayEvent");
        o.LJIIIZ(gotoCCEvent, "gotoCCEvent");
        o.LJIIIZ(saveDraftToastEvent, "saveDraftToastEvent");
        return new EditCapCutState(uiElements, loadingEvent, gotoGPPlayEvent, gotoCCEvent, saveDraftToastEvent);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.uiElements, this.loadingEvent, this.gotoGPPlayEvent, this.gotoCCEvent, this.saveDraftToastEvent};
    }

    public final C45927I0t<KS3> getGotoCCEvent() {
        return this.gotoCCEvent;
    }

    public final C145425nG getGotoGPPlayEvent() {
        return this.gotoGPPlayEvent;
    }

    public final AbstractC26082ALm<C76800UCe> getLoadingEvent() {
        return this.loadingEvent;
    }

    public final C145425nG getSaveDraftToastEvent() {
        return this.saveDraftToastEvent;
    }

    public final C45927I0t<C5SM> getUiElements() {
        return this.uiElements;
    }

    public EditCapCutState(C45927I0t<C5SM> uiElements, AbstractC26082ALm<C76800UCe> loadingEvent, C145425nG gotoGPPlayEvent, C45927I0t<KS3> gotoCCEvent, C145425nG saveDraftToastEvent) {
        o.LJIIIZ(uiElements, "uiElements");
        o.LJIIIZ(loadingEvent, "loadingEvent");
        o.LJIIIZ(gotoGPPlayEvent, "gotoGPPlayEvent");
        o.LJIIIZ(gotoCCEvent, "gotoCCEvent");
        o.LJIIIZ(saveDraftToastEvent, "saveDraftToastEvent");
        this.uiElements = uiElements;
        this.loadingEvent = loadingEvent;
        this.gotoGPPlayEvent = gotoGPPlayEvent;
        this.gotoCCEvent = gotoCCEvent;
        this.saveDraftToastEvent = saveDraftToastEvent;
    }

    public /* synthetic */ EditCapCutState(C45927I0t c45927I0t, AbstractC26082ALm abstractC26082ALm, C145425nG c145425nG, C45927I0t c45927I0t2, C145425nG c145425nG2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C45927I0t(new C5SM(null, null, null, null, 31)) : c45927I0t, (i & 2) != 0 ? C26092ALw.LIZ : abstractC26082ALm, (i & 4) != 0 ? new C145425nG() : c145425nG, (i & 8) != 0 ? new C45927I0t(new KS3("", "", -1L)) : c45927I0t2, (i & 16) != 0 ? new C145425nG() : c145425nG2);
    }
}
