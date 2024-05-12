package Y;

import X.AbstractC029409q;
import X.AbstractC49114JPi;
import X.AbstractC50814Jww;
import X.AbstractC50848JxU;
import X.C0A2;
import X.C1DG;
import X.C1JD;
import X.C34X;
import X.C46446IKs;
import X.C46447IKt;
import X.C46936IbU;
import X.C48998JKw;
import X.C49006JLe;
import X.C49133JQb;
import X.C49178JRu;
import X.C49451Jax;
import X.C49475JbL;
import X.C49587Jd9;
import X.C49621Jdh;
import X.C49736JfY;
import X.C50322Jp0;
import X.C55096Ljo;
import X.C73994T2g;
import X.C78934UyQ;
import X.IXB;
import X.InterfaceC36571c5;
import X.InterfaceC49066JNm;
import X.InterfaceC49070JNq;
import X.InterfaceC65784Pro;
import X.JKG;
import X.JLU;
import X.JMC;
import X.JN1;
import X.JN8;
import X.JQA;
import X.JUK;
import X.KJI;
import X.KOV;
import X.KSB;
import X.KSE;
import X.X1D;
import X.XKQ;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.general.ECStoreLiveAssem;
import com.ss.android.ugc.aweme.general.ECStoreProductAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchCardCommonAbilityImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchCardMobAbilityImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoSugCell;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.simkit.impl.player.TextureViewHolder;
import com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public class IDCListenerS245S0100000_8 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            case 2:
                onViewAttachedToWindow$2(this, view);
                return;
            case 3:
                onViewAttachedToWindow$3(this, view);
                return;
            case 4:
                onViewAttachedToWindow$4(this, view);
                return;
            case 5:
                onViewAttachedToWindow$5(this, view);
                return;
            case 6:
                onViewAttachedToWindow$6(this, view);
                return;
            case 7:
                onViewAttachedToWindow$7(this, view);
                return;
            case 8:
                o.LJIIIZ(view, "v");
                return;
            case 9:
                onViewAttachedToWindow$9(this, view);
                return;
            case 10:
                onViewAttachedToWindow$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onViewAttachedToWindow$11(this, view);
                return;
            case 12:
                onViewAttachedToWindow$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onViewAttachedToWindow$13(this, view);
                return;
            case 14:
                onViewAttachedToWindow$14(this, view);
                return;
            case 15:
                onViewAttachedToWindow$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onViewAttachedToWindow$16(this, view);
                return;
            case 17:
                onViewAttachedToWindow$17(this, view);
                return;
            case 18:
                onViewAttachedToWindow$18(this, view);
                return;
            case 19:
                onViewAttachedToWindow$19(this, view);
                return;
            case 20:
                onViewAttachedToWindow$20(this, view);
                return;
            case 21:
                onViewAttachedToWindow$21(this, view);
                return;
            case 22:
                onViewAttachedToWindow$22(this, view);
                return;
            case 23:
                o.LJIIIZ(view, "view");
                return;
            case 24:
                o.LJIIIZ(view, "v");
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                o.LJIIIZ(view, "v");
                return;
            case 2:
                o.LJIIIZ(view, "v");
                return;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                return;
            case 4:
                o.LJIIIZ(view, "v");
                return;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                return;
            case 6:
                o.LJIIIZ(view, "v");
                return;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                return;
            case 8:
                onViewDetachedFromWindow$8(this, view);
                return;
            case 9:
                onViewDetachedFromWindow$9(this, view);
                return;
            case 10:
                o.LJIIIZ(view, "p0");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onViewDetachedFromWindow$11(this, view);
                return;
            case 12:
                onViewDetachedFromWindow$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onViewDetachedFromWindow$13(this, view);
                return;
            case 14:
                onViewDetachedFromWindow$14(this, view);
                return;
            case 15:
                onViewDetachedFromWindow$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onViewDetachedFromWindow$16(this, view);
                return;
            case 17:
                onViewDetachedFromWindow$17(this, view);
                return;
            case 18:
                onViewDetachedFromWindow$18(this, view);
                return;
            case 19:
                onViewDetachedFromWindow$19(this, view);
                return;
            case 20:
                onViewDetachedFromWindow$20(this, view);
                return;
            case 21:
                o.LJIIIZ(view, "v");
                return;
            case 22:
                onViewDetachedFromWindow$22(this, view);
                return;
            case 23:
                onViewDetachedFromWindow$23(this, view);
                return;
            case 24:
                onViewDetachedFromWindow$24(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS245S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        KOV kov = (KOV) iDCListenerS245S0100000_8.l0;
        kov.LJLJI = true;
        kov.LJLJJI = v;
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        C73994T2g.LJJII(C55096Ljo.LJIIZILJ((ECStoreLiveAssem) iDCListenerS245S0100000_8.l0), new AqS158S0100000_8((ECStoreLiveAssem) iDCListenerS245S0100000_8.l0, 86));
    }

    public static final void onViewAttachedToWindow$10(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View p0) {
        String LIZ;
        o.LJIIIZ(p0, "p0");
        Product product = ((KSE) iDCListenerS245S0100000_8.l0).LJLJJLL;
        if (product != null && (LIZ = product.LIZ()) != null) {
            KSE kse = (KSE) iDCListenerS245S0100000_8.l0;
            if (!kse.LJLJL.contains(LIZ)) {
                C49451Jax.LIZIZ(kse.LJLJJLL, kse.LJLILLLLZI, kse.LJLJI, kse.LJLJJI, "search_live_single_anchor");
                kse.LJLJL.add(LIZ);
            }
        }
    }

    public static final void onViewAttachedToWindow$11(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View p0) {
        String LIZ;
        o.LJIIIZ(p0, "p0");
        Product product = ((KSB) iDCListenerS245S0100000_8.l0).LJLLILLLL;
        if (product != null && (LIZ = product.LIZ()) != null) {
            KSB ksb = (KSB) iDCListenerS245S0100000_8.l0;
            if (!ksb.LJLLJ.contains(LIZ)) {
                C49451Jax.LIZIZ(ksb.LJLLILLLL, ksb.LJLIL, ksb.LJLILLLLZI, ksb.LJLJI, "search_live_merge_entrance");
                ksb.LJLLJ.add(LIZ);
            }
        }
    }

    public static final void onViewAttachedToWindow$12(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View view) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewAttachedToWindow:");
        LIZ.append(view);
        X1D.LIZIZ(LIZ);
    }

    public static final void onViewAttachedToWindow$13(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        JKG jkg = (JKG) iDCListenerS245S0100000_8.l0;
        InterfaceC36571c5 LJ = C1DG.LJ(jkg.itemView, "itemView.context");
        if ((LJ instanceof C34X) && (c34x = (C34X) LJ) != null) {
            c34x.registerActivityOnKeyDownListener(jkg.LLIIL);
        }
        if (C46447IKt.LJLJLJ) {
            return;
        }
        JKG jkg2 = (JKG) iDCListenerS245S0100000_8.l0;
        jkg2.LJLJLJ.LJII(jkg2.LLIIIL);
    }

    public static final void onViewAttachedToWindow$14(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        ((JUK) iDCListenerS245S0100000_8.l0).onAttachedToWindow();
    }

    public static final void onViewAttachedToWindow$15(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        EventBus.LIZJ().LJIILJJIL((AbstractC49114JPi) iDCListenerS245S0100000_8.l0);
    }

    public static final void onViewAttachedToWindow$16(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        ((AbstractC50814Jww) iDCListenerS245S0100000_8.l0).LIZ();
    }

    public static final void onViewAttachedToWindow$17(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View view) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onViewAttachedToWindow， surface = ");
            LIZ.append(((SurfaceViewWrapper) iDCListenerS245S0100000_8.l0).getSurface());
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ));
        }
    }

    public static final void onViewAttachedToWindow$18(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        String str;
        C34X c34x;
        o.LJIIIZ(v, "v");
        SearchPhotoHolder searchPhotoHolder = (SearchPhotoHolder) iDCListenerS245S0100000_8.l0;
        searchPhotoHolder.LLFF = true;
        if (true ^ C46446IKs.LJLJLJ) {
            JLU.LJII(searchPhotoHolder);
        }
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        Aweme aweme = searchPhotoHolder.LJLIL;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        concurrentHashMap.put(str, new WeakReference<>(searchPhotoHolder.LJLJL()));
        InterfaceC36571c5 LJ = C1DG.LJ(searchPhotoHolder.itemView, "itemView.context");
        if ((LJ instanceof C34X) && (c34x = (C34X) LJ) != null) {
            c34x.registerActivityOnKeyDownListener(searchPhotoHolder.LLIIIZ);
        }
    }

    public static final void onViewAttachedToWindow$19(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        ((AbstractC50848JxU) iDCListenerS245S0100000_8.l0).getClass();
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        C73994T2g.LJJII(C55096Ljo.LJIIZILJ((ECStoreProductAssem) iDCListenerS245S0100000_8.l0), new AqS158S0100000_8((ECStoreProductAssem) iDCListenerS245S0100000_8.l0, 87));
    }

    public static final void onViewAttachedToWindow$20(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        String str;
        C34X c34x;
        o.LJIIIZ(v, "v");
        SearchVideoHolder searchVideoHolder = (SearchVideoHolder) iDCListenerS245S0100000_8.l0;
        InterfaceC49066JNm interfaceC49066JNm = searchVideoHolder.LLJJI;
        if (interfaceC49066JNm != null) {
            interfaceC49066JNm.onViewAttachedToWindow();
        }
        InterfaceC49070JNq interfaceC49070JNq = searchVideoHolder.LLJJIII;
        if (interfaceC49070JNq != null) {
            interfaceC49070JNq.onViewAttachedToWindow();
        }
        searchVideoHolder.LLILLL = true;
        if (true ^ C46446IKs.LJLJLJ) {
            JLU.LJII(searchVideoHolder);
        }
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        Aweme aweme = searchVideoHolder.LJLIL;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        concurrentHashMap.put(str, new WeakReference<>(searchVideoHolder.LJLJL()));
        InterfaceC36571c5 LJ = C1DG.LJ(searchVideoHolder.itemView, "itemView.context");
        if ((LJ instanceof C34X) && (c34x = (C34X) LJ) != null) {
            c34x.registerActivityOnKeyDownListener(searchVideoHolder.LLJJLIIIJLLLLLLLZ);
        }
    }

    public static final void onViewAttachedToWindow$21(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        String str;
        String str2;
        String str3;
        int i;
        InterfaceC65784Pro<? extends Map<String, String>> interfaceC65784Pro;
        Map<String, String> invoke;
        User author;
        User author2;
        User author3;
        User author4;
        o.LJIIIZ(v, "v");
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ((SearchCardLivePlayerAssem) iDCListenerS245S0100000_8.l0), ISearchContextAbility.class);
        C49006JLe c49006JLe = new C49006JLe();
        SearchCardLivePlayerAssem searchCardLivePlayerAssem = (SearchCardLivePlayerAssem) iDCListenerS245S0100000_8.l0;
        c49006JLe.LJIIZILJ("search_type", "general");
        c49006JLe.LJIJJ("live_cover");
        c49006JLe.LJIIZILJ("action_type", "click");
        Aweme aweme = searchCardLivePlayerAssem.LLIFFJFJJ;
        String str4 = null;
        if (aweme != null && (author4 = aweme.getAuthor()) != null) {
            str = Long.valueOf(C78934UyQ.LJIILJJIL(author4)).toString();
        } else {
            str = null;
        }
        c49006JLe.LJJII(str);
        Aweme aweme2 = searchCardLivePlayerAssem.LLIFFJFJJ;
        if (aweme2 != null && (author3 = aweme2.getAuthor()) != null) {
            str2 = author3.getUid();
        } else {
            str2 = null;
        }
        c49006JLe.LJIIZILJ("anchor_id", str2);
        Aweme aweme3 = searchCardLivePlayerAssem.LLIFFJFJJ;
        if (aweme3 != null && (author2 = aweme3.getAuthor()) != null) {
            str3 = Long.valueOf(C78934UyQ.LJIILJJIL(author2)).toString();
        } else {
            str3 = null;
        }
        c49006JLe.LJIIZILJ("room_id", str3);
        Aweme aweme4 = searchCardLivePlayerAssem.LLIFFJFJJ;
        if (aweme4 != null) {
            str4 = aweme4.getRequestId();
        }
        c49006JLe.LJIIZILJ("request_id", str4);
        Aweme aweme5 = searchCardLivePlayerAssem.LLIFFJFJJ;
        if (aweme5 != null && (author = aweme5.getAuthor()) != null) {
            i = author.getFollowStatus();
        } else {
            i = 0;
        }
        c49006JLe.LJJIII(i);
        C50322Jp0 LIZJ = iSearchContextAbility.If().LIZJ();
        c49006JLe.LJJIFFI(LIZJ.LJLJI);
        c49006JLe.LJIIZILJ("search_keyword", LIZJ.LJLJJI);
        C48998JKw c48998JKw = (C48998JKw) searchCardLivePlayerAssem.LLFF.getValue();
        if (c48998JKw != null && (interfaceC65784Pro = c48998JKw.LJLIL) != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            c49006JLe.LJIILLIIL(invoke);
        }
        c49006JLe.LJIILIIL();
    }

    public static final void onViewAttachedToWindow$22(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        C0A2 layoutManager;
        AbstractC029409q adapter;
        o.LJIIIZ(v, "v");
        int[] iArr = new int[2];
        RecyclerView recyclerView = (RecyclerView) iDCListenerS245S0100000_8.l0;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (adapter instanceof KJI)) {
            iArr = ((KJI) adapter).LJLJJI;
        }
        RecyclerView recyclerView2 = (RecyclerView) iDCListenerS245S0100000_8.l0;
        if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).LJFF(iArr[0], iArr[1]);
        }
    }

    public static final void onViewAttachedToWindow$3(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        Iterator it = ((ArrayList) ((SearchCardCommonAbilityImpl) iDCListenerS245S0100000_8.l0).LJLJI.getValue()).iterator();
        while (it.hasNext()) {
            ((View.OnAttachStateChangeListener) it.next()).onViewAttachedToWindow(v);
        }
    }

    public static final void onViewAttachedToWindow$4(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        JN8 jn8 = new JN8(null);
        SearchCardMobAbilityImpl searchCardMobAbilityImpl = (SearchCardMobAbilityImpl) iDCListenerS245S0100000_8.l0;
        C50322Jp0 LIZJ = searchCardMobAbilityImpl.LJLJI.If().LIZJ();
        jn8.LJJIFFI(LIZJ.LJLJI);
        jn8.LJIIZILJ("search_keyword", LIZJ.LJLJJI);
        C49587Jd9 LIZJ2 = searchCardMobAbilityImpl.LJLJI.ut0().LIZJ();
        jn8.LJIJI(LIZJ2.LJLJI);
        jn8.LJJI(Integer.valueOf(LIZJ2.LJLJJI));
        Map<String, String> map = searchCardMobAbilityImpl.LJLJJLL;
        if (map != null) {
            jn8.LJIILLIIL(map);
        } else {
            Map<String, String> map2 = searchCardMobAbilityImpl.LJLJJI;
            if (map2 != null) {
                jn8.LJIILLIIL(map2);
            }
        }
        jn8.LJIILIIL();
    }

    public static final void onViewAttachedToWindow$5(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        NextLiveData nextLiveData;
        o.LJIIIZ(v, "v");
        SearchTakoCardAssem searchTakoCardAssem = (SearchTakoCardAssem) iDCListenerS245S0100000_8.l0;
        if ((searchTakoCardAssem instanceof LifecycleOwner) && searchTakoCardAssem != null) {
            searchTakoCardAssem.getLifecycle().addObserver(searchTakoCardAssem.LLILZ);
            SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) searchTakoCardAssem.LLIL.getValue();
            if (searchGlobalViewModel != null && (nextLiveData = searchGlobalViewModel.LJLL) != null) {
                nextLiveData.observe(searchTakoCardAssem, searchTakoCardAssem.LLILZLL);
            }
            RecyclerView F4 = searchTakoCardAssem.F4();
            if (F4 != null) {
                F4.LJIIJJI(searchTakoCardAssem.LLILZIL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewAttachedToWindow$6(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        SearchTakoCardAbility searchTakoCardAbility;
        o.LJIIIZ(v, "v");
        JN1 jn1 = (JN1) ((SearchTakoSugCell) iDCListenerS245S0100000_8.l0).getItem();
        if (jn1 != null && (searchTakoCardAbility = (SearchTakoCardAbility) ((SearchTakoSugCell) iDCListenerS245S0100000_8.l0).LJLJL.getValue()) != null) {
            searchTakoCardAbility.XB(jn1);
        }
    }

    public static final void onViewAttachedToWindow$7(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        C1JD.LJJJIL(EventBus.LIZJ(), (SearchAwemeCardViewHolder) iDCListenerS245S0100000_8.l0);
    }

    public static final void onViewAttachedToWindow$9(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        JMC jmc = ((SearchMixLiveCardContentAssem) iDCListenerS245S0100000_8.l0).LLFII;
        if (jmc != null) {
            jmc.onViewAttachedToWindow();
        }
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        ((KOV) iDCListenerS245S0100000_8.l0).LJLJI = false;
    }

    public static final void onViewDetachedFromWindow$11(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View p0) {
        o.LJIIIZ(p0, "p0");
        ((KSB) iDCListenerS245S0100000_8.l0).getAnimHandler().removeCallbacks(((KSB) iDCListenerS245S0100000_8.l0).getShowRunnable());
        XKQ xkq = ((KSB) iDCListenerS245S0100000_8.l0).LJLZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    public static final void onViewDetachedFromWindow$12(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View view) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewDetachedFromWindow:");
        LIZ.append(view);
        X1D.LIZIZ(LIZ);
        ((TextureViewHolder) iDCListenerS245S0100000_8.l0).LIZ();
    }

    public static final void onViewDetachedFromWindow$13(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        JKG jkg = (JKG) iDCListenerS245S0100000_8.l0;
        InterfaceC36571c5 LJ = C1DG.LJ(jkg.itemView, "itemView.context");
        if ((LJ instanceof C34X) && (c34x = (C34X) LJ) != null) {
            c34x.unRegisterActivityOnKeyDownListener(jkg.LLIIL);
        }
        if (C46447IKt.LJLJLJ) {
            return;
        }
        JKG jkg2 = (JKG) iDCListenerS245S0100000_8.l0;
        jkg2.LJLJLJ.LJIIIIZZ(jkg2.LLIIIL);
    }

    public static final void onViewDetachedFromWindow$14(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        ((JUK) iDCListenerS245S0100000_8.l0).onDetachedFromWindow();
    }

    public static final void onViewDetachedFromWindow$15(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        EventBus.LIZJ().LJIJ((AbstractC49114JPi) iDCListenerS245S0100000_8.l0);
    }

    public static final void onViewDetachedFromWindow$16(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        ((AbstractC50814Jww) iDCListenerS245S0100000_8.l0).LIZIZ();
    }

    public static final void onViewDetachedFromWindow$17(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View view) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onViewDetachedFromWindow， surface = ");
            LIZ.append(((SurfaceViewWrapper) iDCListenerS245S0100000_8.l0).getSurface());
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ));
        }
        Surface surface = ((SurfaceViewWrapper) iDCListenerS245S0100000_8.l0).LJLIL.getHolder().getSurface();
        o.LJIIIZ(surface, "surface");
        C46936IbU.LIZ.remove(surface);
        Surface surface2 = ((SurfaceViewWrapper) iDCListenerS245S0100000_8.l0).LJLIL.getHolder().getSurface();
        o.LJIIIZ(surface2, "surface");
        C46936IbU.LIZJ.remove(surface2);
        Surface surface3 = ((SurfaceViewWrapper) iDCListenerS245S0100000_8.l0).LJLIL.getHolder().getSurface();
        o.LJIIIZ(surface3, "surface");
        C46936IbU.LIZIZ.remove(surface3);
        ((SurfaceViewWrapper) iDCListenerS245S0100000_8.l0).LJLJLLL = false;
    }

    public static final void onViewDetachedFromWindow$18(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        String str;
        C34X c34x;
        o.LJIIIZ(v, "v");
        SearchPhotoHolder searchPhotoHolder = (SearchPhotoHolder) iDCListenerS245S0100000_8.l0;
        searchPhotoHolder.LLFF = false;
        searchPhotoHolder.LLFFF = false;
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        Aweme aweme = searchPhotoHolder.LJLIL;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        concurrentHashMap.remove(str);
        if (!C46446IKs.LJLJLJ) {
            JLU.LJIIIIZZ(searchPhotoHolder);
        }
        searchPhotoHolder.LLLLLJLJLL();
        InterfaceC36571c5 LJ = C1DG.LJ(searchPhotoHolder.itemView, "itemView.context");
        if ((LJ instanceof C34X) && (c34x = (C34X) LJ) != null) {
            c34x.unRegisterActivityOnKeyDownListener(searchPhotoHolder.LLIIIZ);
        }
    }

    public static final void onViewDetachedFromWindow$19(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        ((AbstractC50848JxU) iDCListenerS245S0100000_8.l0).getClass();
    }

    public static final void onViewDetachedFromWindow$20(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        String str;
        C34X c34x;
        o.LJIIIZ(v, "v");
        SearchVideoHolder searchVideoHolder = (SearchVideoHolder) iDCListenerS245S0100000_8.l0;
        InterfaceC49066JNm interfaceC49066JNm = searchVideoHolder.LLJJI;
        if (interfaceC49066JNm != null) {
            interfaceC49066JNm.onViewDetachedFromWindow();
        }
        InterfaceC49070JNq interfaceC49070JNq = searchVideoHolder.LLJJIII;
        if (interfaceC49070JNq != null) {
            interfaceC49070JNq.onViewDetachedFromWindow();
        }
        searchVideoHolder.LLILLL = false;
        searchVideoHolder.LLILZ = false;
        ConcurrentHashMap<String, WeakReference<JQA>> concurrentHashMap = C49621Jdh.LJIJ;
        Aweme aweme = searchVideoHolder.LJLIL;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        concurrentHashMap.remove(str);
        if (!C46446IKs.LJLJLJ) {
            JLU.LJIIIIZZ(searchVideoHolder);
        }
        searchVideoHolder.LLLLLJLJLL();
        InterfaceC36571c5 LJ = C1DG.LJ(searchVideoHolder.itemView, "itemView.context");
        if ((LJ instanceof C34X) && (c34x = (C34X) LJ) != null) {
            c34x.unRegisterActivityOnKeyDownListener(searchVideoHolder.LLJJLIIIJLLLLLLLZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (0 != r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onViewDetachedFromWindow$22(Y.IDCListenerS245S0100000_8 r9, android.view.View r10) {
        /*
            java.lang.String r0 = "v"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.Object r0 = r9.l0
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            if (r0 == 0) goto L50
            X.09q r10 = r0.getAdapter()
            if (r10 == 0) goto L50
            boolean r0 = r10 instanceof X.KJI
            if (r0 == 0) goto L50
            X.KJI r10 = (X.KJI) r10
            r0 = 2
            int[] r9 = new int[r0]
            androidx.recyclerview.widget.RecyclerView r0 = r10.LJLILLLLZI
            X.0A2 r1 = r0.getLayoutManager()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            kotlin.jvm.internal.o.LJII(r1, r0)
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r0 = r1.LLIL()
            r8 = 0
            r9[r8] = r0
            X.0Ab r7 = X.AbstractC03050Ab.LIZ(r1, r8)
            java.util.List<com.ss.android.ugc.aweme.music.model.MusicTag> r0 = r10.LJLJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r6 = r0.size()
            int r5 = r7.LJIIJ()
            int r4 = r7.LJI()
            r3 = 1
            if (r6 <= 0) goto L66
            r2 = 1
        L46:
            androidx.recyclerview.widget.RecyclerView r0 = r10.LJLILLLLZI
            android.view.View r0 = r0.getChildAt(r8)
            if (r0 != 0) goto L51
        L4e:
            r10.LJLJJI = r9
        L50:
            return
        L51:
            int r1 = r7.LJ(r0)
            int r0 = r7.LIZIZ(r0)
            if (r1 >= r4) goto L64
            if (r0 <= r5) goto L64
            if (r1 < r5) goto L64
            if (r0 > r4) goto L64
            r9[r3] = r1
            goto L4e
        L64:
            int r8 = r8 + r2
            goto L67
        L66:
            r2 = 0
        L67:
            if (r8 == r6) goto L4e
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS245S0100000_8.onViewDetachedFromWindow$22(Y.IDCListenerS245S0100000_8, android.view.View):void");
    }

    public static final void onViewDetachedFromWindow$23(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View view) {
        o.LJIIIZ(view, "view");
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = ((C49475JbL) iDCListenerS245S0100000_8.l0).LJ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.Wc();
        }
        ((C49475JbL) iDCListenerS245S0100000_8.l0).LJ = null;
    }

    public static final void onViewDetachedFromWindow$24(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        C49133JQb.LIZ("qwwr", new Object[0]);
        ((C49178JRu) iDCListenerS245S0100000_8.l0).LJI();
    }

    public static final void onViewDetachedFromWindow$3(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        Iterator it = ((ArrayList) ((SearchCardCommonAbilityImpl) iDCListenerS245S0100000_8.l0).LJLJI.getValue()).iterator();
        while (it.hasNext()) {
            ((View.OnAttachStateChangeListener) it.next()).onViewDetachedFromWindow(v);
        }
    }

    public static final void onViewDetachedFromWindow$5(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        NextLiveData nextLiveData;
        o.LJIIIZ(v, "v");
        SearchTakoCardAssem searchTakoCardAssem = (SearchTakoCardAssem) iDCListenerS245S0100000_8.l0;
        if ((searchTakoCardAssem instanceof LifecycleOwner) && searchTakoCardAssem != null) {
            RecyclerView F4 = searchTakoCardAssem.F4();
            if (F4 != null) {
                F4.LJJLL(searchTakoCardAssem.LLILZIL);
            }
            SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) searchTakoCardAssem.LLIL.getValue();
            if (searchGlobalViewModel != null && (nextLiveData = searchGlobalViewModel.LJLL) != null) {
                nextLiveData.removeObserver(searchTakoCardAssem.LLILZLL);
            }
            searchTakoCardAssem.getLifecycle().removeObserver(searchTakoCardAssem.LLILZ);
        }
        ((SearchTakoCardAssem) iDCListenerS245S0100000_8.l0).B4().gv0().LIZIZ(Boolean.FALSE);
    }

    public static final void onViewDetachedFromWindow$7(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        C1JD.LJJJJ(EventBus.LIZJ(), (SearchAwemeCardViewHolder) iDCListenerS245S0100000_8.l0);
    }

    public static final void onViewDetachedFromWindow$8(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        C49736JfY.LIZ(((SearchJediMixFeedFragment) iDCListenerS245S0100000_8.l0).hashCode());
    }

    public static final void onViewDetachedFromWindow$9(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8, View v) {
        o.LJIIIZ(v, "v");
        JMC jmc = ((SearchMixLiveCardContentAssem) iDCListenerS245S0100000_8.l0).LLFII;
        if (jmc != null) {
            jmc.onViewDetachedFromWindow();
        }
    }
}
