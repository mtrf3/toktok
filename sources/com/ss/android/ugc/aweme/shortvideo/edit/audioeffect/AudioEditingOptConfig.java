package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class AudioEditingOptConfig extends F9E {

    @InterfaceC65349Pkn("entrance_name")
    public final int entranceNameType;

    @InterfaceC65349Pkn("open_audio_editing_opt")
    public final boolean openOpt;

    @InterfaceC65349Pkn("audio_editing_panel_style")
    public final int panelStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioEditingOptConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.openOpt), Integer.valueOf(this.panelStyle), Integer.valueOf(this.entranceNameType)};
    }

    public AudioEditingOptConfig(boolean z, int i, int i2) {
        this.openOpt = z;
        this.panelStyle = i;
        this.entranceNameType = i2;
    }

    public /* synthetic */ AudioEditingOptConfig(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
