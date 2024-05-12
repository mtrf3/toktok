package X;

import android.os.SystemClock;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.7mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196097mn extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ SmartImageView LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C68322mC<Long> LJLJI;
    public final /* synthetic */ C7ML LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C196097mn(SmartImageView smartImageView, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C68322mC<Long> c68322mC, C7ML c7ml, int i) {
        super(0);
        this.LJLIL = smartImageView;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = c68322mC;
        this.LJLJJI = c7ml;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        EnumC196137mr enumC196137mr;
        String str;
        NowPostInfo nowPostInfo;
        Object tag = this.LJLIL.getTag();
        if (o.LJ(tag, "large_window")) {
            enumC196137mr = EnumC196137mr.LARGE_WINDOW;
        } else {
            if (o.LJ(tag, "small_window")) {
                enumC196137mr = EnumC196137mr.SMALL_WINDOW;
            }
            this.LJLILLLLZI.invoke();
            return C76800UCe.LIZ;
        }
        if (enumC196137mr != null) {
            C68322mC<Long> c68322mC = this.LJLJI;
            final C7ML c7ml = this.LJLJJI;
            final int i = this.LJLJJL;
            Long l = c68322mC.element;
            if (l != null) {
                final long longValue = l.longValue();
                if (C00F.LIZ(31744, 0, "now_feed_fps_opt", true) == 1) {
                    final EnumC196137mr enumC196137mr2 = enumC196137mr;
                    C10K.LIZJ(new Callable() { // from class: X.7mo
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String str2;
                            NowPostInfo nowPostInfo2;
                            String aid = C7ML.this.getAweme().getAid();
                            o.LJIIIIZZ(aid, "item.aweme.aid");
                            long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
                            EnumC196137mr enumC196137mr3 = enumC196137mr2;
                            Aweme aweme = C7ML.this.getAweme();
                            if (aweme == null || (nowPostInfo2 = aweme.nowPostInfo) == null || (str2 = nowPostInfo2.getNowMediaType()) == null) {
                                str2 = "post";
                            }
                            C196157mt.LIZ(aid, elapsedRealtime, enumC196137mr3, str2, C78847Ux1.LJJIJIL(C7ML.this), i);
                            return C76800UCe.LIZ;
                        }
                    });
                } else {
                    String aid = c7ml.getAweme().getAid();
                    o.LJIIIIZZ(aid, "item.aweme.aid");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
                    Aweme aweme = c7ml.getAweme();
                    if (aweme == null || (nowPostInfo = aweme.nowPostInfo) == null || (str = nowPostInfo.getNowMediaType()) == null) {
                        str = "post";
                    }
                    C196157mt.LIZ(aid, elapsedRealtime, enumC196137mr, str, C78847Ux1.LJJIJIL(c7ml), i);
                }
            }
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.invoke();
        return C76800UCe.LIZ;
    }
}
