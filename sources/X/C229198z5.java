package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.8z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229198z5 {
    public static MixListResponse LIZ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static String LIZIZ(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            sb.append((String) it.next());
            if (i != arrayList.size() - 1) {
                sb.append(",");
            } else {
                sb.append("]");
            }
            i = i2;
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stringParam.toString()");
        return sb2;
    }

    public static void LIZ(final int i, final Activity activity, final Aweme aweme, final InterfaceC229218z7 listener, final String mixId, final String enterFrom, final String enterMethod, final boolean z) {
        String aid;
        String aid2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(mixId, "mixId");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i == EnumC228828yU.VIDEOADD.getOperation()) {
            if (aweme != null && (aid2 = aweme.getAid()) != null) {
                arrayList.add(aid2);
            }
        } else if (i == EnumC228828yU.VIDEOREMOVE.getOperation() && aweme != null && (aid = aweme.getAid()) != null) {
            arrayList2.add(aid);
        }
        MixFeedApi.LIZ.getClass();
        C229108yw.LIZ().manageMixFeed(i, mixId, "", LIZIZ(arrayList), LIZIZ(arrayList2), "").LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new InterfaceC64592gB() { // from class: X.8z3
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str;
                if (((BaseResponse) obj).status_code == 0) {
                    if (i == EnumC228828yU.VIDEOADD.getOperation()) {
                        C26045AKb c26045AKb = new C26045AKb(activity);
                        c26045AKb.LJIIIIZZ(R.string.bgi);
                        c26045AKb.LJIIJ();
                        listener.LIZ(true);
                        if (z) {
                            str = "create";
                        } else {
                            str = "add";
                        }
                        C228888ya.LIZ(1, enterFrom, enterMethod, mixId, str);
                        return;
                    }
                    C26045AKb c26045AKb2 = new C26045AKb(activity);
                    c26045AKb2.LJIIIIZZ(R.string.sel);
                    c26045AKb2.LJIIJ();
                    C228888ya.LJIILIIL(1, enterFrom, enterMethod, mixId);
                    if (activity instanceof MixVideoDetailActivity) {
                        C2U8.LIZ(new C2IX(aweme, null, false));
                        C2U8.LIZ(new C229208z6(aweme));
                        return;
                    } else {
                        listener.LIZIZ(true);
                        return;
                    }
                }
                if (i == EnumC228828yU.VIDEOADD.getOperation()) {
                    listener.LIZ(false);
                } else {
                    listener.LIZIZ(false);
                }
                C26045AKb c26045AKb3 = new C26045AKb(activity);
                c26045AKb3.LJIIIIZZ(R.string.rf3);
                c26045AKb3.LJIIJ();
            }
        }, new InterfaceC64592gB() { // from class: X.8z4
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                if (i == EnumC228828yU.VIDEOADD.getOperation()) {
                    listener.LIZ(false);
                } else {
                    listener.LIZIZ(false);
                }
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LJIIIIZZ(R.string.rf3);
                c26045AKb.LJIIJ();
            }
        });
    }
}
