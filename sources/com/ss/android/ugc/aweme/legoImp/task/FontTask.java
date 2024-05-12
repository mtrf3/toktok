package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C2057985v;
import X.C33778DNm;
import X.C47261Igj;
import X.C61330O5e;
import X.C61331O5f;
import X.C61589OFd;
import X.C61878OQg;
import X.C88087Yhf;
import X.C8HI;
import X.E3F;
import X.EE1;
import X.EE4;
import X.EE8;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import X.G4K;
import X.InterfaceC36076EDw;
import X.NJJ;
import X.OF6;
import X.OFY;
import Y.AObjectS22S0001000_6;
import Y.AObjectS23S0000000_6;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class FontTask implements EE1, InterfaceC36076EDw, EE8 {
    public long LJLIL = 500;

    @Override // X.EE8
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "FontTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EE1
    public final EFK type() {
        boolean z;
        if ((C33778DNm.LIZ() & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        EFK efk = (EFK) E3F.LIZJ("FontTask_idleOpt", new AObjectS22S0001000_6(1, 5), new AObjectS23S0000000_6(3), z);
        Objects.requireNonNull(efk);
        return efk;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        if (((Boolean) C88087Yhf.LJI.getValue()).booleanValue()) {
            return EE4.IO;
        }
        return EE4.CPU;
    }

    @Override // X.EE8
    public final long LJII() {
        return this.LJLIL;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE8
    public final void LIZLLL(Long l) {
        this.LJLIL = l.longValue();
    }

    @Override // X.EEY
    public final void run(Context ctx) {
        List fontPathList;
        if (!TextUtils.equals(SettingServiceImpl.LIZ().getCurrentI18nItem(EF7.LIZIZ()).getLanguage(), "th")) {
            C8HI LIZJ = C8HI.LIZJ();
            Map<String, String> map = OF6.LIZ;
            LIZJ.LJ(ctx, map);
            C61331O5f LIZ = C61331O5f.LIZ();
            if (ctx != null) {
                LIZ.getClass();
                LIZ.LIZIZ = C16880lQ.LLLLL(ctx);
            }
            LIZ.LIZ = map;
            NJJ.LIZLLL().LIZIZ(new C61330O5e());
        }
        o.LJIIIZ(ctx, "ctx");
        if (o.LJ(Locale.getDefault().getLanguage(), new Locale("th").getLanguage())) {
            fontPathList = C61878OQg.INSTANCE;
        } else {
            fontPathList = C47261Igj.LJJIJIIJI("font/TikTok-Display-Bold.otf", "font/TikTok-Display-Medium.otf", "font/TikTok-Display-Regular.otf", "font/TikTok-Text-Bold.otf", "font/TikTok-Text-Medium.otf", "font/TikTok-Text-Regular.otf");
        }
        synchronized (OFY.LIZ) {
            o.LJIIIZ(fontPathList, "fontPathList");
            C61589OFd.LIZ = null;
            ((LinkedHashMap) C61589OFd.LIZIZ).clear();
            C61589OFd.LIZJ(ctx, fontPathList);
        }
        int i = 0;
        SharedPreferences LIZIZ = F9J.LIZIZ(ctx, 0, "sp_dynamic_font");
        if (C2057985v.LIZ()) {
            i = LIZIZ.getInt("dynamic_font_mode", 0);
        }
        G4K.LIZ = i;
    }
}
