package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.LpZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55453LpZ {
    public static final HashMap<String, InterfaceC50422Jqc> LIZ = new HashMap<>();
    public static final HashMap<String, C7U3> LIZIZ = new HashMap<>();

    public static InterfaceC51679KPz LIZ(JediViewModel jediViewModel, AbstractC51036K1g abstractC51036K1g, M89 m89) {
        if (LIZ.size() == 0) {
            Iterator it = ServiceManager.get().getServices(IDetailPageOperatorService.class).iterator();
            while (it.hasNext()) {
                HashMap<String, InterfaceC50422Jqc> LIZ2 = ((IDetailPageOperatorService) it.next()).LIZ();
                if (LIZ2 != null) {
                    LIZ.putAll(LIZ2);
                }
            }
        }
        InterfaceC50422Jqc interfaceC50422Jqc = LIZ.get("from_search_mix");
        if (interfaceC50422Jqc != null) {
            InterfaceC51679KPz LIZ3 = interfaceC50422Jqc.LIZ(m89, abstractC51036K1g, jediViewModel);
            if (LIZ3 != null) {
                return LIZ3;
            }
            return new KQC();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a7, code lost:
    
        if (r3.equals("from_profile_mix_list") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b1, code lost:
    
        if (r3.equals("from_search_playlist") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d2, code lost:
    
        if (r3.equals("from_effect_discover_tab") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01dc, code lost:
    
        if (r3.equals("from_sticker") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r3.equals("from_effect_discover_panel") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01e0, code lost:
    
        r0 = com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl.LJIIJ().LIZLLL(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (r3.equals("from_mix_detail_item") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b5, code lost:
    
        r1 = X.C55457Lpd.LJLJLJ;
        X.C55457Lpd.LJLJLJ = null;
        r0 = com.ss.android.ugc.aweme.mix.services.MixFeedService.LJJIJIIJIL().LJJIFFI(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        if (r3.equals("from_feeds_operate_optimized") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019d, code lost:
    
        if (r3.equals("from_inbox_sticker") == false) goto L24;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x006d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC51679KPz LIZIZ(X.M89 r5, X.AbstractC51036K1g r6, com.bytedance.jedi.arch.JediViewModel r7, androidx.fragment.app.Fragment r8) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55453LpZ.LIZIZ(X.M89, X.K1g, com.bytedance.jedi.arch.JediViewModel, androidx.fragment.app.Fragment):X.KPz");
    }
}
