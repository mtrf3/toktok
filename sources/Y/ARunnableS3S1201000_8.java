package Y;

import X.AbstractC73672Svk;
import X.C49128JPw;
import X.C50989Jzl;
import X.C62682Ois;
import X.EnumC47177IfN;
import X.IDP;
import X.IN5;
import X.InterfaceC46324IGa;
import X.InterfaceC86003Zc;
import X.JGJ;
import X.JP7;
import X.JQT;
import X.JQX;
import X.T16;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ARunnableS3S1201000_8 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        Map.Entry<Integer, JQX> entry;
        JQX jqx;
        Integer num;
        String str;
        JQT jqt = (JQT) this.l1;
        String str2 = this.s0;
        int i2 = this.i3;
        C49128JPw c49128JPw = (C49128JPw) this.l2;
        JQX LJIJJ = jqt.LJIJJ();
        Set<Map.Entry<Integer, JQX>> entrySet = jqt.LJJ().entrySet();
        o.LJIIIIZZ(entrySet, "holderMap.entries");
        Iterator<Map.Entry<Integer, JQX>> it = entrySet.iterator();
        while (true) {
            i = 0;
            if (it.hasNext()) {
                entry = it.next();
                Map.Entry<Integer, JQX> entry2 = entry;
                int LLJJJ = entry2.getValue().LLLLIIL().LLJJJ();
                Aweme currentAweme = entry2.getValue().LLLLIIL().getCurrentAweme();
                if (currentAweme == null || (str = currentAweme.getAid()) == null) {
                    str = "";
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("findAndPlayVideoAt pos #");
                LIZ.append(LLJJJ);
                LIZ.append(", aid ");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                if (o.LJ(str, str2) && LLJJJ == i2) {
                    break;
                }
            } else {
                entry = null;
                break;
            }
        }
        Map.Entry<Integer, JQX> entry3 = entry;
        if (entry3 == null || (jqx = entry3.getValue()) == null) {
            jqx = LJIJJ;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("findAndPlayVideoAt targetHolder: ");
        LIZ2.append(jqx);
        LIZ2.append(", firstPlayable: ");
        LIZ2.append(LJIJJ);
        X1D.LIZIZ(LIZ2);
        jqt.LJZI = false;
        if (jqx != null) {
            jqt.LJZL = true;
            if (jqx.LLLLIIL().LIZ() == 2 && C50989Jzl.LJI((Context) jqt.LJLJJI.getValue())) {
                JP7 LLLLIIL = jqx.LLLLIIL();
                if (c49128JPw != null && (num = c49128JPw.LIZ) != null) {
                    i = num.intValue();
                }
                if (str2 == null) {
                    str2 = "";
                }
                JGJ.LIZ(LLLLIIL.LJLLILLLL(i, str2));
            }
            jqt.LJJIJIL(jqx, null, null);
            if (c49128JPw != null) {
                jqx.f(c49128JPw);
            }
        }
    }

    public static final void run$0(ARunnableS3S1201000_8 aRunnableS3S1201000_8) {
        String requestId;
        IDP idp = (IDP) aRunnableS3S1201000_8.l1;
        final String str = aRunnableS3S1201000_8.s0;
        final int i = aRunnableS3S1201000_8.i3;
        Aweme aweme = (Aweme) aRunnableS3S1201000_8.l2;
        idp.getClass();
        System.currentTimeMillis();
        String str2 = idp.LJLJI;
        int i2 = idp.LJLJJI;
        if (aweme == null) {
            requestId = IN5.LIZJ(idp.LJJJ());
        } else {
            requestId = aweme.getRequestId();
        }
        C62682Ois.LIZ(str2, i2, str, i, aweme, requestId);
        if (TextUtils.equals("from_follow_often_watch", idp.LJLJJL)) {
            final int i3 = idp.LJLJJI;
            AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.JkS
                @Override // X.InterfaceC86003Zc
                public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                    int i4 = i3;
                    String str3 = str;
                    int i5 = i;
                    try {
                        if (i4 != 14000) {
                            C36922EeM.LIZ(new IllegalArgumentException("wrong pageType argument"));
                        } else {
                            AwemeStatsApi.LIZ.awemeFastStatsReport(str3, 21, i5, "").get();
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        interfaceC73573Su9.onComplete();
                        throw th;
                    }
                    interfaceC73573Su9.onComplete();
                }
            }).LJJL(T16.LIZ()).LJJJJZ();
        }
    }

    public static final void run$1(ARunnableS3S1201000_8 aRunnableS3S1201000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS3S1201000_8.l1;
            if (onUIPlayListener instanceof InterfaceC46324IGa) {
                ((InterfaceC46324IGa) onUIPlayListener).y30();
            }
            OnUIPlayListener onUIPlayListener2 = (OnUIPlayListener) aRunnableS3S1201000_8.l1;
            if (onUIPlayListener2 != null) {
                onUIPlayListener2.onVideoBitrateChanged(aRunnableS3S1201000_8.s0, (EnumC47177IfN) aRunnableS3S1201000_8.l2, aRunnableS3S1201000_8.i3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S1201000_8 aRunnableS3S1201000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS3S1201000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayerInternalEvent(aRunnableS3S1201000_8.s0, aRunnableS3S1201000_8.i3, (JSONObject) aRunnableS3S1201000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS3S1201000_8 aRunnableS3S1201000_8) {
        boolean LIZ;
        try {
            aRunnableS3S1201000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S1201000_8(Object obj, String str, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i3 = i;
        this.l2 = obj2;
    }
}
