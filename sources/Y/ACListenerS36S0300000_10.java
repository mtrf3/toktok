package Y;

import X.AbstractC62647OiJ;
import X.C09K;
import X.C0RN;
import X.C165276eB;
import X.C16880lQ;
import X.C1791471i;
import X.C188727au;
import X.C26045AKb;
import X.C2NO;
import X.C32I;
import X.C37246Eja;
import X.C37247Ejb;
import X.C44694HgQ;
import X.C44938HkM;
import X.C45382HrW;
import X.C47261Igj;
import X.C5S1;
import X.C62488Ofk;
import X.C62490Ofm;
import X.C62628Oi0;
import X.C62629Oi1;
import X.C62631Oi3;
import X.C62632Oi4;
import X.C62634Oi6;
import X.C62829OlF;
import X.C62846OlW;
import X.C73969T1h;
import X.C76800UCe;
import X.C84763XOl;
import X.C9G8;
import X.EnumC62419Oed;
import X.FMX;
import X.InterfaceC62549Ogj;
import X.InterfaceC88472Yns;
import X.OP1;
import X.OP2;
import X.OP3;
import X.OXB;
import X.OXC;
import X.OXE;
import X.OXG;
import X.SY4;
import X.T16;
import X.V1B;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.n_project.opensdk_tt.ui.WebAuthActivity;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ACListenerS36S0300000_10 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS36S0300000_10 aCListenerS36S0300000_10, View view) {
        Handler handler;
        boolean z = false;
        ((C62829OlF) aCListenerS36S0300000_10.l0).getDownloadVideoCancelView().setVisibility(0);
        ((C62829OlF) aCListenerS36S0300000_10.l0).getDownloadVideoRetryView().setVisibility(8);
        C44938HkM.LJIILJJIL = false;
        Handler handler2 = (Handler) aCListenerS36S0300000_10.l1;
        if (handler2 != null && handler2.hasMessages(1) && (handler = (Handler) aCListenerS36S0300000_10.l1) != null) {
            handler.removeMessages(1);
        }
        C2NO videoDownloadClickListener = ((C62829OlF) aCListenerS36S0300000_10.l0).getVideoDownloadClickListener();
        if (videoDownloadClickListener != null) {
            if (((C45382HrW) aCListenerS36S0300000_10.l2) != null && C45382HrW.LJ) {
                z = true;
            }
            videoDownloadClickListener.LJLIIL(z);
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [X.Yns, X.Prl] */
    public static final void onClick$1(ACListenerS36S0300000_10 aCListenerS36S0300000_10, View view) {
        List<Integer> list;
        OXB oxb = (OXB) aCListenerS36S0300000_10.l0;
        if (oxb.LJLLI) {
            return;
        }
        OXC oxc = (OXC) aCListenerS36S0300000_10.l1;
        int adapterPosition = oxc.getAdapterPosition();
        MediaModel mediaModel = (MediaModel) aCListenerS36S0300000_10.l2;
        if (adapterPosition < 0 || oxb.LJLJLJ == null || (list = oxb.LJLJL) == null || adapterPosition >= ((ArrayList) list).size()) {
            return;
        }
        List<Integer> list2 = oxb.LJLJLJ;
        o.LJI(list2);
        int indexOf = ((ArrayList) list2).indexOf(Integer.valueOf(adapterPosition));
        String str = "";
        if (indexOf >= 0) {
            List<Integer> list3 = oxb.LJLJL;
            o.LJI(list3);
            ListProtector.set(list3, adapterPosition, -1);
            TextView textView = oxc.LJLILLLLZI;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = oxc.LJLILLLLZI;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.bnj);
            }
            View view2 = oxc.LJLJJI;
            if (view2 != null) {
                C09K.LIZ(view2, 0.0f, 300L).withEndAction(new ARunnableS13S0201000_10(adapterPosition, view2, oxb, 4)).start();
            }
            C62846OlW c62846OlW = oxc.LJLIL;
            if (c62846OlW != null) {
                c62846OlW.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300L).start();
            }
            List<OXE> list4 = oxb.LJLJLLL;
            if (list4 != null) {
                ListProtector.remove(list4, indexOf);
            }
            List<Integer> list5 = oxb.LJLJLJ;
            if (list5 != null) {
                ((ArrayList) list5).remove(Integer.valueOf(adapterPosition));
            }
            List<Integer> list6 = oxb.LJLJLJ;
            o.LJI(list6);
            int size = ((ArrayList) list6).size();
            while (indexOf < size) {
                List<Integer> list7 = oxb.LJLJLJ;
                o.LJI(list7);
                int intValue = ((Number) ListProtector.get(list7, indexOf)).intValue();
                if (intValue >= 0) {
                    List<Integer> list8 = oxb.LJLJL;
                    o.LJI(list8);
                    if (intValue < ((ArrayList) list8).size()) {
                        List<Integer> list9 = oxb.LJLJL;
                        o.LJI(list9);
                        ListProtector.set(list9, intValue, Integer.valueOf(indexOf));
                    }
                }
                if (size != oxb.LJLILLLLZI - 1) {
                    oxb.notifyItemChanged(intValue);
                }
                indexOf++;
            }
            if (size == oxb.LJLILLLLZI - 1) {
                oxb.notifyDataSetChanged();
            }
            ?? r1 = oxb.LJLLJ;
            if (r1 == 0) {
                return;
            }
            r1.invoke(oxb.LJLJLLL);
            return;
        }
        List<Integer> list10 = oxb.LJLJLJ;
        o.LJI(list10);
        int size2 = ((ArrayList) list10).size();
        int i = oxb.LJLILLLLZI;
        if (size2 >= i) {
            String string = oxb.LJLIL.getString(R.string.cqj, Integer.valueOf(i));
            o.LJIIIIZZ(string, "mContext.getString(R.str…s_at_most, mMaxSelectNum)");
            C5S1 c5s1 = new C5S1(oxb.LJLIL);
            c5s1.LIZLLL(string);
            c5s1.LJ();
            return;
        }
        long j = oxb.LJLJI;
        if (C44694HgQ.LJFF(mediaModel.fileLocalUriPath) > j) {
            String string2 = oxb.LJLIL.getString(R.string.sj, C165276eB.LIZ(j));
            o.LJIIIIZZ(string2, "mContext.getString(R.str…or_image_exceed, maxSize)");
            C5S1 c5s12 = new C5S1(C1791471i.LIZ);
            c5s12.LIZLLL(string2);
            c5s12.LJ();
            return;
        }
        if (oxb.LJLJLLL == null) {
            oxb.LJLJLLL = new ArrayList();
        }
        try {
            if (oxb.LJLJJI) {
                C37246Eja c37246Eja = C37247Ejb.LIZIZ;
                String uri = C44694HgQ.LJIIIIZZ(oxc.LJLJJL).toString();
                o.LJIIIIZZ(uri, "getFileUri(holder.mImageUrl).toString()");
                c37246Eja.getClass();
                String LIZ = OXG.LIZ(C37246Eja.LJ(uri));
                if (LIZ != null) {
                    str = LIZ;
                }
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
        List<OXE> list11 = oxb.LJLJLLL;
        if (list11 != null) {
            String uri2 = C44694HgQ.LJIIIIZZ(oxc.LJLJJL).toString();
            o.LJIIIIZZ(uri2, "getFileUri(holder.mImageUrl).toString()");
            ((ArrayList) list11).add(new OXE(uri2, str));
        }
        List<Integer> list12 = oxb.LJLJLJ;
        if (list12 != null) {
            ((ArrayList) list12).add(Integer.valueOf(adapterPosition));
        }
        List<Integer> list13 = oxb.LJLJLJ;
        o.LJI(list13);
        int size3 = ((ArrayList) list13).size() - 1;
        TextView textView3 = oxc.LJLILLLLZI;
        if (textView3 != null) {
            textView3.setText(String.valueOf(size3 + 1));
        }
        TextView textView4 = oxc.LJLILLLLZI;
        if (textView4 != null) {
            textView4.setBackgroundResource(R.drawable.bnk);
        }
        List<Integer> list14 = oxb.LJLJLJ;
        o.LJI(list14);
        int size4 = ((ArrayList) list14).size();
        List<Integer> list15 = oxb.LJLJL;
        o.LJI(list15);
        ListProtector.set(list15, adapterPosition, Integer.valueOf(size4 - 1));
        C62846OlW c62846OlW2 = oxc.LJLIL;
        if (c62846OlW2 != null) {
            c62846OlW2.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300L).withEndAction(new ARunnableS2S0102000_10(size4, oxb, adapterPosition, 3)).start();
        }
        View view3 = oxc.LJLJJI;
        if (view3 == null) {
            return;
        }
        view3.setAlpha(0.0f);
        view3.setVisibility(0);
        view3.animate().alpha(1.0f).setDuration(300L).start();
    }

    public static final void onClick$2(ACListenerS36S0300000_10 aCListenerS36S0300000_10, View view) {
        ((C62488Ofk) aCListenerS36S0300000_10.l0).LJLJI.LJIIIZ();
        ((InterfaceC62549Ogj) aCListenerS36S0300000_10.l1).LJIIIIZZ(((C62490Ofm) aCListenerS36S0300000_10.l2).LJLJJL);
    }

    public static final void onClick$3(ACListenerS36S0300000_10 aCListenerS36S0300000_10, View it) {
        int i;
        Activity LJIIIIZZ;
        Boolean LIZ = SharePrefCache.inst().getIsAwemePrivate().LIZ();
        o.LJIIIIZZ(LIZ, "inst().isAwemePrivate.cache");
        if (LIZ.booleanValue()) {
            o.LJIIIIZZ(it, "it");
            C26045AKb c26045AKb = new C26045AKb(it);
            c26045AKb.LJIIIZ(((AbstractC62647OiJ) aCListenerS36S0300000_10.l0).getContext().getString(R.string.pba));
            c26045AKb.LJIIJ();
            return;
        }
        int i2 = C62631Oi3.LIZ[C62629Oi1.LIZ.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 != 4 || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
                    return;
                }
                V1B.LJLJJL(((AbstractC62647OiJ) aCListenerS36S0300000_10.l0).LJLLLL);
                C62628Oi0.LJ((TuxIconView) aCListenerS36S0300000_10.l1, ((AbstractC62647OiJ) aCListenerS36S0300000_10.l0).LJLLLL, LJIIIIZZ);
                return;
            }
            if (!C62629Oi1.LJIIIIZZ) {
                ((AbstractC62647OiJ) aCListenerS36S0300000_10.l0).getClass();
                if (C62629Oi1.LJI || C62629Oi1.LJII) {
                    C62628Oi0.LJFF((TuxIconView) aCListenerS36S0300000_10.l1, (EnumC62419Oed) aCListenerS36S0300000_10.l2, true);
                    C62628Oi0.LIZLLL().storeBoolean("key_silent_share_lemon8", true);
                } else {
                    C62628Oi0.LIZLLL().storeBoolean("key_silent_share_lemon8", false);
                    Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ2 != null) {
                        C62634Oi6.LIZIZ = new C62632Oi4(LJIIIIZZ2, new AqS157S0200000_10((TuxIconView) aCListenerS36S0300000_10.l1, (EnumC62419Oed) aCListenerS36S0300000_10.l2, 30));
                        C16880lQ.LIZIZ(LJIIIIZZ2, new Intent(LJIIIIZZ2, (Class<?>) WebAuthActivity.class));
                    }
                }
            } else {
                C62628Oi0.LJFF((TuxIconView) aCListenerS36S0300000_10.l1, (EnumC62419Oed) aCListenerS36S0300000_10.l2, false);
                C62628Oi0.LIZLLL().storeBoolean("key_silent_share_lemon8", false);
            }
            ((AbstractC62647OiJ) aCListenerS36S0300000_10.l0).getClass();
            if (C62629Oi1.LJI || C62629Oi1.LJII) {
                i = 1;
            } else {
                i = 0;
            }
            ((AbstractC62647OiJ) aCListenerS36S0300000_10.l0).getClass();
            if ((!C62629Oi1.LJI && !C62629Oi1.LJII) || !C62629Oi1.LJIIIIZZ) {
                i3 = 0;
            }
            FMX.LJIIL("lemon8_share_icon_click", C0RN.LIZJ(i, "auth_status", i3, "share_status").LIZ);
            return;
        }
        V1B.LJLJJL(((AbstractC62647OiJ) aCListenerS36S0300000_10.l0).LJLLLL);
    }

    public static final void onClick$4(ACListenerS36S0300000_10 aCListenerS36S0300000_10, View view) {
        ((SY4) ((OP1) aCListenerS36S0300000_10.l0).LIZ(R.id.kpi)).setLoading(true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", ((OP1) aCListenerS36S0300000_10.l0).getMAweme().getAid());
        c188727au.LJIIIZ("author_id", ((OP1) aCListenerS36S0300000_10.l0).getMAweme().getAuthorUid());
        c188727au.LIZLLL(((OP1) aCListenerS36S0300000_10.l0).getMAweme().getAuthor().getFollowStatus(), "follow_status");
        FMX.LJIIL("filter_hashtag_click_submit", c188727au.LIZ);
        C9G8 mPresenter = ((OP1) aCListenerS36S0300000_10.l0).getMPresenter();
        List<OP3> list = ((OP1) aCListenerS36S0300000_10.l0).getMAdapter().LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((OP3) next).LIZIZ) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((OP3) it2.next()).LIZ);
        }
        AqS99S0300000_10 aqS99S0300000_10 = new AqS99S0300000_10((OP1) aCListenerS36S0300000_10.l0, (OP1) aCListenerS36S0300000_10.l1, (Context) aCListenerS36S0300000_10.l2, (InterfaceC88472Yns<? super View, C76800UCe>) 8);
        AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10((OP1) aCListenerS36S0300000_10.l0, (Context) aCListenerS36S0300000_10.l1, 37);
        mPresenter.getClass();
        mPresenter.LIZ(arrayList2, C47261Igj.LJJIJ(0), aqS99S0300000_10, aqS141S0200000_10);
        if (((OP1) aCListenerS36S0300000_10.l0).getShouldDislike()) {
            OP1 op1 = (OP1) aCListenerS36S0300000_10.l0;
            if (!op1.LJLJJL) {
                C9G8 mPresenter2 = op1.getMPresenter();
                String aid = ((OP1) aCListenerS36S0300000_10.l0).getMAweme().getAid();
                o.LJIIIIZZ(aid, "mAweme.aid");
                AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((OP1) aCListenerS36S0300000_10.l0, 455);
                OP2 onFailed = OP2.LJLIL;
                mPresenter2.getClass();
                o.LJIIIZ(onFailed, "onFailed");
                mPresenter2.LIZIZ().disLikeAweme(aid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0200000_10(aqS160S0100000_10, onFailed, 0), new AfS62S0100000_10(onFailed, 35));
            }
        }
    }

    public ACListenerS36S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
