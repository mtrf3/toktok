package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86674Xzy extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends C86710Y1i>, C76800UCe> {
    public static final C86674Xzy LJLIL = new C86674Xzy();

    public C86674Xzy() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.7au] */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.7au] */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends C86710Y1i> c43i) {
        C86710Y1i c86710Y1i;
        ?? r10;
        Aweme aweme;
        ?? r11;
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        C43I<? extends C86710Y1i> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c86710Y1i = (C86710Y1i) c43i2.LIZ) != null) {
            VideoCLACaptionViewModel r4 = selectSubscribe.r4();
            r4.getClass();
            if (c86710Y1i instanceof Y1N) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CaptionSwitchFinishCallback, isSuccess:");
                Y1N y1n = (Y1N) c86710Y1i;
                LIZ.append(y1n.LIZ);
                LIZ.append(", groupID: ");
                LIZ.append(y1n.LIZJ);
                LIZ.append(", isOriginalCaption:");
                LIZ.append(r4.LJLLILLLL);
                C36922EeM.LIZLLL(4, "VideoCLACaptionVM", X1D.LIZIZ(LIZ));
                int i = y1n.LIZ;
                Boolean bool = r4.LLFF;
                if (bool != null) {
                    r11 = bool.booleanValue();
                } else {
                    r11 = 0;
                }
                boolean z = r4.LJZL;
                long elapsedRealtime = SystemClock.elapsedRealtime() - r4.LJZI;
                String str = y1n.LIZIZ;
                String str2 = y1n.LIZJ;
                String str3 = y1n.LIZLLL;
                String LIZ2 = C252099uv.LIZ(y1n.LJ);
                ?? LIZLLL = KNV.LIZLLL(LIZ2, "errorCode");
                LIZLLL.LJIIIZ("enter_from", str);
                LIZLLL.LJIIIZ("group_id", str2);
                LIZLLL.LJIIIZ("author_id", str3);
                LIZLLL.LIZLLL(i, "is_success");
                LIZLLL.LIZLLL(z ? 1 : 0, "is_first_switch");
                LIZLLL.LIZLLL(r11, "is_octr");
                if (i == 1) {
                    LIZLLL.LJ(elapsedRealtime, "duration");
                } else {
                    LIZLLL.LJI("error_code", LIZ2);
                }
                FMX.LJIIL("cla_caption_switch_language_success", LIZLLL.LIZ);
                if (r4.LJZL) {
                    r4.LJZL = false;
                }
            } else {
                int i2 = 0;
                if (c86710Y1i instanceof Y1M) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("CaptionLoadFinishCallback, isSuccess:");
                    Y1M y1m = (Y1M) c86710Y1i;
                    LIZ3.append(y1m.LIZ);
                    LIZ3.append(", groupID: ");
                    LIZ3.append(y1m.LIZJ);
                    LIZ3.append(", error_code:");
                    LIZ3.append(C252099uv.LIZ(y1m.LJ));
                    LIZ3.append(", isOriginalCaption:");
                    LIZ3.append(r4.LJLLILLLL);
                    C36922EeM.LIZLLL(4, "VideoCLACaptionVM", X1D.LIZIZ(LIZ3));
                    int i3 = y1m.LIZ;
                    Boolean bool2 = r4.LLFF;
                    if (bool2 != null) {
                        i2 = bool2.booleanValue();
                    }
                    String str4 = y1m.LIZIZ;
                    String str5 = y1m.LIZJ;
                    String str6 = y1m.LIZLLL;
                    String LIZ4 = C252099uv.LIZ(y1m.LJ);
                    C188727au LIZLLL2 = KNV.LIZLLL(LIZ4, "errorCode");
                    LIZLLL2.LJIIIZ("enter_from", str4);
                    LIZLLL2.LJIIIZ("group_id", str5);
                    LIZLLL2.LJIIIZ("author_id", str6);
                    LIZLLL2.LIZLLL(i3, "is_success");
                    LIZLLL2.LIZLLL(i2, "is_octr");
                    if (i3 == 0) {
                        LIZLLL2.LJI("error_code", LIZ4);
                    }
                    FMX.LJIIL("cla_caption_load_success", LIZLLL2.LIZ);
                    if (r4.LL != -1) {
                        r4.LLD = SystemClock.elapsedRealtime() - r4.LL;
                        r4.LL = -1L;
                    }
                } else if (c86710Y1i instanceof Y17) {
                    Y17 y17 = (Y17) c86710Y1i;
                    if (y17.LIZ) {
                        long j = y17.LJFF;
                        Boolean bool3 = r4.LLFF;
                        if (bool3 != null) {
                            r10 = bool3.booleanValue();
                        } else {
                            r10 = 0;
                        }
                        int i4 = y17.LJIIJ;
                        Long valueOf = Long.valueOf(y17.LJ);
                        Integer valueOf2 = Integer.valueOf(y17.LJI);
                        Long valueOf3 = Long.valueOf(y17.LJII);
                        Long valueOf4 = Long.valueOf(y17.LJIIIIZZ);
                        Long valueOf5 = Long.valueOf(y17.LJIIIZ);
                        String str7 = y17.LIZIZ;
                        String str8 = y17.LIZJ;
                        String str9 = y17.LIZLLL;
                        ICLACaptionService LIZ5 = IQD.LIZ();
                        VideoItemParams gv0 = r4.gv0();
                        if (gv0 != null) {
                            aweme = gv0.getAweme();
                        } else {
                            aweme = null;
                        }
                        boolean LIZIZ = LIZ5.LIZIZ(aweme);
                        long j2 = r4.LLD;
                        ?? c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", str7);
                        c188727au.LJIIIZ("group_id", str8);
                        c188727au.LJIIIZ("author_id", str9);
                        c188727au.LJ(j, "load_duration");
                        c188727au.LIZLLL(r10, "is_octr");
                        c188727au.LJFF(valueOf, "duration");
                        c188727au.LJFF(valueOf2, "is_display_ontime");
                        c188727au.LJFF(valueOf3, "fst_display_position");
                        c188727au.LJFF(valueOf4, "fst_line_position");
                        c188727au.LJFF(valueOf5, "position_lag");
                        c188727au.LIZLLL(i4, "cla_pre_cache_size");
                        c188727au.LIZLLL(LIZIZ ? 1 : 0, "is_lazy_load");
                        c188727au.LJ(j2, "show_interval");
                        FMX.LJIIL("cla_caption_load_time", c188727au.LIZ);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
