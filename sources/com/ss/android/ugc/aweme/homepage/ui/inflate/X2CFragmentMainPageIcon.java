package com.ss.android.ugc.aweme.homepage.ui.inflate;

import X.C16880lQ;
import X.C35183DrP;
import X.C54113LLp;
import X.C63144OqK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.LOS;
import X.LUF;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class X2CFragmentMainPageIcon implements IFragmentMainPageIcon {
    public final Map<String, C54113LLp> LJLIL = new ConcurrentHashMap();
    public LUF LJLILLLLZI;
    public LOS LJLJI;
    public Integer LJLJJI;

    @Override // X.InterfaceC36101EEv
    public final int LIZIZ() {
        return R.style.ul;
    }

    @Override // X.EEY
    public final String key() {
        return "X2CFragmentMainPageIcon";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "inflate_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C63144OqK.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon
    public final boolean LJIIIZ() {
        return ((Boolean) C35183DrP.LIZJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC36101EEv
    public final Class<? extends Activity> LIZ() {
        return HomePageUIFrameServiceImpl.LIZ().getHomePageInflateActivityClass();
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final EnumC36103EEx triggerType() {
        return EnumC36103EEx.INFLATE;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon
    public final C54113LLp LJI(String tag) {
        o.LJIIIZ(tag, "tag");
        Map<String, C54113LLp> map = this.LJLIL;
        if (map != null) {
            C54113LLp c54113LLp = (C54113LLp) ((ConcurrentHashMap) map).remove(tag);
            if (c54113LLp != null && c54113LLp.getParent() != null) {
                ViewParent parent = c54113LLp.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                C16880lQ.LJLLL(c54113LLp, (ViewGroup) parent);
                return c54113LLp;
            }
            return c54113LLp;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:6:0x0009, B:8:0x000f, B:10:0x0013, B:11:0x002f, B:13:0x0035, B:15:0x0040, B:16:0x0051, B:19:0x0073, B:21:0x008e, B:23:0x0099, B:26:0x00a2, B:28:0x00a8, B:30:0x00b2, B:32:0x00c6, B:34:0x00cd, B:36:0x00d3, B:39:0x00dc, B:41:0x00e4, B:43:0x00ed, B:38:0x00f5, B:49:0x00f8, B:51:0x00fc, B:52:0x0104, B:56:0x0117, B:57:0x011e, B:59:0x012c), top: B:5:0x0009 }] */
    @Override // X.InterfaceC36101EEv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.app.Activity r9, android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon.LJFF(android.app.Activity, android.content.Context):void");
    }
}
