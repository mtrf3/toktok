package com.ss.android.ugc.aweme.panel;

import X.AbstractC55082Lja;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C141335gf;
import X.C245249js;
import X.C3C5;
import X.C48480J0y;
import X.C50420Jqa;
import X.C51556KLg;
import X.C54496La8;
import X.C54502LaE;
import X.C54570LbK;
import X.C55096Ljo;
import X.C55274Lmg;
import X.C61878OQg;
import X.C61898ORa;
import X.C63202dw;
import X.C72972SkS;
import X.C76800UCe;
import X.C78685UuP;
import X.C79004UzY;
import X.C80796VnM;
import X.C84193Sd;
import X.C8TX;
import X.EnumC42934Gt8;
import X.EnumC54527Lad;
import X.FMX;
import X.InterfaceC2302191t;
import X.InterfaceC54499LaB;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import X.InterfaceC88471Ynr;
import X.LJ5;
import X.LJ6;
import X.LJA;
import X.LJK;
import X.LXL;
import X.M89;
import X.OQY;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.X1D;
import X.XKX;
import Y.IDiS271S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.api.NearbyBaseVAbility;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.NearbyInfo;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.placediscovery.ui.CategoryEntranceAbility;
import com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility;
import com.ss.android.ugc.aweme.ui.FeedNearbyFragment;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class NearbyFeedFragmentPanel extends FullFeedFragmentPanel implements InterfaceC54499LaB {
    public boolean LLIILZL;
    public FeedNearbyFragment LLIIZ;
    public LXL LLIL;
    public boolean LLILII;
    public int LLILIL;
    public long LLILL;
    public InterfaceC65784Pro<C76800UCe> LLILLIZIL;
    public boolean LLILLJJLI;
    public final AtomicInteger LLILLL;
    public C54570LbK LLILZ;

    public NearbyFeedFragmentPanel() {
        super("homepage_nearby", 7);
        this.LLIILZL = true;
        this.LLILIL = -1;
        this.LLILLL = new AtomicInteger(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void Ne() {
        super.Ne();
        if (getUserVisibleHint()) {
            Activity activity = this.activity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C84193Sd.LIZ((ActivityC45651qj) activity).tv0(false);
        }
        AbstractC55082Lja abstractC55082Lja = this.mAdapter;
        if (abstractC55082Lja != null && abstractC55082Lja.getCount() > 0) {
            if (getUserVisibleHint()) {
                stopPlayer();
            }
            this.mAdapter.setData(C61878OQg.INSTANCE);
            this.mAdapter.LJLLL = false;
            PlayButtonComponentTemp playButtonComponentTemp = this.playButtonComponentTemp;
            if (playButtonComponentTemp != null) {
                playButtonComponentTemp.es0();
            }
        }
        LJJZ();
        FeedNearbyFragment feedNearbyFragment = this.LLIIZ;
        if (feedNearbyFragment != null) {
            feedNearbyFragment.Y9();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void handlePageResume() {
        super.handlePageResume();
        if (this.mPageIsInvisible) {
            this.mPageIsInvisible = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageSelected() {
        String aid;
        super.onPageSelected();
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme == null || (aid = currentAweme.getAid()) == null) {
            return;
        }
        C54496La8.LJ.LIZJ(aid, 0);
        C54496La8.LIZIZ.incrementAndGet();
        ArrayList arrayList = (ArrayList) C54496La8.LIZJ;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            if (((Number) osz.getFirst()).intValue() <= C54496La8.LJ.LJFF()) {
                XKX.LIZLLL(C54496La8.LIZLLL, null, null, new C63202dw(osz, it, null), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void handlePageStop(boolean z) {
        super.handlePageStop(z);
        this.mPageIsInvisible = !this.mPageResumed;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0.LJI == true) goto L6;
     */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCleanModeChangedEvent(X.IKH r5) {
        /*
            r4 = this;
            X.LXS r0 = X.LXU.LIZ()
            r3 = 0
            if (r0 == 0) goto L22
            boolean r0 = r0.LJI
            r2 = 1
            if (r0 != r2) goto L22
        Lc:
            X.VnM r0 = r4.mViewPager
            if (r0 == 0) goto L24
            int r1 = r0.getChildCount()
        L14:
            if (r3 >= r1) goto L24
            X.2MA r0 = r4.getCurViewHolderByPosition(r3)
            if (r0 == 0) goto L1f
            r0.b2(r2)
        L1f:
            int r3 = r3 + 1
            goto L14
        L22:
            r2 = 0
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel.onCleanModeChangedEvent(X.IKH):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C245249js event) {
        Boolean bool;
        NearbyBaseVAbility nearbyBaseVAbility;
        o.LJIIIZ(event, "event");
        if (LJ5.LIZIZ) {
            boolean z = event.LJLIL;
            this.LLILLJJLI = z;
            if (z) {
                NearbyBaseVAbility nearbyBaseVAbility2 = (NearbyBaseVAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), CategoryEntranceAbility.class, null);
                if (nearbyBaseVAbility2 != null) {
                    nearbyBaseVAbility2.ia();
                    return;
                }
                return;
            }
            INearbyCategoryTabAbility iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), INearbyCategoryTabAbility.class, null);
            if (iNearbyCategoryTabAbility != null) {
                bool = Boolean.valueOf(iNearbyCategoryTabAbility.Q5());
            } else {
                bool = null;
            }
            if (!o.LJ(bool, Boolean.FALSE) || this.LLILLJJLI || (nearbyBaseVAbility = (NearbyBaseVAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), CategoryEntranceAbility.class, null)) == null) {
                return;
            }
            nearbyBaseVAbility.v20();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    @QD3
    public void onDislikeAwemeEvent(C55274Lmg event) {
        Boolean bool;
        NearbyBaseVAbility nearbyBaseVAbility;
        o.LJIIIZ(event, "event");
        super.onDislikeAwemeEvent(event);
        if (!LJ5.LIZIZ) {
            return;
        }
        if (event.LJLIL) {
            NearbyBaseVAbility nearbyBaseVAbility2 = (NearbyBaseVAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), CategoryEntranceAbility.class, null);
            if (nearbyBaseVAbility2 != null) {
                nearbyBaseVAbility2.ia();
                return;
            }
            return;
        }
        INearbyCategoryTabAbility iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), INearbyCategoryTabAbility.class, null);
        if (iNearbyCategoryTabAbility != null) {
            bool = Boolean.valueOf(iNearbyCategoryTabAbility.Q5());
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.FALSE) || this.LLILLJJLI || (nearbyBaseVAbility = (NearbyBaseVAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), CategoryEntranceAbility.class, null)) == null) {
            return;
        }
        nearbyBaseVAbility.v20();
    }

    @QD3
    public final void onFeedRefreshEvent(LJK ljk) {
        int i;
        if (ljk != null) {
            i = ljk.LJLIL;
        } else {
            i = -1;
        }
        this.LLILIL = i;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onRenderFirstFrame(String str) {
        super.onRenderFirstFrame(str);
        if (!this.LLILII) {
            this.LLILII = true;
            C54502LaE.LIZLLL("homepage_nearby", null, 6);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.LLILL));
            FMX.LJIIL("nearby_first_frame", linkedHashMap);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLILLIZIL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
        C51556KLg.LIZ.getClass();
        C51556KLg.LIZ().LJJJI(EnumC54527Lad.NEARBY, C8TX.NONE_FIRST_FRAME, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final BaseListFragmentPanel setParam(M89 param) {
        o.LJIIIZ(param, "param");
        super.setParam(param);
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void J5(List<? extends Aweme> list, boolean z) {
        String str;
        super.J5(list, z);
        Aweme aweme = null;
        if (!this.LLIILZL) {
            if (!C79004UzY.LJJIFFI(list)) {
                if (list != null) {
                    aweme = (Aweme) ListProtector.get(list, 0);
                }
                handlePageChange(aweme);
            }
            this.LLIILZL = false;
        }
        if (getUserVisibleHint()) {
            Activity activity = this.activity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C84193Sd.LIZ((ActivityC45651qj) activity).tv0(!C79004UzY.LJJIFFI(this.mAdapter.Q8()));
        }
        FeedNearbyFragment feedNearbyFragment = this.LLIIZ;
        if (feedNearbyFragment != null) {
            feedNearbyFragment.Y9();
        }
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme == null || (str = currentAweme.getAid()) == null) {
            str = "";
        }
        C48480J0y.LJII(str);
    }

    public final void LJLIIL(Aweme aweme, InterfaceC88471Ynr<? super Aweme, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        String str;
        Object LIZ;
        AnchorCommonStruct anchorCommonStruct;
        String str2;
        List LJI;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NearbyInfo nearbyInfo = aweme.nearbyInfo;
        String str3 = null;
        if (nearbyInfo != null) {
            str = nearbyInfo.getEventTrack();
        } else {
            str = null;
        }
        C78685UuP.LJJLIIIJILLIZJL(str, linkedHashMap);
        linkedHashMap.put("is_insert_personal_video", "1");
        try {
            LIZ = new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap)).toString();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str4 = (String) LIZ;
        if (str4 != null) {
            NearbyInfo nearbyInfo2 = aweme.nearbyInfo;
            if (nearbyInfo2 == null) {
                aweme.nearbyInfo = new NearbyInfo(str4, null, 2, null);
            } else {
                aweme.nearbyInfo = NearbyInfo.copy$default(nearbyInfo2, str4, null, 2, null);
            }
        }
        interfaceC88471Ynr.invoke(aweme, Integer.valueOf(this.LLILLL.get() + 1));
        int i = this.LLILLL.get() + 1;
        this.mAdapter.LJJJJ(i, aweme);
        this.mViewPager.LJJJ(i, true);
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        o.LJIIIIZZ(anchors, "aweme.anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.POI.getTYPE()) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C78685UuP.LJJLIIIJILLIZJL(anchorCommonStruct2.getExtra(), linkedHashMap2);
            Object obj2 = linkedHashMap2.get("poi_id");
            if (obj2 == null) {
                obj2 = "";
            }
            Set<String> stringSet = LJ6.LIZ.getStringSet("publish_landing_nearby_insert_awemes_poi", OQY.INSTANCE);
            o.LJIIIIZZ(stringSet, "INSTANCE.getStringSet(\"p…_awemes_poi\", emptySet())");
            Iterator<String> it2 = stringSet.iterator();
            while (true) {
                if (it2.hasNext()) {
                    str2 = it2.next();
                    List LJI2 = LJA.LJI(str2);
                    if (LJI2 != null) {
                        obj = ORZ.LJLLLLLL(0, LJI2);
                    } else {
                        obj = null;
                    }
                    if (o.LJ(obj, obj2)) {
                        break;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            String str5 = str2;
            if (str5 != null && (LJI = LJA.LJI(str5)) != null) {
                str3 = (String) ORZ.LJLLLLLL(1, LJI);
            }
        }
        String aid = aweme.getAid();
        String[] LIZIZ = LJ6.LIZIZ();
        StringBuilder LJFF = C72972SkS.LJFF(aid, '_');
        LJFF.append(System.currentTimeMillis());
        LJFF.append('_');
        LJFF.append(str3);
        LJ6.LIZ.storeStringArray("publish_landing_nearby_insert_awemes", (String[]) C61898ORa.LJJII(X1D.LIZIZ(LJFF), LIZIZ));
        LJA.LIZJ = aweme.getAid();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC223218pR
    public final void j0(List<? extends Aweme> list, boolean z) {
        super.j0(list, z);
        if (!z) {
            ILoadMoreAbility iLoadMoreAbility = this.loadMoreAbility;
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.showLoadMoreEmpty();
            }
            LXL lxl = this.LLIL;
            if (lxl != null) {
                lxl.Sf();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZ = (C54570LbK) view.findViewById(R.id.dde);
        C80796VnM c80796VnM = this.mViewPager;
        if (c80796VnM != null) {
            c80796VnM.LJI(new IDiS271S0100000_9(this, 7));
        }
        C51556KLg.LIZ.getClass();
        C51556KLg.LIZ().LJJJI(EnumC54527Lad.NEARBY, C8TX.FIRST_FRAME, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final AbstractC55082Lja createFeedPagerAdapter(final Context context, final LayoutInflater inflater, final InterfaceC72642tA<C50420Jqa> listener, final Fragment fragment, final View.OnTouchListener tapTouchListener, final BaseFeedPageParams baseFeedPageParams, final InterfaceC2302191t iHandlePlay) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        return new FullFeedPagerAdapter(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay) { // from class: X.3DH
            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final String LJJIJLIJ() {
                return "nearby_feed";
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final C55136LkS LJJJ() {
                return new C55136LkS(C3DI.LJLIL);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
                o.LJIIIZ(context, "context");
                o.LJIIIZ(inflater, "inflater");
                o.LJIIIZ(listener, "listener");
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(tapTouchListener, "tapTouchListener");
                o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
                o.LJIIIZ(iHandlePlay, "iHandlePlay");
            }
        };
    }
}
