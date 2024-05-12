package com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege;

import X.AbstractC73672Svk;
import X.B7K;
import X.BZI;
import X.C05170If;
import X.C06C;
import X.C06F;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29232Bdc;
import X.C29306Beo;
import X.C2A7;
import X.C30846C8s;
import X.C30965CDh;
import X.C30969CDl;
import X.C31556Ca0;
import X.C47061t0;
import X.C47131t7;
import X.C62705OjF;
import X.C72242sW;
import X.C77623UdH;
import X.C78895Uxn;
import X.C86447XwJ;
import X.CBN;
import X.CDG;
import X.CDP;
import X.CDQ;
import X.CDR;
import X.CDX;
import X.CDY;
import X.InterfaceC30853C8z;
import X.InterfaceC30972CDo;
import X.InterfaceC30977CDt;
import X.InterfaceC64592gB;
import X.ORS;
import X.ORZ;
import X.Q7L;
import X.T16;
import X.UFE;
import X.ViewOnClickListenerC30909CBd;
import X.ViewOnClickListenerC30967CDj;
import X.ViewOnClickListenerC30968CDk;
import X.ViewOnClickListenerC30974CDq;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS0S2110000_5;
import Y.AfS0S2400100_5;
import Y.AfS57S0100000_5;
import Y.IDLListenerS193S0100000_5;
import Y.IDrS45S0100000_5;
import Y.IDuS317S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.iap.model.response.iap.AbsIapPricing;
import com.bytedance.android.live.iap.model.response.iap.IapProductDetail;
import com.bytedance.android.live.iap.model.response.iap.IapSubscriptionProduct;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.bytedance.android.livesdk.chatroom.api.CommunityContent;
import com.bytedance.android.livesdk.chatroom.api.CommunityDetail;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.subscription.SubFirstAnniversaryUISetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailAboutMeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* loaded from: classes6.dex */
public final class SubscriptionPrivilegeDetailFragment extends LiveDialogFragment implements CDY, InterfaceC30853C8z, InterfaceC30977CDt {
    public static final /* synthetic */ int LLIIII = 0;
    public long LJLIL;
    public long LJLILLLLZI;
    public InterfaceC30972CDo LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public Room LJLJLLL;
    public GetSubPrivilegeDetailResponse.Data LJLL;
    public final CDG LJLLI;
    public int LJLLILLLL;
    public final List<CDP> LJLLJ;
    public CDP LJLLL;
    public float LJLLLL;
    public final List<Integer> LJLLLLLL;
    public int LJLZ;
    public long LJZ;
    public long LJZI;
    public TemplateInfo LJZL;
    public boolean LL;
    public C30969CDl LLD;
    public int LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final String LLFZ;
    public final Map<String, String> LLI;
    public final Map<Integer, Boolean> LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public final float LJLJI = 0.9f;
    public float LJLJJI = 0.6f;
    public final Map<String, String> LJLJJL = new LinkedHashMap();

    static {
        new CBN();
    }

    @Override // X.InterfaceC30977CDt
    public final void O2() {
        this.LL = true;
        C29306Beo.LJJJ(new AqS155S0100000_5(this, 353));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public SubscriptionPrivilegeDetailFragment() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        this.LJLJL = C29306Beo.LJJIFFI(bool);
        this.LJLJLJ = "";
        DataChannel dataChannel2 = this.dataChannel;
        this.LJLJLLL = dataChannel2 != null ? C29306Beo.LJJIJLIJ(dataChannel2) : null;
        this.LJLLI = new CDG(this);
        this.LJLLJ = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(-4);
        arrayList.add(8);
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        this.LJLLLLLL = arrayList;
        this.LJLZ = 2;
        this.LLF = C15380j0.LJIIJJI();
        this.LLFZ = "livesdk_subscription_privilege_page";
        this.LLI = new LinkedHashMap();
        this.LLIFFJFJJ = new LinkedHashMap();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1a);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 100;
        return c28507BGt;
    }

    public final void vl() {
        C30969CDl c30969CDl = this.LLD;
        if (c30969CDl != null) {
            int LLILL = c30969CDl.LLILL();
            int LLILLJJLI = c30969CDl.LLILLJJLI();
            int size = ((ArrayList) this.LJLLJ).size();
            for (int i = 0; i < size; i++) {
                if (LLILL <= i && i <= LLILLJJLI) {
                    View LJJIJIL = c30969CDl.LJJIJIL(i);
                    if (LJJIJIL == null) {
                        this.LLIFFJFJJ.put(Integer.valueOf(i), Boolean.FALSE);
                    } else {
                        int[] iArr = new int[2];
                        LJJIJIL.getLocationOnScreen(iArr);
                        if (iArr[1] >= this.LLF) {
                            this.LLIFFJFJJ.put(Integer.valueOf(i), Boolean.FALSE);
                        } else {
                            Object obj = ((LinkedHashMap) this.LLIFFJFJJ).get(Integer.valueOf(i));
                            Boolean bool = Boolean.TRUE;
                            if (!o.LJ(obj, bool)) {
                                CDP cdp = (CDP) ORZ.LJLLLLLL(i, this.LJLLJ);
                                if (cdp != null) {
                                    int i2 = cdp.LIZ;
                                    CDQ cdq = (CDQ) ((LinkedHashMap) CDR.LIZ).get(Integer.valueOf(i2));
                                    if (cdq != null) {
                                        String str = cdq.LJLJJI;
                                        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_intro_item_show");
                                        Al(LIZ);
                                        LIZ.LJIJJ(str, "privilege_page");
                                        LIZ.LJJIIJZLJL();
                                    }
                                }
                                this.LLIFFJFJJ.put(Integer.valueOf(i), bool);
                            }
                        }
                    }
                } else {
                    this.LLIFFJFJJ.put(Integer.valueOf(i), Boolean.FALSE);
                }
            }
        }
    }

    public final void wl() {
        int i;
        int i2;
        CommunityDetail communityDetail;
        List<CommunityContent> list;
        List<SpotlightItem> list2;
        ViewTreeObserver viewTreeObserver;
        GetSubPrivilegeDetailResponse.Data.SubscribePermission subscribePermission;
        OfferInfo offerInfo;
        GetSubPrivilegeDetailResponse.Data.SubNoteInfo subNoteInfo;
        if (!this.isViewValid) {
            return;
        }
        this.LLFF = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LJLILLLLZI = elapsedRealtime;
        long j = elapsedRealtime - this.LJLIL;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_intro_show");
        Al(LIZ);
        LIZ.LJIJJ(Long.valueOf(j), "load_duration");
        GetSubPrivilegeDetailResponse.Data data = this.LJLL;
        if (data != null && (subNoteInfo = data.subNoteInfo) != null && subNoteInfo.showNoteDetail) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i), "has_sub_note");
        GetSubPrivilegeDetailResponse.Data data2 = this.LJLL;
        if (data2 != null && data2.userBuyGiftSubAuth) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        UFE.LIZIZ(i2, LIZ, "is_sub_gift");
        GetSubPrivilegeDetailResponse.Data data3 = this.LJLL;
        if (data3 == null) {
            return;
        }
        ((C47131t7) _$_findCachedViewById(R.id.azj)).setRadius(C15380j0.LIZ(8.0f));
        ((C47131t7) _$_findCachedViewById(R.id.az3)).setRadius(C15380j0.LIZ(8.0f));
        ((C2A7) _$_findCachedViewById(R.id.az3)).LJJLL(R.style.a3a);
        C2A7 c2a7 = (C2A7) _$_findCachedViewById(R.id.az3);
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 348));
        }
        CanRechargeSetting canRechargeSetting = CanRechargeSetting.INSTANCE;
        if (canRechargeSetting.getValue() && (subscribePermission = data3.subscribePermission) != null && subscribePermission.canSubscribe) {
            _$_findCachedViewById(R.id.azk).setVisibility(8);
            ((C2A7) _$_findCachedViewById(R.id.azj)).setText(C15380j0.LJIILJJIL(R.string.odd));
            TemplateInfo templateInfo = this.LJZL;
            if (templateInfo != null && (offerInfo = templateInfo.offerInfo) != null) {
                Float valueOf = Float.valueOf(offerInfo.discountRate);
                float floatValue = valueOf.floatValue();
                if (floatValue > 0.0f && floatValue < 1.0f) {
                    valueOf.floatValue();
                    ((C2A7) _$_findCachedViewById(R.id.azj)).setText(C15380j0.LJIILJJIL(R.string.oeu));
                }
            }
            ((C2A7) _$_findCachedViewById(R.id.azj)).LJJLL(R.style.a2z);
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.azj), new ViewOnClickListenerC30909CBd(this));
            ((C47131t7) _$_findCachedViewById(R.id.azj)).setRadius(C15380j0.LIZ(8.0f));
            if (data3.userBuyGiftSubAuth) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.az3);
                if (_$_findCachedViewById != null) {
                    C29306Beo.LJJLJLI(_$_findCachedViewById);
                }
            } else {
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.az3);
                if (_$_findCachedViewById2 != null) {
                    C29306Beo.LJI(_$_findCachedViewById2);
                }
            }
        } else {
            if (!canRechargeSetting.getValue()) {
                ((C2A7) _$_findCachedViewById(R.id.azj)).setText(C15380j0.LJIILJJIL(R.string.odd));
                ((TextView) _$_findCachedViewById(R.id.azk)).setText(C15380j0.LJIILJJIL(R.string.o_l));
            } else {
                ((C2A7) _$_findCachedViewById(R.id.azj)).setText(C15380j0.LJIILJJIL(R.string.o_m));
                ((TextView) _$_findCachedViewById(R.id.azk)).setText(C15380j0.LJIILJJIL(R.string.o_o));
            }
            _$_findCachedViewById(R.id.azk).setVisibility(0);
            ((C2A7) _$_findCachedViewById(R.id.azj)).LJJLL(R.style.a2y);
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.azj), ViewOnClickListenerC30974CDq.LJLIL);
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.az3);
            if (_$_findCachedViewById3 != null) {
                C29306Beo.LJI(_$_findCachedViewById3);
            }
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.ist);
        if (_$_findCachedViewById4 != null && (viewTreeObserver = _$_findCachedViewById4.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS193S0100000_5(this, 7));
        }
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.laa), new ACListenerS25S0100000_5(this, 180));
        ((ArrayList) this.LJLLJ).clear();
        int i3 = 2;
        ((ArrayList) this.LJLLJ).add(new CDP(-1, i3));
        CDP cdp = this.LJLLL;
        if (cdp != null) {
            ((ArrayList) this.LJLLJ).add(cdp);
        }
        SpotlightInfo spotlightInfo = data3.spotlightInfo;
        if (spotlightInfo != null && (list2 = spotlightInfo.itemList) != null && list2.size() > 0) {
            ((ArrayList) this.LJLLJ).add(new CDP(-5, i3));
        }
        LiveSubsPrivilegeDetailAboutMeSetting liveSubsPrivilegeDetailAboutMeSetting = LiveSubsPrivilegeDetailAboutMeSetting.INSTANCE;
        if (liveSubsPrivilegeDetailAboutMeSetting.enableNavigation()) {
            this.LJLZ = 2;
            ((ArrayList) this.LJLLJ).add(new CDP(-2, i3));
        } else {
            this.LJLZ = 1;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (liveSubsPrivilegeDetailAboutMeSetting.enableNavigation()) {
            for (BenefitView benefitView : data3.benefits) {
                linkedHashMap.put(Integer.valueOf(benefitView.benefitType), benefitView);
            }
        } else {
            Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Integer valueOf2 = Integer.valueOf(intValue);
                BenefitView benefitView2 = new BenefitView();
                benefitView2.benefitType = intValue;
                linkedHashMap.put(valueOf2, benefitView2);
            }
        }
        if (!LiveSubsPrivilegeDetailAboutMeSetting.INSTANCE.enableAboutMe() || (communityDetail = data3.communityDetail) == null || (list = communityDetail.communityContentList) == null || list.size() <= 0) {
            linkedHashMap.remove(-4);
        }
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = data3.subOnlyVideosBriefInfo;
        if (subOnlyVideosBriefInfo == null || subOnlyVideosBriefInfo.totalCount < 3) {
            linkedHashMap.remove(8);
        }
        Iterator<SubCustomizedBenefit> it2 = data3.customizedBenefits.iterator();
        boolean z = false;
        int i4 = 0;
        while (it2.hasNext()) {
            if (it2.next().benefitType == 2) {
                z = true;
            } else {
                i4++;
            }
        }
        if (!z) {
            linkedHashMap.remove(7);
        }
        if (i4 <= 0 || !data3.showCustomizedBenefit) {
            linkedHashMap.remove(5);
        }
        if (data3.giftDetail.size() <= 0) {
            linkedHashMap.remove(4);
        }
        Iterator it3 = ((ArrayList) this.LJLLLLLL).iterator();
        while (it3.hasNext()) {
            BenefitView benefitView3 = (BenefitView) linkedHashMap.get(Integer.valueOf(((Number) it3.next()).intValue()));
            if (benefitView3 != null) {
                ((ArrayList) this.LJLLJ).add(new CDP(benefitView3.benefitType, benefitView3));
            }
        }
        ((ArrayList) this.LJLLJ).add(new CDP(-3, i3));
        if (LiveSubsPrivilegeDetailAboutMeSetting.INSTANCE.enableNavigation()) {
            AbstractC73672Svk.LJIIJ(new IDuS317S0100000_5(this, 6)).LJII(new C62705OjF()).LJJJLIIL(new AfS57S0100000_5(this, 289), new InterfaceC64592gB() { // from class: X.2vK
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("loadIndicator error: ");
                    LIZ2.append(obj);
                    C0NB.LIZIZ("SubscriptionPrivilegeDetailFragment", X1D.LIZIZ(LIZ2));
                }
            });
        }
        CDG cdg = this.LJLLI;
        cdg.LJLJI = data3;
        List<CDP> list3 = this.LJLLJ;
        o.LJIIIZ(list3, "list");
        ((ArrayList) cdg.LJLILLLLZI).clear();
        ORS.LJJLIIIJILLIZJL(list3, cdg.LJLILLLLZI);
        cdg.notifyDataSetChanged();
        TextView textView = (TextView) _$_findCachedViewById(R.id.title);
        if (textView == null) {
            return;
        }
        textView.setText(C15380j0.LJIILL(R.string.oh2, C05170If.LIZ(data3.anchorDetail)));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        long j;
        String str;
        super.onDestroy();
        Room room = this.LJLJLLL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        List list = (List) ((LinkedHashMap) B7K.LIZIZ).get(Long.valueOf(j));
        if (list != null) {
            list.remove(this);
        }
        ((ArrayList) C30846C8s.LJFF).remove(this);
        InterfaceC30972CDo interfaceC30972CDo = this.LJLJJLL;
        if (interfaceC30972CDo != null) {
            interfaceC30972CDo.LIZIZ();
        }
        if (this.LLFF) {
            str = "1";
        } else if (this.LLFFF) {
            str = "2";
        } else if (this.LL) {
            if (!this.LLFII) {
                str = "3";
            }
            str = CardStruct.IStatusCode.DEFAULT;
        } else if (this.LLFII) {
            str = "4";
        } else {
            if (!this.LLFII) {
                str = "5";
            }
            str = CardStruct.IStatusCode.DEFAULT;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLILLLLZI;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_intro_duration");
        Al(LIZ);
        LIZ.LJIJJ(Long.valueOf(elapsedRealtime), "duration");
        LIZ.LJIJJ(str, "show_state");
        LIZ.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C86447XwJ.LIZJ(C16880lQ.LJLLJ(SubscriptionPrivilegeDetailFragment.class));
    }

    public final void Al(BZI bzi) {
        Long l;
        User owner;
        bzi.LJIIZILJ();
        bzi.LJJIFFI(this.LLI);
        bzi.LJIJJ(C29232Bdc.LJIL(this.LJLJLLL), "subscribe_state");
        bzi.LJJIFFI(C29232Bdc.LJIJJLI(false, false, this.LJLJLLL));
        bzi.LJIJJ(this.LJLJLJ, "show_entrance");
        Room room = this.LJLJLLL;
        if (room != null && (owner = room.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        bzi.LJIJJ(l, "anchor_id");
        C78895Uxn.LIZIZ(bzi, "vertical", "privilege_show_type", 1, "is_native");
        bzi.LJIJJ("audience", "user_type");
        bzi.LJIL("auto_discount", Float.valueOf(this.LJLLLL));
    }

    @Override // X.InterfaceC30853C8z
    public final void S5(Throwable th) {
        C86447XwJ.LIZLLL(C16880lQ.LJLLJ(SubscriptionPrivilegeDetailFragment.class), th);
        C86447XwJ.LJ(C16880lQ.LJLLJ(SubscriptionPrivilegeDetailFragment.class), this.LLFZ, th);
        this.LLFFF = true;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_intro_failed");
        Al(LIZ);
        LIZ.LJIJJ("api error", "fail_reason");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC30977CDt
    public final void Y6(long j) {
        this.LJZ = j;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        String LJLLJ = C16880lQ.LJLLJ(SubscriptionPrivilegeDetailFragment.class);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C86447XwJ.LJFF(requireContext, LJLLJ, this.LJLJLJ);
        this.LLF = C15380j0.LJIIIZ(mo49getActivity()) - C15380j0.LIZ(96.0f);
        C30846C8s.LIZJ(this.LJLJLLL, this.LJLJLJ);
        Context context = getContext();
        Room room = this.LJLJLLL;
        if (room != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("user_subscribe_temp_");
            LIZ.append(room.getOwner().getSecUid());
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("user_subscribe_sku_");
            LIZ2.append(room.getOwner().getSecUid());
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            C72242sW c72242sW = new C72242sW();
            C72242sW c72242sW2 = new C72242sW();
            long currentTimeMillis = System.currentTimeMillis();
            SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
            User owner = room.getOwner();
            if (owner == null || (str = owner.getSecUid()) == null) {
                str = "";
            }
            subscribeApi.getSubTemplateList(str).LJJL(T16.LIZ()).LJJJLIIL(new AfS0S2400100_5(c72242sW, context, LIZIZ, this, currentTimeMillis, c72242sW2, LIZIZ2, 1), new AfS57S0100000_5(this, 291));
        }
        InterfaceC30972CDo interfaceC30972CDo = this.LJLJJLL;
        if (interfaceC30972CDo != null) {
            interfaceC30972CDo.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // X.InterfaceC30853C8z
    public final void x8(GetSubPrivilegeDetailResponse.Data data) {
        C86447XwJ.LIZLLL(C16880lQ.LJLLJ(SubscriptionPrivilegeDetailFragment.class), null);
        C86447XwJ.LJ(C16880lQ.LJLLJ(SubscriptionPrivilegeDetailFragment.class), this.LLFZ, null);
        this.LLFII = true;
        if (this.LJLL == null) {
            this.LJLL = data;
            C29306Beo.LJJJ(new AqS155S0100000_5(this, 353));
        }
    }

    public final void xl(String privilegePage) {
        o.LJIIIZ(privilegePage, "privilegePage");
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_intro_item_click");
        Al(LIZ);
        LIZ.LJIJJ(privilegePage, "privilege_page");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC30977CDt
    public final void Dg(long j, TemplateListData templateListData) {
        int i;
        OfferInfo offerInfo;
        String str;
        this.LJZI = j;
        this.LL = true;
        List<TemplateInfo> list = templateListData.templateList;
        ArrayList arrayList = new ArrayList();
        Iterator<TemplateInfo> it = list.iterator();
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            TemplateInfo next = it.next();
            if (next.tplType == 2) {
                arrayList.add(next);
            }
        }
        TemplateInfo templateInfo = (TemplateInfo) ORZ.LJLLLLLL(0, arrayList);
        if (templateInfo != null && (offerInfo = templateInfo.offerInfo) != null && offerInfo.offerType == 1 && offerInfo.campaignType == 1 && SubFirstAnniversaryUISetting.INSTANCE.enableAnniversaryUI()) {
            String str2 = null;
            if (1 != 0) {
                this.LJZL = templateInfo;
                this.LJLLL = new CDP(-6, i);
                CDG cdg = this.LJLLI;
                String str3 = offerInfo.originalMoneyDisplay;
                String str4 = offerInfo.discountMoneyDisplay;
                cdg.getClass();
                String str5 = "";
                if (C29306Beo.LJIJJLI(str3)) {
                    if (str3 == null) {
                        str3 = "";
                    }
                    cdg.LJLJJI = str3;
                }
                if (C29306Beo.LJIJJLI(str4)) {
                    if (str4 == null) {
                        str4 = "";
                    }
                    cdg.LJLJJL = str4;
                }
                cdg.LJLJJLL = true;
                CDG cdg2 = this.LJLLI;
                TagInfo tagInfo = templateInfo.tagInfo;
                if (tagInfo != null) {
                    str = tagInfo.jumpLink;
                    str2 = tagInfo.activityName;
                } else {
                    str = null;
                }
                cdg2.getClass();
                if (str != null && str.length() != 0) {
                    cdg2.LJLJL = str;
                }
                if (str2 != null) {
                    str5 = str2;
                }
                cdg2.LJLJLJ = str5;
                this.LJLLLL = offerInfo.discountRate;
            }
        }
        C29306Beo.LJJJ(new AqS155S0100000_5(this, 353));
    }

    public final void Dl(String str, String str2) {
        View view;
        if (this.isViewValid && (view = getView()) != null) {
            view.post(new ARunnableS0S2110000_5(this, str, str2, 2));
        }
    }

    @Override // X.CDY
    public final void S4(CDX view, int i) {
        o.LJIIIZ(view, "view");
        int i2 = i + this.LJLZ;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ist);
        if (recyclerView != null) {
            recyclerView.LJLIL(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        float f;
        ViewTreeObserver viewTreeObserver;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Room room = this.LJLJLLL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        Map<Long, List<DialogFragment>> map = B7K.LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(Long.valueOf(j)) == null) {
            map.put(Long.valueOf(j), new ArrayList());
        }
        List list = (List) linkedHashMap.get(Long.valueOf(j));
        if (list != null) {
            list.add(this);
        }
        if (LiveSubsPrivilegeDetailAboutMeSetting.INSTANCE.enableAboutMe()) {
            f = 0.7f;
        } else {
            f = 0.6f;
        }
        this.LJLJJI = f;
        PrivilegeSheetOptions privilegeSheetOptions = new PrivilegeSheetOptions();
        privilegeSheetOptions.draggable = true;
        privilegeSheetOptions.heightRatio = this.LJLJJI;
        float f2 = this.LJLJI;
        privilegeSheetOptions.maxHeightRatio = f2;
        privilegeSheetOptions.expandedHeightRatio = f2;
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.bs8).getLayoutParams();
        if (layoutParams instanceof C06F) {
            C06C c06c = ((C06F) layoutParams).LIZ;
            if (c06c instanceof PrivilegeBottomSheetBehavior) {
                PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior = (PrivilegeBottomSheetBehavior) c06c;
                privilegeBottomSheetBehavior.LJJIJIIJIL = -1;
                privilegeBottomSheetBehavior.LJJIJIL = 0.0f;
                privilegeBottomSheetBehavior.LJJIJL = -1;
                privilegeBottomSheetBehavior.LJJIJLIJ = 0.0f;
                privilegeBottomSheetBehavior.LIZJ = -1;
                privilegeBottomSheetBehavior.LJ = 0.0f;
                privilegeBottomSheetBehavior.LJFF = -1;
                privilegeBottomSheetBehavior.LJI = 0.0f;
                if (privilegeSheetOptions.fullscreenEnabled) {
                    privilegeBottomSheetBehavior.LJJIJIL = 1.0f;
                    privilegeBottomSheetBehavior.LIZJ = privilegeSheetOptions.height;
                    privilegeBottomSheetBehavior.LJ = privilegeSheetOptions.heightRatio;
                    privilegeBottomSheetBehavior.LJFF = privilegeSheetOptions.maxHeight;
                    privilegeBottomSheetBehavior.LJI = privilegeSheetOptions.maxHeightRatio;
                    privilegeBottomSheetBehavior.LJIILL = false;
                } else if (privilegeSheetOptions.draggable) {
                    privilegeBottomSheetBehavior.LJJIJIIJIL = privilegeSheetOptions.expandedHeight;
                    privilegeBottomSheetBehavior.LJJIJIL = privilegeSheetOptions.expandedHeightRatio;
                    privilegeBottomSheetBehavior.LIZJ = privilegeSheetOptions.height;
                    privilegeBottomSheetBehavior.LJ = privilegeSheetOptions.heightRatio;
                    privilegeBottomSheetBehavior.LJFF = privilegeSheetOptions.maxHeight;
                    privilegeBottomSheetBehavior.LJI = privilegeSheetOptions.maxHeightRatio;
                    privilegeBottomSheetBehavior.LJIILL = false;
                } else {
                    privilegeBottomSheetBehavior.LJJIJIIJIL = privilegeSheetOptions.height;
                    privilegeBottomSheetBehavior.LJJIJIL = privilegeSheetOptions.heightRatio;
                    privilegeBottomSheetBehavior.LJJIJL = privilegeSheetOptions.maxHeight;
                    privilegeBottomSheetBehavior.LJJIJLIJ = privilegeSheetOptions.maxHeightRatio;
                    privilegeBottomSheetBehavior.LJIILL = true;
                }
                privilegeBottomSheetBehavior.LJIILLIIL = privilegeSheetOptions.draggable;
                Reference reference = privilegeBottomSheetBehavior.LJJII;
                if (reference != null && reference.get() != null) {
                    ((View) privilegeBottomSheetBehavior.LJJII.get()).requestLayout();
                }
                C30965CDh c30965CDh = new C30965CDh(this);
                if (!privilegeBottomSheetBehavior.LJJIIJ.contains(c30965CDh)) {
                    privilegeBottomSheetBehavior.LJJIIJ.add(c30965CDh);
                }
                privilegeBottomSheetBehavior.LJIILLIIL = true;
                if (!privilegeBottomSheetBehavior.LJIILJJIL) {
                    privilegeBottomSheetBehavior.LJIILJJIL = true;
                }
                View _$_findCachedViewById = _$_findCachedViewById(R.id.j83);
                if (_$_findCachedViewById != null && (viewTreeObserver = _$_findCachedViewById.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS193S0100000_5(this, 2));
                }
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.el4);
                if (_$_findCachedViewById2 != null) {
                    _$_findCachedViewById2.setVisibility(8);
                }
                if (this.LJLJL) {
                    View layout_subscribe = _$_findCachedViewById(R.id.fml);
                    o.LJIIIIZZ(layout_subscribe, "layout_subscribe");
                    layout_subscribe.setVisibility(8);
                }
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 181), _$_findCachedViewById(R.id.liz));
                C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.fml), ViewOnClickListenerC30967CDj.LJLIL);
                C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.el4), ViewOnClickListenerC30968CDk.LJLIL);
                getContext();
                this.LLD = new C30969CDl();
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ist);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(this.LLD);
                }
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.ist);
                if (recyclerView2 != null) {
                    recyclerView2.setItemViewCacheSize(15);
                }
                RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.ist);
                if (recyclerView3 != null) {
                    recyclerView3.setHasFixedSize(true);
                }
                RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.ist);
                if (recyclerView4 != null) {
                    recyclerView4.setAdapter(this.LJLLI);
                }
                RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(R.id.ist);
                if (recyclerView5 != null) {
                    recyclerView5.setItemAnimator(null);
                }
                RecyclerView recyclerView6 = (RecyclerView) _$_findCachedViewById(R.id.ist);
                if (recyclerView6 != null) {
                    recyclerView6.LJIIJJI(new IDrS45S0100000_5(this, 3));
                }
                ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.ajf).getLayoutParams();
                layoutParams2.height = (int) ((C15380j0.LJIIL() * 487.0f) / 375.0f);
                ((C47061t0) _$_findCachedViewById(R.id.ajf)).setLayoutParams(layoutParams2);
                C15490jB.LJ(_$_findCachedViewById(R.id.ajf), "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_bg.png");
                if (C30846C8s.LIZ) {
                    GetSubPrivilegeDetailResponse.Data data = C30846C8s.LIZLLL;
                    if (data != null) {
                        x8(data);
                    } else {
                        S5(null);
                    }
                }
                ((ArrayList) C30846C8s.LJFF).add(this);
                return;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @Override // X.InterfaceC30977CDt
    public final void se(TemplateInfo templateInfo, C31556Ca0 paySuccessInfo) {
        IapProductDetail iapProductDetail;
        List<IapSubscriptionProduct> list;
        IapSubscriptionProduct iapSubscriptionProduct;
        String str;
        o.LJIIIZ(paySuccessInfo, "paySuccessInfo");
        Map map = (Map) paySuccessInfo.LJLJJL.LJLILLLLZI;
        if (map != null && (iapProductDetail = (IapProductDetail) map.get(templateInfo.iapId)) != null && (list = iapProductDetail.subscriptionOffer) != null) {
            Iterator<IapSubscriptionProduct> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    iapSubscriptionProduct = it.next();
                    String str2 = iapSubscriptionProduct.offerId;
                    OfferInfo offerInfo = templateInfo.offerInfo;
                    if (offerInfo != null) {
                        str = offerInfo.id;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str2, str)) {
                        break;
                    }
                } else {
                    iapSubscriptionProduct = null;
                    break;
                }
            }
            IapSubscriptionProduct iapSubscriptionProduct2 = iapSubscriptionProduct;
            if (iapSubscriptionProduct2 != null && iapSubscriptionProduct2.pricingPhases.size() == 2) {
                Dl(((AbsIapPricing) ListProtector.get(iapSubscriptionProduct2.pricingPhases, 1)).price, ((AbsIapPricing) ListProtector.get(iapSubscriptionProduct2.pricingPhases, 0)).price);
                return;
            }
        }
        Dl(null, null);
    }

    @Override // X.InterfaceC30977CDt
    public final void tc(int i, C77623UdH c77623UdH) {
        if (i == 4) {
            Dl(null, null);
        }
    }
}
