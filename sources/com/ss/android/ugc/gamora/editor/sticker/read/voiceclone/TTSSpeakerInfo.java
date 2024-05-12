package com.ss.android.ugc.gamora.editor.sticker.read.voiceclone;

import X.HH1;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSSpeakerInfo {
    public ReadTextEffectSpeakerExtra LIZ;
    public Effect LIZIZ;

    @InterfaceC65349Pkn("build_status")
    public final String buildStatus;

    @InterfaceC65349Pkn("record_status")
    public final TTSRecordStatus recordStatus;

    @InterfaceC65349Pkn("speaker_id")
    public final String speakerId;

    @InterfaceC65349Pkn("stage")
    public final String stage;

    /* JADX WARN: Multi-variable type inference failed */
    public TTSSpeakerInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean LIZ() {
        String str = this.buildStatus;
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return o.LJ(lowerCase, "completed");
    }

    public final boolean LIZIZ() {
        String str = this.stage;
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return o.LJ(lowerCase, "private");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTSSpeakerInfo(String str, TTSRecordStatus tTSRecordStatus, String str2, String str3) {
        HH1.LIZ(str, "speakerId", str2, "stage", str3, "buildStatus");
        this.speakerId = str;
        this.recordStatus = tTSRecordStatus;
        this.stage = str2;
        this.buildStatus = str3;
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        this.LIZ = new ReadTextEffectSpeakerExtra(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr3, j, j, 8191, 0 == true ? 1 : 0);
        this.LIZIZ = new Effect(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TTSSpeakerInfo(String str, TTSRecordStatus tTSRecordStatus, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : tTSRecordStatus, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
