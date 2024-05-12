package com.ss.android.ugc.aweme.services.superentrance;

import X.C2U8;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SuperEntranceEvent implements IEvent {
    public static final Companion Companion = new Companion();
    public String effectId;
    public String iconUrl;
    public boolean show;
    public String tab;
    public String tipText;
    public int type;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final String getTab() {
        return this.tab;
    }

    public final String getTipText() {
        return this.tipText;
    }

    public final int getType() {
        return this.type;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setTab(String str) {
        this.tab = str;
    }

    public final void setTipText(String str) {
        this.tipText = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public SuperEntranceEvent(int i, boolean z) {
        this.type = i;
        this.show = z;
    }
}
