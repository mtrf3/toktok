package X;

import Y.AfS62S0200000_13;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveMicVoiceSetting;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.TiA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75378TiA {
    public final C47061t0 LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public C73411SrX LIZLLL;
    public String LJ = "ttlive_sound_wavee_anim_low.webp";

    public final void LIZ(String fileName) {
        InterfaceC81252Vui interfaceC81252Vui;
        if (o.LJ("", fileName)) {
            this.LIZJ = true;
            return;
        }
        C29306Beo.LJJLJLI(this.LIZ);
        C81705W4v LIZJ = W5I.LIZJ();
        C47061t0 c47061t0 = this.LIZ;
        if (c47061t0 != null) {
            interfaceC81252Vui = c47061t0.getController();
        } else {
            interfaceC81252Vui = null;
        }
        LIZJ.LJIIL = interfaceC81252Vui;
        String str = "tiktok_live_interaction_demand_1";
        if (!Boolean.valueOf(this.LIZIZ).booleanValue()) {
            str = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1");
        } else if (!TextUtils.equals(fileName, "ttlive_voice_chat_sound_wave_high.webp")) {
            if (TextUtils.equals(fileName, "ttlive_voice_chat_sound_wave_medium.webp")) {
                str = "tiktok_live_interaction_normal_3";
            } else {
                str = "tiktok_live_interaction_normal_1";
            }
        }
        o.LJIIIZ(fileName, "fileName");
        LIZJ.LJII(C15510jD.LJIIIZ(str, fileName));
        LIZJ.LJII = new C75385TiH(this, fileName);
        LIZJ.LJIIJ = true;
        W4R LIZ = LIZJ.LIZ();
        C47061t0 c47061t02 = this.LIZ;
        if (c47061t02 == null) {
            return;
        }
        c47061t02.setController(LIZ);
    }

    public final boolean LIZIZ(int i) {
        String str;
        Boolean bool;
        boolean LJ;
        InterfaceC81252Vui controller;
        Animatable LIZ;
        this.LIZJ = false;
        SpeakingVoiceConfig value = LiveMicVoiceSetting.INSTANCE.getValue();
        if (i <= 20) {
            str = "";
        } else if (i <= value.getLow()) {
            if (Boolean.valueOf(this.LIZIZ).booleanValue()) {
                str = "ttlive_voice_chat_sound_wave_low.webp";
            } else {
                str = "ttlive_sound_wavee_anim_low.webp";
            }
        } else if (i > value.getLow() && i <= value.getHigh()) {
            if (Boolean.valueOf(this.LIZIZ).booleanValue()) {
                str = "ttlive_voice_chat_sound_wave_medium.webp";
            } else {
                str = "ttlive_sound_wavee_anim_medium.webp";
            }
        } else if (Boolean.valueOf(this.LIZIZ).booleanValue()) {
            str = "ttlive_voice_chat_sound_wave_high.webp";
        } else {
            str = "ttlive_sound_wavee_anim_high.webp";
        }
        this.LJ = str;
        C47061t0 c47061t0 = this.LIZ;
        if (c47061t0 != null && (controller = c47061t0.getController()) != null && (LIZ = controller.LIZ()) != null) {
            bool = Boolean.valueOf(LIZ.isRunning());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            LJ = o.LJ(this.LJ, "");
        } else {
            LIZ(this.LJ);
            LJ = o.LJ(this.LJ, "");
        }
        return !LJ;
    }

    public C75378TiA(C47061t0 c47061t0, boolean z) {
        this.LIZ = c47061t0;
        this.LIZIZ = z;
    }

    public final boolean LIZJ(int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (i <= 20) {
            if (this.LIZLLL != null) {
                return false;
            }
            this.LIZLLL = (C73411SrX) C265112h.LIZ(TMC.LJJI(1L, TimeUnit.SECONDS)).LJJJLIIL(new AfS62S0200000_13(interfaceC65784Pro, this, 18), new InterfaceC64592gB() { // from class: X.9Cv
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            return false;
        }
        C73411SrX c73411SrX = this.LIZLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
            this.LIZLLL = null;
            return true;
        }
        return true;
    }
}
