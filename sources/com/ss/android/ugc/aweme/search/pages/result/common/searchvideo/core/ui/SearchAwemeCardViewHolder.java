package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui;

import X.AbstractC49120JPo;
import X.AbstractC49155JQx;
import X.C020506f;
import X.C0A2;
import X.C10K;
import X.C113554cx;
import X.C16330kX;
import X.C16880lQ;
import X.C1AU;
import X.C1DF;
import X.C1JD;
import X.C221108m2;
import X.C227768wm;
import X.C45804HyK;
import X.C46442IKo;
import X.C46447IKt;
import X.C48880JGi;
import X.C48891JGt;
import X.C48892JGu;
import X.C48905JHh;
import X.C48946JIw;
import X.C48947JIx;
import X.C49128JPw;
import X.C49153JQv;
import X.C49187JSd;
import X.C49189JSf;
import X.C49196JSm;
import X.C49206JSw;
import X.C49369JZd;
import X.C49503Jbn;
import X.C49603JdP;
import X.C49621Jdh;
import X.C49636Jdw;
import X.C49823Jgx;
import X.C50321Joz;
import X.C50420Jqa;
import X.C50433Jqn;
import X.C50452Jr6;
import X.C50469JrN;
import X.C50605JtZ;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50653JuL;
import X.C50654JuM;
import X.C55457Lpd;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C68182ly;
import X.C72704Sg8;
import X.C76800UCe;
import X.C77119UOl;
import X.C77125UOr;
import X.C79234V7u;
import X.C80103VcB;
import X.InterfaceC46334IGk;
import X.InterfaceC48888JGq;
import X.InterfaceC49137JQf;
import X.InterfaceC49157JQz;
import X.InterfaceC88472Yns;
import X.JI9;
import X.JIB;
import X.JJG;
import X.JJK;
import X.JJQ;
import X.JLD;
import X.JLE;
import X.JLM;
import X.JLU;
import X.JN7;
import X.JQ2;
import X.JQ3;
import X.JQ4;
import X.JQ5;
import X.JQ6;
import X.JQ7;
import X.JQ8;
import X.JQA;
import X.JR0;
import X.JR9;
import X.JSL;
import X.JSM;
import X.JSO;
import X.JSX;
import X.JTI;
import X.JVD;
import X.JY2;
import X.OSZ;
import X.QD3;
import X.X1D;
import Y.AObjectS31S0000000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS44S0100000_8;
import Y.IDCListenerS245S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public class SearchAwemeCardViewHolder extends AbstractC49120JPo implements InterfaceC49157JQz, JR0, InterfaceC48888JGq, JJK, JSO {
    public List<? extends Aweme> LJLJJI;
    public boolean LJLJJL;
    public JLM LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    @Override // X.InterfaceC49157JQz
    public final /* synthetic */ void LJ() {
    }

    public int LJIILIIL() {
        return -1;
    }

    public int LJIILJJIL() {
        return 0;
    }

    public String LJIILLIIL() {
        return "";
    }

    public String LJIJ() {
        return "";
    }

    public String LJIJI() {
        return "";
    }

    public void LJJII(Aweme awemeScrollTo) {
        o.LJIIIZ(awemeScrollTo, "awemeScrollTo");
    }

    @Override // X.JR0
    public final boolean LJLILLLLZI() {
        return true;
    }

    @Override // X.InterfaceC49157JQz
    public final /* synthetic */ void LJLZ(int i, RecyclerView recyclerView) {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.JSO
    public final boolean LLLLLLL() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return false;
    }

    @Override // X.JSO
    public final int q() {
        return 20;
    }

    public final JJG LJIIJJI() {
        return (JJG) this.LJLJL.getValue();
    }

    public final C49153JQv LJIIZILJ() {
        return (C49153JQv) this.LJLLI.getValue();
    }

    @Override // X.JSO
    public final View a() {
        View view = this.LJLIL.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        return view;
    }

    @Override // X.InterfaceC49157JQz
    public final boolean LIZLLL() {
        if (JQ2.LIZ() == 4) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.JSO
    public final JSL h() {
        Object obj;
        C49189JSf jsx;
        int LIZ = JQ2.LIZ();
        if (LIZ != 1 && LIZ != 2) {
            if (LIZ != 3 && LIZ != 4) {
                obj = C48947JIx.LIZJ;
            } else {
                obj = JLE.LIZJ;
            }
        } else {
            obj = JLD.LIZJ;
        }
        if (o.LJ(obj, JLD.LIZJ)) {
            jsx = new C49189JSf();
        } else {
            jsx = new JSX(50.0f);
        }
        jsx.LJIIJ = new JQ3(this);
        return jsx;
    }

    @Override // X.InterfaceC48888JGq
    public final void onCreate() {
        LJIIZILJ().LJIIIZ = C49206JSw.class;
    }

    @Override // X.InterfaceC48888JGq
    public final void onPause() {
        LJIIZILJ().LJIIJ = true;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        JSM.LIZLLL(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C48891JGt.onDestroy(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C48891JGt.onResume(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C48891JGt.onStop(this);
    }

    public SearchAwemeCardViewHolder(JTI jti) {
        super(jti);
        SearchAwemeCardForUser searchAwemeCardForUser = (SearchAwemeCardForUser) this;
        this.LJLJL = C221108m2.LIZIZ(new AqS155S0200000_8(jti, searchAwemeCardForUser, 9));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS158S0100000_8(jti, 257));
        this.LJLJLJ = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS158S0100000_8(jti, 256));
        this.LJLJLLL = LIZIZ2;
        this.LJLL = C221108m2.LIZIZ(new AqS158S0100000_8(searchAwemeCardForUser, 259));
        this.LJLLI = C221108m2.LIZIZ(new AqS155S0200000_8(jti, searchAwemeCardForUser, 10));
        jti.itemView.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(searchAwemeCardForUser, 7));
        JR9 jr9 = jti.LJLJL;
        if (jr9 != null) {
            jr9.LIZIZ((ILynxSearchHorizontal.ActiveArea) LIZIZ2.getValue());
        }
        C68182ly.LIZ((C1AU) LIZIZ.getValue(), this);
    }

    public final void LJIIIZ(List<? extends Aweme> data) {
        o.LJIIIZ(data, "data");
        C48946JIw c48946JIw = LJIIJJI().LJLJJL;
        if (c48946JIw != null && c48946JIw.LIZIZ && !this.LJLJJL) {
            if (JQ2.LIZJ()) {
                new C80103VcB().LIZIZ(this.LJLIL.LJLILLLLZI);
            }
            C1JD.LJJJIL(EventBus.LIZJ(), this);
            this.LJLJJL = true;
        }
        LJII(data, LJIIJJI());
        this.LJLJJI = data;
        JJG LJIIJJI = LJIIJJI();
        LJIIJJI.getClass();
        LJIIJJI.LJLJJI = data;
        LJIIJJI.notifyDataSetChanged();
        LJIIJJI.LJLJJLL.LIZJ(new AObjectS31S0000000_8(8), data);
        C49369JZd.LIZ.getClass();
        C49369JZd.LJ(0, true, data);
        View view = this.LJLIL.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        JQA LIZ = JY2.LIZ(view);
        SearchAwemeCardForUser searchAwemeCardForUser = (SearchAwemeCardForUser) this;
        LIZ.LJJIIZ = new AqS174S0100000_8(searchAwemeCardForUser, 92);
        String listResultType = LJIILLIIL();
        o.LJIIIZ(listResultType, "listResultType");
        LIZ.LJJIIZI = listResultType;
        JQ6 provider = JQ6.LJLIL;
        o.LJIIIZ(provider, "provider");
        LIZ.LJJIJL = provider;
        JQ7 provider2 = JQ7.LJLIL;
        o.LJIIIZ(provider2, "provider");
        LIZ.LJJIJIL = provider2;
        JJG LJIIJJI2 = LJIIJJI();
        LJIIJJI2.getClass();
        LJIIJJI2.LJLILLLLZI = LIZ;
        JSM.LIZJ(this.LJLIL.LJLILLLLZI, this);
        if (C46447IKt.LJLJLJ) {
            JVD.LIZ(this.LJLIL.LJLILLLLZI, new AqS158S0100000_8(searchAwemeCardForUser, 258));
        }
    }

    public final void LJIIJ(Integer num) {
        JLU.LJFF();
        if (num != null) {
            LJIIZILJ().LJFF(num.intValue());
            LJIIZILJ().LJIIJ = false;
        } else {
            LJIIZILJ().LJIIJ = false;
            LJIIZILJ().LJI();
        }
    }

    @QD3
    public final void onBridgeEvent(JQ5 event) {
        Integer num;
        Rect rect;
        LinearLayoutManager linearLayoutManager;
        o.LJIIIZ(event, "event");
        JIB LJIIJ = C1DF.LJIIJ(this.LJLIL.itemView);
        if (LJIIJ != null) {
            int hashCode = LJIIJ.hashCode();
            Integer num2 = event.LJLILLLLZI;
            if (num2 == null || num2.intValue() != hashCode) {
                return;
            }
            int i = event.LJLIL;
            int i2 = 0;
            if (i != 1) {
                Integer num3 = null;
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    C0A2 layoutManager = this.LJLIL.LJLILLLLZI.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    C49128JPw c49128JPw = event.LJLJJL;
                    int paddingStart = this.LJLIL.LJLILLLLZI.getPaddingStart();
                    if (c49128JPw == null) {
                        return;
                    }
                    Integer num4 = c49128JPw.LIZ;
                    Integer num5 = c49128JPw.LIZIZ;
                    if (num4 == null || num5 == null) {
                        return;
                    }
                    int intValue = num5.intValue();
                    int intValue2 = num4.intValue();
                    if (linearLayoutManager != null) {
                        linearLayoutManager.LJFF(intValue2, intValue - paddingStart);
                    }
                    this.LJLIL.LJLILLLLZI.postDelayed(new ARunnableS44S0100000_8(this, 43), 200L);
                    return;
                }
                AbstractC49155JQx abstractC49155JQx = LJIIZILJ().LIZJ;
                if (abstractC49155JQx != null) {
                    num = Integer.valueOf(abstractC49155JQx.LIZ());
                    rect = abstractC49155JQx.LIZIZ();
                } else {
                    num = null;
                    rect = null;
                }
                if (C72704Sg8.LIZIZ(this.LJLIL.itemView, "itemView.context")) {
                    Context context = this.LJLIL.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    int LJJJJL = C63081OpJ.LJJJJL(context);
                    if (rect != null) {
                        i2 = rect.right;
                    }
                    num3 = Integer.valueOf(LJJJJL - i2);
                } else if (rect != null) {
                    num3 = Integer.valueOf(rect.left);
                }
                InterfaceC88472Yns<C49128JPw, C76800UCe> interfaceC88472Yns = event.LJLJJI;
                if (interfaceC88472Yns == null) {
                    return;
                }
                interfaceC88472Yns.invoke(new C49128JPw(num, num3));
                return;
            }
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = event.LJLJI;
            if (interfaceC88472Yns2 == null) {
                return;
            }
            RecyclerView recyclerView = this.LJLIL.LJLILLLLZI;
            int childCount = recyclerView.getChildCount();
            if (recyclerView.getLayoutManager() == null || recyclerView.getChildCount() <= 0) {
                interfaceC88472Yns2.invoke(Boolean.FALSE);
                return;
            }
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != null) {
                    RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(childAt);
                    if (LJJJJJL instanceof JI9) {
                        JI9 ji9 = (JI9) LJJJJJL;
                        if (ji9.getBindingAdapterPosition() != -1 && ji9.isPlaying()) {
                            interfaceC88472Yns2.invoke(Boolean.TRUE);
                            return;
                        }
                    }
                    if (LJJJJJL instanceof UserPhotoHolder) {
                        UserPhotoHolder userPhotoHolder = (UserPhotoHolder) LJJJJJL;
                        if (userPhotoHolder.getBindingAdapterPosition() != -1 && userPhotoHolder.isPlaying()) {
                            interfaceC88472Yns2.invoke(Boolean.TRUE);
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            }
            interfaceC88472Yns2.invoke(Boolean.FALSE);
            return;
        }
        throw new IllegalStateException("Cannot find ContainerStatusProvider");
    }

    @QD3
    public final void onPlaybackEvent(JQ8 event) {
        o.LJIIIZ(event, "event");
        if (!((C1AU) this.LJLJLJ.getValue()).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            return;
        }
        int i = event.LJLIL;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            JLU.LJFF();
            return;
        }
        LJIIJ(null);
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        Fragment LJIIIZ;
        o.LJIIIZ(event, "event");
        if (!C16330kX.LIZIZ(this.LJLIL.itemView) || event.LJLJLJ != 65458) {
            return;
        }
        int i = 0;
        if ((!C46442IKo.LIZIZ() || (LJIIIZ = C79234V7u.LJIIIZ(this.LJLIL.itemView)) == null || LJIIIZ.getUserVisibleHint()) && event.LJLIL == 66) {
            Object obj = event.LJLILLLLZI;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme = (Aweme) obj;
            if (C46447IKt.LJLJLJ) {
                LJJIFFI(aweme, !event.LJLL, event.LJLJJLL, event.LJLJLLL);
                return;
            }
            if (!TextUtils.equals(JJG.LJLJLLL, aweme.getAid())) {
                LJJI(event, aweme);
            }
            List<? extends Aweme> list = this.LJLJJI;
            if (list != null) {
                Iterator<? extends Aweme> it = list.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next().getAid(), aweme.getAid())) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            LJJIFFI(aweme, !event.LJLL, event.LJLJJLL, event.LJLJLLL);
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS12S0101000_8(i, this, 18), 500L);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        JSM.LJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public final Bundle LJIIL(View view, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(view, "view");
        JQA LIZ = JY2.LIZ(view);
        String str = "general_search";
        if (!TextUtils.equals(LIZ.LJFF, "general_search")) {
            str = "search_result";
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_no_request");
        bundle.putString("enter_from", str);
        bundle.putString("search_keyword", LIZ.LJ);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", LJIILIIL());
        bundle.putString("search_id", LIZ.LJII);
        bundle.putString("list_item_id", aweme.getAid());
        bundle.putString("search_result_id", aweme.getAuthorUid());
        bundle.putString("playlist_search_id", LIZ.LJII);
        bundle.putString("key_search_type", LIZ.LIZJ);
        bundle.putInt("is_from_video", 2);
        if (!aweme.isLive() && !aweme.isAd()) {
            bundle.putString("search_enter_position", "video");
        }
        return bundle;
    }

    @Override // X.JSO
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        JSM.LIZIZ(this, aweme, c49196JSm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r8 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.JN8 LJJ(com.ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.Integer r9) {
        /*
            r7 = this;
            X.JTI r0 = r7.LJLIL
            android.view.View r1 = r0.itemView
            java.lang.String r0 = "viewHolder.itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.JQA r1 = X.JY2.LIZ(r1)
            X.Ol8 r0 = r7.LJLJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel r0 = (com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel) r0
            r3 = 0
            if (r0 == 0) goto Ld4
            java.lang.String r0 = r0.jv0()
        L1c:
            r1.LIZ(r0)
            X.JN8 r2 = X.JND.LIZIZ(r1)
            java.lang.String r1 = r7.LJIJI()
            java.lang.String r0 = "token_type"
            r2.LJIIZILJ(r0, r1)
            java.lang.String r0 = r7.LJIILLIIL()
            java.lang.String r5 = "list_result_type"
            r2.LJIIZILJ(r5, r0)
            java.lang.String r1 = r7.LJIJ()
            java.lang.String r0 = "search_result_id"
            r2.LJIJ(r0, r1)
            if (r8 == 0) goto Ld1
            java.lang.String r0 = r8.getAid()
        L44:
            java.lang.String r6 = "list_item_id"
            r2.LJIIZILJ(r6, r0)
            int r0 = r7.LJIILJJIL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LJJIIJ(r0)
            r2.LJJIII(r9)
            if (r8 == 0) goto Lcf
            java.lang.String r1 = r8.getDesc()
        L5d:
            java.lang.String r0 = "aladdin_words"
            r2.LIZLLL(r0, r1)
            java.lang.String r0 = "1"
            r2.LJJIIJZLJL(r0)
            r4 = 1
            if (r8 == 0) goto Lcd
            boolean r0 = r8.isLive()
            if (r0 != r4) goto L90
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.getAuthor()
            if (r0 == 0) goto Lcb
            long r0 = X.C78934UyQ.LJIILJJIL(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L7e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.LJIIZILJ(r6, r0)
            java.lang.String r0 = "live"
            r2.LJIIZILJ(r5, r0)
            r2.LJJIIZ(r8)
            r2.LJJIIZI(r8)
        L90:
            boolean r0 = r8.isPhotoMode()
            if (r0 != r4) goto L9d
            java.lang.String r0 = "photo"
            r2.LJIIZILJ(r5, r0)
            if (r8 == 0) goto Lcd
        L9d:
            int r0 = r8.getAwemeType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        La5:
            r2.LJIL(r0)
            if (r8 == 0) goto Lbe
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r8.getPhotoModeImageInfo()
            if (r0 == 0) goto Lbe
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto Lbe
            int r0 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        Lbe:
            r2.LJJ(r3)
            java.lang.String r1 = X.JJQ.LIZ(r8)
            java.lang.String r0 = "video_tag"
            r2.LIZLLL(r0, r1)
            return r2
        Lcb:
            r0 = r3
            goto L7e
        Lcd:
            r0 = r3
            goto La5
        Lcf:
            r1 = r3
            goto L5d
        Ld1:
            r0 = r3
            goto L44
        Ld4:
            r0 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder.LJJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer):X.JN8");
    }

    public void LJJI(C50420Jqa event, Aweme awemeScrollTo) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(awemeScrollTo, "awemeScrollTo");
        List<? extends Aweme> list = this.LJLJJI;
        o.LJI(list);
        Iterator<? extends Aweme> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().getAid(), awemeScrollTo.getAid())) {
                if (i != -1) {
                    C0A2 layoutManager = this.LJLIL.LJLILLLLZI.getLayoutManager();
                    o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    ((LinearLayoutManager) layoutManager).LJFF(i, 0);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public void LJIJJ(Aweme aweme, View view, List<? extends Aweme> awemeList) {
        Fragment fragment;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(awemeList, "awemeList");
        C49823Jgx c49823Jgx = new C49823Jgx();
        c49823Jgx.LJIJJ(awemeList);
        JIB LJIIJ = C1DF.LJIIJ(view);
        if (LJIIJ != null) {
            fragment = LJIIJ.LIZ();
        } else {
            fragment = null;
        }
        String LJFF = C49603JdP.LJFF(fragment);
        if (LJFF == null) {
            LJFF = CardStruct.IStatusCode.DEFAULT;
        }
        String aid = aweme.getAid();
        c49823Jgx.LJZ = LJFF;
        c49823Jgx.LJZI = aid;
        C55457Lpd.LJLJJLL = c49823Jgx;
        Bundle LJIIL = LJIIL(view, aweme);
        C020506f LIZ = C020506f.LIZ(view, view.getWidth(), view.getHeight());
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//aweme/detail");
        buildRoute.withParam(LJIIL);
        buildRoute.withBundleAnimation(LIZ.LIZLLL());
        buildRoute.withParam("activity_has_activity_options", true);
        buildRoute.withParam("playlist_search_id", JY2.LIZ(view).LJII);
        buildRoute.withParam("key_search_type", JY2.LIZ(view).LIZJ);
        buildRoute.withParam("is_from_video", 2);
        buildRoute.open();
        C77125UOr.LJIJ(aweme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r9 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.JNB LJIL(com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.Integer r10, java.lang.String r11) {
        /*
            r8 = this;
            X.JTI r0 = r8.LJLIL
            android.view.View r1 = r0.itemView
            java.lang.String r0 = "viewHolder.itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.JQA r4 = X.JY2.LIZ(r1)
            X.Ol8 r0 = r8.LJLJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel r0 = (com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel) r0
            r1 = 0
            if (r0 == 0) goto Lf9
            java.lang.String r0 = r0.jv0()
        L1c:
            r4.LIZ(r0)
            X.JNB r2 = X.JND.LIZ(r4)
            java.lang.String r3 = r8.LJIJI()
            java.lang.String r0 = "token_type"
            r2.LJIIZILJ(r0, r3)
            java.lang.String r0 = r8.LJIILLIIL()
            java.lang.String r5 = "list_result_type"
            r2.LJIIZILJ(r5, r0)
            java.lang.String r3 = r8.LJIJ()
            java.lang.String r0 = "search_result_id"
            r2.LJIJ(r0, r3)
            java.lang.String r3 = r4.LJIJ
            java.lang.String r0 = "user_tag"
            r2.LJIJ(r0, r3)
            java.lang.String r3 = r4.LJIIZILJ
            java.lang.String r0 = "user_list"
            r2.LJIIZILJ(r0, r3)
            if (r9 == 0) goto Lf6
            java.lang.String r0 = r9.getAid()
        L52:
            java.lang.String r7 = "list_item_id"
            r2.LJIIZILJ(r7, r0)
            r2.LJJIII(r10)
            if (r9 == 0) goto Lf3
            java.lang.String r3 = r9.getDesc()
        L60:
            java.lang.String r0 = "aladdin_words"
            r2.LIZLLL(r0, r3)
            java.lang.String r0 = "1"
            r2.LJJIIJZLJL(r0)
            java.lang.String r0 = "aladdin_button_type"
            r2.LJIIZILJ(r0, r11)
            X.JuJ r0 = X.C50652JuK.Companion
            r0.getClass()
            X.JuI r0 = X.C50651JuJ.LIZJ()
            if (r0 == 0) goto Lf1
            X.JrN r0 = r0.getSearchVideoModel()
            if (r0 == 0) goto Lf1
            java.lang.String r3 = r0.getGroupId()
        L84:
            java.lang.String r0 = "last_from_group_id"
            r2.LJIIZILJ(r0, r3)
            r6 = 1
            if (r9 == 0) goto Lef
            boolean r0 = r9.isLive()
            if (r0 != r6) goto Lb2
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            if (r0 == 0) goto Led
            long r3 = X.C78934UyQ.LJIILJJIL(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        La0:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.LJIIZILJ(r7, r0)
            java.lang.String r0 = "live"
            r2.LJIIZILJ(r5, r0)
            r2.LJJIIZ(r9)
            r2.LJJIIZI(r9)
        Lb2:
            boolean r0 = r9.isPhotoMode()
            if (r0 != r6) goto Lbf
            java.lang.String r0 = "photo"
            r2.LJIIZILJ(r5, r0)
            if (r9 == 0) goto Lef
        Lbf:
            int r0 = r9.getAwemeType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Lc7:
            r2.LJIL(r0)
            if (r9 == 0) goto Le0
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r9.getPhotoModeImageInfo()
            if (r0 == 0) goto Le0
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto Le0
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Le0:
            r2.LJJ(r1)
            java.lang.String r1 = X.JJQ.LIZ(r9)
            java.lang.String r0 = "video_tag"
            r2.LIZLLL(r0, r1)
            return r2
        Led:
            r0 = r1
            goto La0
        Lef:
            r0 = r1
            goto Lc7
        Lf1:
            r3 = r1
            goto L84
        Lf3:
            r3 = r1
            goto L60
        Lf6:
            r0 = r1
            goto L52
        Lf9:
            r0 = r1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder.LJIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, java.lang.String):X.JNB");
    }

    @Override // X.JJK
    public final void LIZIZ(int i, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
        C10K.LIZJ(new JQ4(this, aweme, i));
    }

    @Override // X.JJK
    public final void LIZJ(int i, View view, Aweme aweme, List<? extends Aweme> awemeList) {
        String str;
        Fragment fragment;
        String str2;
        Integer num;
        List<PhotoModeImageUrlModel> imageList;
        C50469JrN searchVideoModel;
        Fragment fragment2;
        String str3;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        Long l;
        String str8;
        String str9;
        C50469JrN searchVideoModel2;
        C49636Jdw searchSessionModel;
        C50433Jqn searchCommonModel;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(awemeList, "awemeList");
        if (!aweme.isLive() || C50452Jr6.LIZ()) {
            if (!aweme.isLive()) {
                JIB LJIIJ = C1DF.LJIIJ(view);
                if (LJIIJ != null) {
                    fragment2 = LJIIJ.LIZ();
                } else {
                    fragment2 = null;
                }
                C49603JdP.LJI(fragment2);
            }
            View view2 = this.LJLIL.itemView;
            o.LJIIIIZZ(view2, "viewHolder.itemView");
            C49621Jdh.LIZ(JY2.LIZ(view2));
            LJIJJ(aweme, view, awemeList);
            C77125UOr.LJIJ(aweme);
            if (!aweme.isLive()) {
                JQA LIZ = JY2.LIZ(view);
                if (TextUtils.equals(LIZ.LJFF, "general_search")) {
                    str = "general_search";
                } else {
                    str = "search_result";
                }
                JIB LJIIJ2 = C1DF.LJIIJ(view);
                if (LJIIJ2 != null) {
                    fragment = LJIIJ2.LIZ();
                } else {
                    fragment = null;
                }
                String LJFF = C49603JdP.LJFF(fragment);
                JN7 jn7 = new JN7(LIZ);
                jn7.LJJIJ(aweme);
                jn7.LJIIZILJ("group_id", C227768wm.LIZIZ(aweme));
                jn7.LJIJI(str);
                jn7.LJIIZILJ("search_keyword", LIZ.LJ);
                jn7.LJIIZILJ("enter_method", "aladdin_card");
                jn7.LJIIZILJ("video_tag", JJQ.LIZ(aweme));
                jn7.LJIIZILJ("search_id", C227768wm.LJIIZILJ(aweme));
                jn7.LJIIZILJ("log_pb", LIZ.LJIIJJI);
                jn7.LJIJ("search_result_id", aweme.getAuthorUid());
                jn7.LJIIZILJ("list_item_id", aweme.getAid());
                jn7.LJIIZILJ("search_type", LIZ.LIZJ);
                C50652JuK.Companion.getClass();
                C50650JuI LIZJ = C50651JuJ.LIZJ();
                if (LIZJ != null && (searchVideoModel = LIZJ.getSearchVideoModel()) != null) {
                    str2 = searchVideoModel.getGroupId();
                } else {
                    str2 = null;
                }
                jn7.LJIIZILJ("last_from_group_id", str2);
                jn7.LJIIZILJ("click_times", LJFF);
                jn7.LJIL(Integer.valueOf(aweme.getAwemeType()));
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    num = Integer.valueOf(imageList.size());
                } else {
                    num = null;
                }
                jn7.LJJ(num);
                jn7.LJIILIIL();
            }
        }
        C49503Jbn.LIZ(view, LJIJ(), i, null);
        Integer valueOf = Integer.valueOf(i);
        if (aweme.isLive()) {
            str3 = "click_live";
        } else if (aweme.isPhotoMode()) {
            str3 = "click_photo";
        } else {
            str3 = "click_video";
        }
        LJIL(aweme, valueOf, str3).LJIILIIL();
        C50652JuK.Companion.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view);
        if (LIZLLL != null) {
            i2 = LIZLLL.getTabIndex();
        } else {
            i2 = 0;
        }
        String LJII = C50605JtZ.LJII(i2);
        C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
        OSZ[] oszArr = new OSZ[18];
        oszArr[0] = new OSZ("token_type", LJIJI());
        oszArr[1] = new OSZ("is_aladdin", "1");
        oszArr[2] = new OSZ("list_result_type", LJIILLIIL());
        oszArr[3] = new OSZ("search_result_id", LJIJ());
        if (!aweme.isLive()) {
            str4 = aweme.getAid();
        } else {
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData == null || (str4 = Long.valueOf(newLiveRoomData.id).toString()) == null) {
                str4 = "";
            }
        }
        oszArr[4] = new OSZ("list_item_id", str4);
        oszArr[5] = new OSZ("is_from_video", "2");
        oszArr[6] = new OSZ("is_search_scene", "1");
        if (LIZLLL == null || (str5 = LIZLLL.getSearchKeyword()) == null) {
            str5 = "";
        }
        oszArr[7] = new OSZ("search_keyword", str5);
        oszArr[8] = new OSZ("search_type", LJII);
        if (LIZLLL == null || (str6 = LIZLLL.getSearchId()) == null) {
            str6 = "";
        }
        oszArr[9] = new OSZ("search_id", str6);
        C50650JuI LJI = C50651JuJ.LJI(view);
        if (LJI == null || (searchCommonModel = LJI.getSearchCommonModel()) == null || (str7 = searchCommonModel.getEnterFrom()) == null) {
            str7 = "";
        }
        oszArr[10] = new OSZ("search_entrance", str7);
        View view3 = this.LJLIL.itemView;
        o.LJIIIIZZ(view3, "viewHolder.itemView");
        oszArr[11] = new OSZ("search_rank", String.valueOf(JY2.LIZ(view3).LJIIL));
        C50650JuI LJI2 = C50651JuJ.LJI(view);
        if (LJI2 != null && (searchSessionModel = LJI2.getSearchSessionModel()) != null) {
            l = searchSessionModel.getSearchSessionId();
        } else {
            l = null;
        }
        oszArr[12] = new OSZ("search_session_id", String.valueOf(l));
        oszArr[13] = new OSZ("enter_from_merge", "general_search");
        String requestId = aweme.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        oszArr[14] = new OSZ("request_id", requestId);
        if (aweme.isLive()) {
            str8 = "live_cover";
        } else {
            str8 = "video_cell";
        }
        oszArr[15] = new OSZ("enter_method", str8);
        oszArr[16] = new OSZ("group_id", aweme.getAid());
        C50650JuI LJI3 = C50651JuJ.LJI(view);
        if (LJI3 == null || (searchVideoModel2 = LJI3.getSearchVideoModel()) == null || (str9 = searchVideoModel2.getGroupId()) == null) {
            str9 = "";
        }
        oszArr[17] = new OSZ("last_from_group_id", str9);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (aweme.isLive() && C50452Jr6.LIZ()) {
            LJJLIIIIJ.put("search_live_enter_method", "live_cover");
        }
        if (!aweme.isLive()) {
            C77119UOl.LJJIJ("search_enter_position", "hot_user_video");
        }
        c50654JuM.getClass();
        C50654JuM.LIZJ(LJJLIIIIJ, false);
    }

    public final void LJJIFFI(Aweme aweme, boolean z, long j, long j2) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AladdinAweme_");
        Activity LJIJJ = C45804HyK.LJIJJ(LJIIIIZZ());
        if (LJIJJ != null) {
            i = LJIJJ.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        String shareId = C48880JGi.LIZ(X1D.LIZIZ(LIZ), aweme.getAid());
        o.LJIIIIZZ(shareId, "shareId");
        C48892JGu.LIZIZ(aweme, z, shareId, j, j2);
    }
}
