package Y;

import X.AK2;
import X.AbstractC38911fr;
import X.C188727au;
import X.C19N;
import X.C213828aI;
import X.C53576L0y;
import X.C54102LLe;
import X.C54105LLh;
import X.C54702LdS;
import X.C54705LdV;
import X.C56092Lzs;
import X.C56358M9y;
import X.C57571Mid;
import X.C57572Mie;
import X.C57594Mj0;
import X.C58084Mqu;
import X.C59948Nfs;
import X.C68672ml;
import X.C6ZT;
import X.C76800UCe;
import X.C77357UXp;
import X.EnumC55811LvL;
import X.EnumC57365MfJ;
import X.EnumC57597Mj3;
import X.EnumC58046MqI;
import X.EnumC58085Mqv;
import X.FMX;
import X.InterfaceC54080LKi;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.LV6;
import X.M05;
import X.MAN;
import X.OKW;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.live.promote.service.PromoteUtilImpl;
import com.ss.android.ugc.aweme.commercialize.live.promote.settings.PromoteCommonEntrySchemaSetting;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.MallShopCartAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.ffp.ui.NeedAuthFragment;
import com.ss.android.ugc.aweme.story.guide.StoryWidgetGuideInboxCell;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS113S0300000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACListenerS35S0300000_9 implements View.OnClickListener {
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
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        MallShopCartAssem mallShopCartAssem = (MallShopCartAssem) aCListenerS35S0300000_9.l0;
        mallShopCartAssem.LJLJI = EnumC55811LvL.CLICK_BUBBLE;
        InterfaceC82683Wch interfaceC82683Wch = mallShopCartAssem.LJLILLLLZI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        C56092Lzs.LIZ.getClass();
        M05.LJ(C56092Lzs.LIZJ(), "mall", "tool_cart", ((C68672ml) aCListenerS35S0300000_9.l1).LIZLLL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ShopMainFragment.LJZ.getClass();
        String str = ShopMainFragment.LJZI;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("previous_page", str);
        MallShopCartAssem mallShopCartAssem2 = (MallShopCartAssem) aCListenerS35S0300000_9.l0;
        mallShopCartAssem2.withState((AssemViewModel) mallShopCartAssem2.LJLIL.getValue(), new AqS113S0300000_9((Map) linkedHashMap, (Map<String, String>) aCListenerS35S0300000_9.l0, (MallShopCartAssem) aCListenerS35S0300000_9.l2, (InterfaceC88472Yns<? super Map<String, String>, C76800UCe>) 1));
    }

    public static final void onClick$1(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        Context context;
        LV6 lv6 = (LV6) aCListenerS35S0300000_9.l0;
        List list = (List) aCListenerS35S0300000_9.l1;
        FragmentManager fragmentManager = (FragmentManager) aCListenerS35S0300000_9.l2;
        lv6.getClass();
        if (list == null || list.isEmpty() || list.size() <= 1) {
            return;
        }
        View view2 = lv6.LJLIL;
        if (view2 != null) {
            context = view2.getContext();
        } else {
            context = null;
        }
        o.LJI(context);
        C213828aI c213828aI = new C213828aI(context, list);
        if (fragmentManager == null) {
            return;
        }
        c213828aI.LIZIZ.show(fragmentManager, "KidsAnchorSelectionSheet");
    }

    public static final void onClick$2(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        C58084Mqu.LIZIZ(EnumC58085Mqv.FIND_FRIENDS, 0);
        EnumC58046MqI enumC58046MqI = EnumC58046MqI.CONTACT;
        Context context = ((LinearLayout) aCListenerS35S0300000_9.l0).getContext();
        o.LJIIIIZZ(context, "context");
        C57572Mie.LIZ(enumC58046MqI, context, (C57571Mid) aCListenerS35S0300000_9.l1, new AqS175S0100000_9((NeedAuthFragment) aCListenerS35S0300000_9.l2, 240));
    }

    public static final void onClick$3(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        EnumC58046MqI enumC58046MqI = EnumC58046MqI.FACEBOOK;
        Context context = ((LinearLayout) aCListenerS35S0300000_9.l0).getContext();
        o.LJIIIIZZ(context, "context");
        C57572Mie.LIZ(enumC58046MqI, context, (C57571Mid) aCListenerS35S0300000_9.l1, new AqS175S0100000_9((NeedAuthFragment) aCListenerS35S0300000_9.l2, 241));
    }

    public static final void onClick$4(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        String str;
        String str2;
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("notification_page", "enter_from");
        oszArr[1] = new OSZ(Integer.valueOf(((StoryWidgetGuideInboxCell) aCListenerS35S0300000_9.l0).LJLJI), "is_first");
        C56358M9y item = ((StoryWidgetGuideInboxCell) aCListenerS35S0300000_9.l0).getItem();
        String str3 = null;
        if (item != null) {
            str = item.LJLJJI;
        } else {
            str = null;
        }
        oszArr[2] = new OSZ(str, "widget_type");
        FMX.LJIILL("click_add_widget", oszArr);
        C77357UXp.LJJIJIIJI((StoryWidgetGuideInboxCell) aCListenerS35S0300000_9.l0, "widget", null, null, null, null, 126);
        ((AbstractC38911fr) aCListenerS35S0300000_9.l1).LJIIZILJ().storeBoolean("keva_key_widget_guide_dialog_appeared", true);
        if (((C56358M9y) aCListenerS35S0300000_9.l2).LJLIL) {
            str2 = "first";
        } else {
            str2 = "fixed";
        }
        C56358M9y item2 = ((StoryWidgetGuideInboxCell) aCListenerS35S0300000_9.l0).getItem();
        if (item2 != null) {
            str3 = item2.LJLJJI;
        }
        if (o.LJ(str3, "now")) {
            MAN man = MAN.LIZIZ;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "v.context");
            man.LIZ.LJ(context);
            return;
        }
        Context context2 = ((StoryWidgetGuideInboxCell) aCListenerS35S0300000_9.l0).itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        AK2.LIZ(context2, str2);
    }

    public static final void onClick$5(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        ((C54105LLh) aCListenerS35S0300000_9.l0).LJJJJ(view, (InterfaceC54080LKi) aCListenerS35S0300000_9.l1, (ScrollSwitchStateManager) aCListenerS35S0300000_9.l2);
    }

    public static final void onClick$6(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        if (C6ZT.LIZIZ(((View) aCListenerS35S0300000_9.l0).findViewById(R.id.akq), 500L)) {
            return;
        }
        ((RecSwipeViewModel) aCListenerS35S0300000_9.l1).sv0(EnumC57365MfJ.CLOSE);
        if (C53576L0y.LIZ() == 1 || C53576L0y.LIZ() == 3) {
            RecSwipeViewModel recSwipeViewModel = (RecSwipeViewModel) aCListenerS35S0300000_9.l1;
            int absoluteAdapterPosition = ((C57594Mj0) aCListenerS35S0300000_9.l2).getAbsoluteAdapterPosition();
            Integer num = recSwipeViewModel.getState().LJLJL;
            if (num == null || num.intValue() != absoluteAdapterPosition) {
                return;
            }
            RecSwipeViewModel recSwipeViewModel2 = (RecSwipeViewModel) aCListenerS35S0300000_9.l1;
            recSwipeViewModel2.iv0(recSwipeViewModel2.getState().LJLJL);
            ((RecSwipeViewModel) aCListenerS35S0300000_9.l1).jv0();
            return;
        }
        ((RecSwipeViewModel) aCListenerS35S0300000_9.l1).pv0(EnumC57597Mj3.CLICK_CLOSE, (View) aCListenerS35S0300000_9.l0);
    }

    public static final void onClick$7(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        boolean z;
        String str;
        String LJFF;
        ((PromoteUtilImpl) aCListenerS35S0300000_9.l0).getClass();
        Keva repo = Keva.getRepo("promote_keva");
        o.LJIIIIZZ(repo, "getRepo(PROMOTE_KEVA_REPO_KEY)");
        boolean z2 = true;
        if (repo.getBoolean("has_clicked_promote_sponsored_tag", true) || C19N.LJ("test_promote_sponsor_popup_1232132", false)) {
            z = true;
        } else {
            z = false;
            ((PromoteUtilImpl) aCListenerS35S0300000_9.l0).getClass();
            if (PromoteUtilImpl.LJIIJ()) {
                z2 = false;
            }
        }
        if (z2) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            PromoteCommonEntrySchemaSetting.PromoteCommonEntrySchema promoteCommonEntrySchema = PromoteCommonEntrySchemaSetting.LIZ;
            PromoteCommonEntrySchemaSetting.PromoteCommonEntrySchema promoteCommonEntrySchema2 = (PromoteCommonEntrySchemaSetting.PromoteCommonEntrySchema) LIZLLL.LJIIIIZZ("Promote_common_entry_schema", PromoteCommonEntrySchemaSetting.PromoteCommonEntrySchema.class, promoteCommonEntrySchema);
            if (promoteCommonEntrySchema2 != null) {
                promoteCommonEntrySchema = promoteCommonEntrySchema2;
            }
            str = promoteCommonEntrySchema.popup;
        } else {
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            PromoteCommonEntrySchemaSetting.PromoteCommonEntrySchema promoteCommonEntrySchema3 = PromoteCommonEntrySchemaSetting.LIZ;
            PromoteCommonEntrySchemaSetting.PromoteCommonEntrySchema promoteCommonEntrySchema4 = (PromoteCommonEntrySchemaSetting.PromoteCommonEntrySchema) LIZLLL2.LJIIIIZZ("Promote_common_entry_schema", PromoteCommonEntrySchemaSetting.PromoteCommonEntrySchema.class, promoteCommonEntrySchema3);
            if (promoteCommonEntrySchema4 != null) {
                promoteCommonEntrySchema3 = promoteCommonEntrySchema4;
            }
            str = promoteCommonEntrySchema3.normal;
        }
        if (str == null) {
            return;
        }
        String LJFF2 = i0.LJFF(str, "&enter_from=promoted_tag");
        if (z2) {
            StringBuilder LIZJ = b1.LIZJ(LJFF2, "&is_promote_eligible_user=");
            ((PromoteUtilImpl) aCListenerS35S0300000_9.l0).getClass();
            LIZJ.append(PromoteUtilImpl.LJIIJ() ? 1 : 0);
            LIZJ.append("&pageModule=sponsored-tag&item_id=");
            LIZJ.append(((Aweme) aCListenerS35S0300000_9.l1).getAid());
            LJFF = X1D.LIZIZ(LIZJ);
        } else {
            LJFF = i0.LJFF(LJFF2, "&pageModule=promote-center");
        }
        SmartRouter.buildRoute(((C59948Nfs) aCListenerS35S0300000_9.l2).getContext(), LJFF).open();
        if (z) {
            ((PromoteUtilImpl) aCListenerS35S0300000_9.l0).getClass();
            Keva repo2 = Keva.getRepo("promote_keva");
            o.LJIIIIZZ(repo2, "getRepo(PROMOTE_KEVA_REPO_KEY)");
            repo2.storeBoolean("has_clicked_promote_sponsored_tag", false);
        }
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(OKW.LIZIZ(), "user_account_type");
        c188727au.LJIIIZ("group_id", ((Aweme) aCListenerS35S0300000_9.l1).getAid());
        ((PromoteUtilImpl) aCListenerS35S0300000_9.l0).getClass();
        c188727au.LJFF(Boolean.valueOf(PromoteUtilImpl.LJIIJ()), "is_promote_eligible_user");
        FMX.LJIIL("Promoted_tag_click", c188727au.LIZ);
    }

    public static final void onClick$8(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        ((C54102LLe) aCListenerS35S0300000_9.l0).LJJJJ(view, (InterfaceC54080LKi) aCListenerS35S0300000_9.l1, (ScrollSwitchStateManager) aCListenerS35S0300000_9.l2);
    }

    public static final void onClick$9(ACListenerS35S0300000_9 aCListenerS35S0300000_9, View view) {
        String str;
        if (!C6ZT.LIZ(((C54702LdS) aCListenerS35S0300000_9.l0).LJLIL)) {
            C54702LdS c54702LdS = (C54702LdS) aCListenerS35S0300000_9.l0;
            Context context = c54702LdS.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C54705LdV c54705LdV = (C54705LdV) aCListenerS35S0300000_9.l1;
            List list = (List) aCListenerS35S0300000_9.l2;
            ((C54702LdS) aCListenerS35S0300000_9.l0).itemView.getWidth();
            ((C54702LdS) aCListenerS35S0300000_9.l0).itemView.getHeight();
            String str2 = c54705LdV.LIZJ;
            if (str2 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str3 = ((C54705LdV) it.next()).LIZJ;
                    if (str3 != null) {
                        arrayList.add(Long.valueOf(CastLongProtector.parseLong(str3)));
                    }
                }
            }
            Rect rect = new Rect();
            int[] LJJLJ = ORY.LJJLJ(new Integer[]{0, 0});
            c54702LdS.itemView.getLocationOnScreen(LJJLJ);
            int i = LJJLJ[0];
            rect.left = i;
            int i2 = LJJLJ[1];
            rect.top = i2;
            rect.right = i + i;
            rect.bottom = i2 + i2;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterSourcePosition = rect;
            roomsData.roomIds = ORZ.LLJIJIL(arrayList);
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterMethod = "live_cover";
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            String str4 = c54705LdV.LIZLLL;
            if (str4 == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = str4;
            }
            logData.anchorId = str;
            roomsData2.enterType = "click";
            if (str4 == null) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            roomsData2.userId = str4;
            roomsData2.roomId = CastLongProtector.parseLong(str2);
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            roomsData3.enterFromMerge = "mall_racun_channel";
            roomsData3.actionType = "click";
            LiveOuterService.LJJJLL().LJIILL().LJIILJJIL(context, enterRoomConfig);
        }
    }

    public ACListenerS35S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
