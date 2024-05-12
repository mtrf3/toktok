package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.DuetHelperKt;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Oer, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62433Oer {
    public static final ArrayList<String> LJIILL = C47261Igj.LJII("report", "save", "captions");
    public static final ArrayList<String> LJIILLIIL = C47261Igj.LJII("save", "save_photo", "top", "bc_view_insights", "insight", "promote", "promote_for_others", "play_list", "privacy", "delete");
    public static final ArrayList<String> LJIIZILJ = C47261Igj.LJII("save", "save_photo", "report");
    public final Aweme LIZ;
    public final boolean LIZIZ;
    public final Activity LIZJ;
    public final Fragment LIZLLL;
    public final C62394OeE LJ;
    public final InterfaceC72642tA<C50420Jqa> LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;
    public final ArrayList<String> LJIILJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        boolean z;
        ArrayList<String> arrayList;
        if (Z8A.LIZIZ.isFromProfileLongPress(this.LJII, this.LJI)) {
            List<InterfaceC62486Ofi> list = this.LJ.LIZJ;
            if (C78996UzQ.LJJIIZI(this.LIZ)) {
                arrayList = LJIILLIIL;
            } else {
                arrayList = LJIIZILJ;
            }
            Iterator<InterfaceC62486Ofi> it = list.iterator();
            while (it.hasNext()) {
                if (!arrayList.contains(it.next().key())) {
                    it.remove();
                }
            }
            return;
        }
        HashMap hashMap = new HashMap();
        for (InterfaceC62486Ofi interfaceC62486Ofi : this.LJ.LIZJ) {
            List list2 = (List) hashMap.get(interfaceC62486Ofi.key());
            if (list2 == null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(interfaceC62486Ofi);
                hashMap.put(interfaceC62486Ofi.key(), arrayList2);
            } else {
                list2.add(interfaceC62486Ofi);
            }
        }
        this.LJ.LIZJ.clear();
        int i = 0;
        if (o.LJ(this.LJI, "share_panel") || o.LJ(this.LJI, "normal_share")) {
            z = true;
        } else {
            z = false;
        }
        if (C62483Off.LIZJ() == EnumC62492Ofo.VERTICAL && hashMap.containsKey("dislike") && z) {
            List list3 = (List) hashMap.get("dislike");
            if (list3 == null) {
                list3 = C61878OQg.INSTANCE;
            }
            for (Object obj : list3) {
                if (obj instanceof C26261ASj) {
                    this.LJ.LIZJ.add(obj);
                    hashMap.remove("dislike");
                }
            }
        }
        if (!C19N.LJ("creator_m10n_show_creator_tools_analytics_entry_is_enabled", true)) {
            hashMap.remove("insight");
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            entry.getKey();
            List list4 = (List) entry.getValue();
            if (list4.size() > 1) {
                List<InterfaceC62486Ofi> list5 = this.LJ.LIZJ;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list4) {
                    InterfaceC62486Ofi interfaceC62486Ofi2 = (InterfaceC62486Ofi) obj2;
                    if (o.LJ(this.LJI, "share_panel") || o.LJ(this.LJI, "normal_share")) {
                        if (interfaceC62486Ofi2.LJIILIIL() == EnumC41317GJl.ShareButton) {
                            arrayList3.add(obj2);
                        }
                    } else if (interfaceC62486Ofi2.LJIILIIL() == EnumC41317GJl.LongPress) {
                        arrayList3.add(obj2);
                    }
                }
                list5.addAll(arrayList3);
            } else {
                this.LJ.LIZJ.addAll(list4);
            }
        }
        if (!this.LJIILIIL) {
            Iterator<InterfaceC62486Ofi> it2 = this.LJ.LIZJ.iterator();
            while (it2.hasNext()) {
                if (!LJIILL.contains(it2.next().key())) {
                    it2.remove();
                }
            }
        }
        if (LIZ(this.LJII, this.LJI)) {
            List<InterfaceC62486Ofi> list6 = this.LJ.LIZJ;
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(list6, 10));
            Iterator<InterfaceC62486Ofi> it3 = list6.iterator();
            while (it3.hasNext()) {
                arrayList4.add(it3.next().key());
            }
            List LIZ = C62444Of2.LIZ();
            ArrayList arrayList5 = null;
            if (LIZ != null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : LIZ) {
                    if (arrayList4.contains(((ShareItemOrderBean) obj3).actionId)) {
                        arrayList6.add(obj3);
                    }
                }
                arrayList5 = new ArrayList(C32I.LJJL(arrayList6, 10));
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(Integer.valueOf(((ShareItemOrderBean) it4.next()).LIZ()));
                }
            }
            ArrayList arrayList7 = new ArrayList();
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                int intValue = ((Number) ListProtector.get(arrayList5, 0)).intValue();
                arrayList7.add(0);
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    int i2 = i + 1;
                    int intValue2 = ((Number) it5.next()).intValue();
                    if (intValue2 != intValue) {
                        arrayList7.add(Integer.valueOf(i));
                        i = i2;
                        intValue = intValue2;
                    } else {
                        i = i2;
                    }
                }
            }
            ArrayList arrayList8 = new ArrayList(C32I.LJJL(arrayList7, 10));
            Iterator it6 = arrayList7.iterator();
            while (it6.hasNext()) {
                int intValue3 = ((Number) it6.next()).intValue();
                C62394OeE c62394OeE = this.LJ;
                c62394OeE.LIZLLL.add(Integer.valueOf(intValue3));
                arrayList8.add(c62394OeE);
            }
        }
        if (!o.LJ(this.LJI, "long_press")) {
            C62394OeE c62394OeE2 = this.LJ;
            C62453OfB filter = C62453OfB.LJLIL;
            c62394OeE2.getClass();
            o.LJIIIZ(filter, "filter");
            c62394OeE2.LJIIL = filter;
        }
    }

    public final List<InterfaceC62486Ofi> LIZLLL() {
        List<AbstractC26277ASz> LIZJ = new C62435Oet(this.LIZ, this.LJII, this.LJI, this.LJIIL, this.LIZJ, this.LIZLLL).LIZJ(null);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LIZJ).iterator();
        while (it.hasNext()) {
            AbstractC26277ASz abstractC26277ASz = (AbstractC26277ASz) it.next();
            if (abstractC26277ASz instanceof AT5) {
                arrayList.add(new AT4((AT5) abstractC26277ASz));
            } else if (abstractC26277ASz instanceof C26276ASy) {
                arrayList.add(new AT0((C26276ASy) abstractC26277ASz));
            } else if (abstractC26277ASz instanceof ATJ) {
                arrayList.add(new ATC((ATJ) abstractC26277ASz));
            } else if (abstractC26277ASz instanceof C26275ASx) {
                arrayList.add(new C26261ASj((C26275ASx) abstractC26277ASz));
            } else if (abstractC26277ASz instanceof ATM) {
                arrayList.add(new ATG((ATM) abstractC26277ASz));
            }
        }
        return arrayList;
    }

    public final void LJ() {
        if ((o.LJ(this.LJII, "homepage_podcast") && C78996UzQ.LJJIIZI(this.LIZ)) || !C78996UzQ.LJJIIZI(this.LIZ) || C54838Lfe.LJIJ(this.LIZ)) {
            return;
        }
        boolean LJII = TcmServiceImpl.LJIJI().LJII();
        boolean adAuthorization = ((RBX) HG3.LJIILL()).getCurUser().getAdAuthorization();
        if (!LJII && !adAuthorization) {
            return;
        }
        this.LJ.LIZJ(new HP1(this.LIZ, this.LJII));
    }

    public final void LJIIIIZZ() {
        if (C78996UzQ.LJJIIZI(this.LIZ)) {
            this.LJ.LIZJ(new C793439m(this.LJFF, this.LIZ, this.LJII, this.LJI));
        }
    }

    public final void LJIIIZ() {
        if (this.LIZIZ || C63081OpJ.LJJLIIIJLJLI(this.LIZ)) {
            return;
        }
        if (o.LJ(this.LJII, "homepage_hot") || o.LJ(this.LJII, "homepage_explore") || o.LJ(this.LJII, "homepage_popular") || o.LJ(this.LJII, "homepage_nearby") || o.LJ(this.LJII, "homepage_podcast") || ((this.LIZ.getAwemeRawAd() != null && TalentAdRevenueShareServiceImpl.LJIIJJI().LJI()) || LO7.LIZIZ.J1(this.LJII) || ((o.LJ(this.LJII, "homepage_follow") && this.LIZ.isAd()) || (o.LJ(this.LJII, "others_homepage") && this.LIZ.isAd())))) {
            if (!C78996UzQ.LJJIIZI(this.LIZ) || C59111NHv.LJ(this.LIZ)) {
                C62394OeE c62394OeE = this.LJ;
                Aweme aweme = this.LIZ;
                String eventType = this.LJII;
                o.LJIIIZ(aweme, "aweme");
                o.LJIIIZ(eventType, "eventType");
                c62394OeE.LIZJ(new C62686Oiw(eventType, aweme, "click_share_button"));
            }
        }
    }

    public final void LJIIJJI() {
        if (C220858ld.LJII(this.LIZ)) {
            return;
        }
        if (DuetHelperKt.canAddDuet(this.LIZ, C78996UzQ.LJJIIZI(this.LIZ)) && !o.LJ(this.LJII, "homepage_podcast")) {
            C62394OeE c62394OeE = this.LJ;
            final Aweme aweme = this.LIZ;
            final String str = this.LJII;
            final String str2 = this.LJI;
            c62394OeE.LIZJ(new InterfaceC62486Ofi(str, aweme, str2) { // from class: X.8Hv
                public static final /* synthetic */ int LJLJJI = 0;
                public final Aweme LJLIL;
                public final String LJLILLLLZI;
                public final String LJLJI;

                @Override // X.InterfaceC62486Ofi
                public final int LJFF() {
                    return R.raw.icon_2pt_duet;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJIIJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJIJ() {
                    return R.raw.icon_duet_fill;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String LJJIFFI() {
                    return "";
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJIIJZLJL() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final String key() {
                    return "duet";
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJ() {
                    if (this.LJLIL.isAd() && enable()) {
                        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", this.LJLIL.getAwemeRawAd());
                        LIZLLL.LIZJ("duet", "refer");
                        LIZLLL.LJI();
                    }
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean enable() {
                    boolean z;
                    boolean z2;
                    boolean LJJIIZI = C78996UzQ.LJJIIZI(this.LJLIL);
                    boolean LIZ = C220858ld.LIZ(this.LJLIL);
                    if (C85990Xow.LJIIIZ() && !C235779Nd.LIZ.LIZ().LIZ().booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean LJIILLIIL2 = CommerceMediaServiceImpl.LIZJ().LJIILLIIL(this.LJLIL.getMusic());
                    if (this.LJLIL.getAwemeType() == 150) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (DuetHelperKt.setGrayForDuet(this.LJLIL, LJJIIZI, LIZ, z, LJIILLIIL2) || z2) {
                        return false;
                    }
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LIZ() {
                    return C62485Ofh.LIZIZ();
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJJII() {
                    if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().showDuetWithReact()) {
                        return R.string.f0r;
                    }
                    return R.string.f01;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC41317GJl LJIILIIL() {
                    return EnumC41317GJl.ShareButton;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC26273ASv LJIILLIIL() {
                    return EnumC26273ASv.NORMAL;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIIZ(TextView textView) {
                    C62485Ofh.LJ(this, textView);
                }

                @Override // X.InterfaceC62486Ofi
                public final void onClick(View view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(sharePackage, "sharePackage");
                    if (!C17N.LJIIIZ(this, context, this.LJLIL, this.LJLILLLLZI)) {
                        return;
                    }
                    if (this.LJLIL.getAwemeType() == 150) {
                        C5S1 c5s1 = new C5S1(context);
                        c5s1.LIZLLL(context.getString(R.string.p6c));
                        c5s1.LJ();
                        return;
                    }
                    if (this.LJLIL.isAd() && enable()) {
                        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", this.LJLIL.getAwemeRawAd());
                        LIZLLL.LIZJ("duet", "refer");
                        LIZLLL.LJI();
                    }
                    if (this.LJLIL.isSubOnlyVideo() && !C78996UzQ.LJJIIZI(this.LJLIL)) {
                        return;
                    }
                    C208878Hr.LIZ(this.LJLIL, context, this.LJLJI, this.LJLILLLLZI, false, true);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZJ(context, baseSharePackage, this);
                }

                {
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(str, "eventType");
                    o.LJIIIZ(str2, "enterMethod");
                    this.LJLIL = aweme;
                    this.LJLILLLLZI = str;
                    this.LJLJI = str2;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIZILJ(ImageView imageView, View view, int i) {
                    C62485Ofh.LIZLLL(imageView, view);
                }
            });
        }
    }

    public final void LJIIL() {
        int value;
        List<EditPostBizPermissionStruct> bizPermission;
        int bizStatus;
        EnumC41101GBd LIZ;
        if (!C78996UzQ.LJJIIZI(this.LIZ)) {
            return;
        }
        EditPostPermission editPostPermission = this.LIZ.getEditPostPermission();
        if (editPostPermission != null && (bizPermission = editPostPermission.getBizPermission()) != null) {
            ArrayList arrayList = new ArrayList();
            for (EditPostBizPermissionStruct editPostBizPermissionStruct : bizPermission) {
                int bizType = editPostBizPermissionStruct.getBizType();
                EnumC41099GBb.Companion.getClass();
                if (bizType < EnumC41099GBb.values().length) {
                    arrayList.add(editPostBizPermissionStruct);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                EditPostBizPermissionStruct editPostBizPermissionStruct2 = (EditPostBizPermissionStruct) it.next();
                EnumC41101GBd[] values = EnumC41101GBd.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        EnumC41101GBd enumC41101GBd = values[i];
                        if (enumC41101GBd.getValue() == editPostBizPermissionStruct2.getBizStatus()) {
                            InterfaceC41071G9z interfaceC41071G9z = (InterfaceC41071G9z) ((LinkedHashMap) C41070G9y.LIZ).get(Integer.valueOf(editPostBizPermissionStruct2.getBizType()));
                            if (interfaceC41071G9z != null && (LIZ = interfaceC41071G9z.LIZ(enumC41101GBd)) != null) {
                                bizStatus = LIZ.getValue();
                            } else {
                                bizStatus = editPostBizPermissionStruct2.getBizStatus();
                            }
                            arrayList2.add(new EditPostBizPermissionStruct(editPostBizPermissionStruct2.getBizType(), bizStatus));
                        } else {
                            i++;
                        }
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((EditPostBizPermissionStruct) it2.next()).getBizStatus()));
            }
            EnumC41101GBd enumC41101GBd2 = EnumC41101GBd.GRAYED_OUT_FOR_MODERATION;
            if (arrayList3.contains(Integer.valueOf(enumC41101GBd2.getValue()))) {
                value = enumC41101GBd2.getValue();
            } else {
                EnumC41101GBd enumC41101GBd3 = EnumC41101GBd.SHOW;
                if (arrayList3.contains(Integer.valueOf(enumC41101GBd3.getValue()))) {
                    value = enumC41101GBd3.getValue();
                } else {
                    EnumC41101GBd enumC41101GBd4 = EnumC41101GBd.GRAYED_OUT_FOR_IN_PROCESS;
                    if (arrayList3.contains(Integer.valueOf(enumC41101GBd4.getValue()))) {
                        value = enumC41101GBd4.getValue();
                    } else {
                        EnumC41101GBd enumC41101GBd5 = EnumC41101GBd.GRAYED_OUT_FOR_FREQ_CONTROL;
                        if (arrayList3.contains(Integer.valueOf(enumC41101GBd5.getValue()))) {
                            value = enumC41101GBd5.getValue();
                        } else {
                            EnumC41101GBd enumC41101GBd6 = EnumC41101GBd.GRAYED_OUT_FOR_TIME_EXPIRATION;
                            if (arrayList3.contains(Integer.valueOf(enumC41101GBd6.getValue()))) {
                                value = enumC41101GBd6.getValue();
                            } else {
                                value = EnumC41101GBd.NO_SHOW.getValue();
                            }
                        }
                    }
                }
            }
        } else {
            value = EnumC41101GBd.NO_SHOW.getValue();
        }
        if (value != EnumC41101GBd.NO_SHOW.getValue()) {
            this.LJ.LIZJ(new C41298GIs(value, this.LJII, this.LIZ));
        }
    }

    public final void LJIILIIL() {
        User author;
        if (this.LIZ.isPrivate()) {
            return;
        }
        ShareDependService.LIZ.getClass();
        if (!C44498HdG.LIZ().LJJIJLIJ(this.LIZ) && C44498HdG.LIZ().LJIILL(this.LIZ) == 0) {
            if (((Boolean) DWZ.LIZIZ.getValue()).booleanValue() && (author = this.LIZ.getAuthor()) != null) {
                if (!((RBX) HG3.LJIILL()).isMe(author.getUid())) {
                    return;
                }
            } else {
                return;
            }
        }
        this.LJ.LIZJ(new C62645OiH(this.LJII, this.LIZ, this.LJI));
    }

    public final void LJIILL() {
        if ((!o.LJ(this.LJII, "homepage_podcast") || !C78996UzQ.LJJIIZI(this.LIZ)) && C78996UzQ.LJJIIZI(this.LIZ) && MixFeedService.LJJIJIIJIL().needShowAddOrRemoveButton()) {
            C62394OeE c62394OeE = this.LJ;
            final Aweme aweme = this.LIZ;
            final String str = this.LJII;
            final String str2 = this.LJI;
            final InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LJFF;
            c62394OeE.LIZJ(new InterfaceC62486Ofi(interfaceC72642tA, aweme, str, str2) { // from class: X.88J
                public static final /* synthetic */ int LJLJJL = 0;
                public final Aweme LJLIL;
                public final String LJLILLLLZI;
                public final String LJLJI;
                public final WeakReference<InterfaceC72642tA<C50420Jqa>> LJLJJI;

                @Override // X.InterfaceC62486Ofi
                public final void LJ() {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJIJ() {
                    return R.raw.icon_playlist_fill;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String LJJIFFI() {
                    return "";
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJIIJZLJL() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String key() {
                    return "play_list";
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJFF() {
                    Aweme aweme2 = this.LJLIL;
                    if (MixFeedService.LJJIJIIJIL().LJJIIZI(aweme2) && C80S.LJI(aweme2)) {
                        return R.raw.icon_2pt_playlist_fill;
                    }
                    return R.raw.icon_2pt_playlist;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean enable() {
                    if (C80S.LJIIIIZZ(this.LJLIL) || !C80S.LJI(this.LJLIL)) {
                        return false;
                    }
                    Aweme aweme2 = this.LJLIL;
                    if (aweme2.playlistBlocked) {
                        return false;
                    }
                    AwemeCommerceStruct commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo();
                    if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1) {
                        return false;
                    }
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LIZ() {
                    return C62485Ofh.LIZIZ();
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJJII() {
                    if (MixFeedService.LJJIJIIJIL().LJJIIZI(this.LJLIL) && C80S.LJI(this.LJLIL)) {
                        return R.string.q1g;
                    }
                    return R.string.bg4;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC41317GJl LJIILIIL() {
                    return EnumC41317GJl.ShareButton;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC26273ASv LJIILLIIL() {
                    return EnumC26273ASv.NORMAL;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIIZ(TextView textView) {
                    C62485Ofh.LJ(this, textView);
                }

                @Override // X.InterfaceC62486Ofi
                public final void onClick(View view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(sharePackage, "sharePackage");
                    Aweme aweme2 = this.LJLIL;
                    if (aweme2.playlistBlocked) {
                        MixFeedService.LJJIJIIJIL().LJIJJ(context);
                        return;
                    }
                    AwemeCommerceStruct commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo();
                    if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1) {
                        C05L.LIZLLL(context, R.string.ee_);
                        return;
                    }
                    if (C80S.LJIIIIZZ(this.LJLIL)) {
                        Activity LJIJJ = C45804HyK.LJIJJ(context);
                        if (LJIJJ != null) {
                            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                            c26045AKb.LJIIIIZZ(R.string.rui);
                            c26045AKb.LJIIJ();
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (C80S.LJI(this.LJLIL)) {
                        if (MixFeedService.LJJIJIIJIL().LJJIIZI(this.LJLIL)) {
                            C50420Jqa c50420Jqa = new C50420Jqa(56, this.LJLIL);
                            c50420Jqa.LJLLL = this.LJLJI;
                            c50420Jqa.LJLLLL = this.LJLILLLLZI;
                            InterfaceC72642tA<C50420Jqa> interfaceC72642tA2 = this.LJLJJI.get();
                            if (interfaceC72642tA2 == null) {
                                return;
                            }
                            interfaceC72642tA2.onInternalEvent(c50420Jqa);
                            return;
                        }
                        C50420Jqa c50420Jqa2 = new C50420Jqa(55, this.LJLIL);
                        c50420Jqa2.LJLLL = this.LJLJI;
                        c50420Jqa2.LJLLLL = this.LJLILLLLZI;
                        InterfaceC72642tA<C50420Jqa> interfaceC72642tA3 = this.LJLJJI.get();
                        if (interfaceC72642tA3 == null) {
                            return;
                        }
                        interfaceC72642tA3.onInternalEvent(c50420Jqa2);
                        return;
                    }
                    C05L.LIZLLL(context, R.string.sen);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZJ(context, baseSharePackage, this);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIZILJ(ImageView imageView, View view, int i) {
                    C62485Ofh.LIZLLL(imageView, view);
                }

                {
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(str, "enterFrom");
                    o.LJIIIZ(str2, "enterMethod");
                    this.LJLIL = aweme;
                    this.LJLILLLLZI = str;
                    this.LJLJI = str2;
                    this.LJLJJI = new WeakReference<>(interfaceC72642tA);
                }
            });
        }
    }

    public final void LJIIZILJ() {
        int i;
        Integer num;
        String str;
        if (!NII.LIZIZ.contains(Integer.valueOf(this.LIZ.getHasPromoteEntry()))) {
            return;
        }
        if (o.LJ(this.LJII, "homepage_podcast") && C78996UzQ.LJJIIZI(this.LIZ)) {
            return;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (!o.LJ(curUser.getUid(), this.LIZ.getAuthorUid())) {
            return;
        }
        int accountType = curUser.getAccountType();
        int i2 = 0;
        if (curUser.getCommerceUserInfo() != null) {
            i = curUser.getCommerceUserInfo().getPromotePayType();
        } else {
            i = 0;
        }
        if (C2043280e.LIZ) {
            num = Integer.valueOf(R.anim.fl);
        } else {
            num = null;
        }
        if (TextUtils.equals(AnonymousClass804.LIZ, "promote")) {
            Aweme aweme = this.LIZ;
            o.LJIIIZ(aweme, "aweme");
            if (aweme.getHasPromoteEntry() == 5 || aweme.getHasPromoteEntry() == 6) {
                CommonFeedServiceImpl.LJJIJLIJ().LJIILIIL(false);
            }
        }
        this.LJ.LIZJ(new C61722OKg(this.LIZ, this.LJII, this.LJI, num, this.LIZJ));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LIZ.getAid());
        c188727au.LIZLLL(accountType, "user_account_type");
        c188727au.LJIIIZ("promote_by", "myself");
        if (this.LIZ.getAwemeType() != 150) {
            str = "video";
        } else {
            str = "photo";
        }
        c188727au.LJIIIZ("content_type", str);
        c188727au.LIZLLL(i, "promote_version");
        if (this.LIZ.getHasPromoteEntry() == 1) {
            i2 = 1;
        }
        c188727au.LIZLLL(i2, "video_status");
        FMX.LJIIL("Promote_video_entrance_show", c188727au.LIZ);
        if (C59406NTe.LJIILL()) {
            String LJFF = C59406NTe.LJFF(null, this.LIZ.getAid(), "video");
            if (NQA.LIZIZ.LIZ()) {
                android.net.Uri parse = UriProtector.parse(LJFF);
                o.LJIIIIZZ(parse, "parse(schema)");
                String builder = C78939UyV.LJJJJJ(parse, C47261Igj.LJJIJIL("enable_prefetch", "enable_pending_js_task")).buildUpon().appendQueryParameter("promote_by", "1").appendQueryParameter("use_spark", "1").toString();
                o.LJIIIIZZ(builder, "tempUri.buildUpon()\n    …              .toString()");
                C59406NTe.LJIIJ(this.LIZJ, builder);
                return;
            }
            android.net.Uri parse2 = UriProtector.parse(LJFF);
            o.LJIIIIZZ(parse2, "parse(schema)");
            String builder2 = C78939UyV.LJJJJJ(parse2, C47261Igj.LJJIJIL("enable_prefetch")).buildUpon().appendQueryParameter("promote_by", "1").appendQueryParameter("enable_pending_js_task", "1").appendQueryParameter("enable_prefetch", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("use_spark", "1").toString();
            o.LJIIIIZZ(builder2, "tempUri.buildUpon()\n    …              .toString()");
            C59406NTe.LJIIJJI(builder2);
        }
    }

    public final void LJIJ() {
        int i;
        Integer num;
        String str;
        int i2 = 1;
        if (this.LIZ.getHasPromoteEntry() != 1 && this.LIZ.getHasPromoteEntry() != 2) {
            return;
        }
        if (TextUtils.equals(this.LJII, "homepage_hot") && !NQA.LIZIZ.LJIIIIZZ()) {
            return;
        }
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        o.LJIIIIZZ(currentUser, "get().getService(IUserSe…::class.java).currentUser");
        if (o.LJ(currentUser.getUid(), this.LIZ.getAuthorUid())) {
            return;
        }
        int accountType = currentUser.getAccountType();
        if (currentUser.getCommerceUserInfo() != null) {
            i = currentUser.getCommerceUserInfo().getPromotePayType();
        } else {
            i = 0;
        }
        if (C2043280e.LIZ) {
            num = Integer.valueOf(R.anim.fl);
        } else {
            num = null;
        }
        this.LJ.LIZJ(new C61723OKh(this.LIZ, this.LJII, num, this.LIZJ));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LIZ.getAid());
        c188727au.LJIIIZ("promote_by", "others");
        if (this.LIZ.getAwemeType() != 150) {
            str = "video";
        } else {
            str = "photo";
        }
        c188727au.LJIIIZ("content_type", str);
        c188727au.LIZLLL(accountType, "user_account_type");
        c188727au.LIZLLL(i, "promote_version");
        if (this.LIZ.getHasPromoteEntry() != 1) {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "video_status");
        FMX.LJIIL("Promote_video_entrance_show", c188727au.LIZ);
        if (C59406NTe.LJIILL()) {
            String LJFF = C59406NTe.LJFF(null, this.LIZ.getAid(), "video");
            if (NQA.LIZIZ.LIZ()) {
                android.net.Uri parse = UriProtector.parse(LJFF);
                o.LJIIIIZZ(parse, "parse(schema)");
                String builder = C78939UyV.LJJJJJ(parse, C47261Igj.LJJIJIL("enable_prefetch", "enable_pending_js_task")).buildUpon().appendQueryParameter("promote_by", "2").appendQueryParameter("use_spark", "1").toString();
                o.LJIIIIZZ(builder, "tempUri.buildUpon()\n    …              .toString()");
                C59406NTe.LJIIJ(this.LIZJ, builder);
                return;
            }
            android.net.Uri parse2 = UriProtector.parse(LJFF);
            o.LJIIIIZZ(parse2, "parse(schema)");
            String builder2 = C78939UyV.LJJJJJ(parse2, C47261Igj.LJJIJIL("enable_prefetch")).buildUpon().appendQueryParameter("promote_by", "2").appendQueryParameter("enable_pending_js_task", "1").appendQueryParameter("enable_prefetch", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("use_spark", "1").toString();
            o.LJIIIIZZ(builder2, "tempUri.buildUpon()\n    …              .toString()");
            C59406NTe.LJIIJJI(builder2);
        }
    }

    public final void LJIJI() {
        if (this.LIZ.getAuthor() == null || this.LIZ.getAwemeType() == 13) {
            return;
        }
        if ((this.LIZ.getStatus() != null && this.LIZ.getStatus().getPrivateStatus() == 1) || ((Number) C53044Kro.LIZ.getValue()).intValue() != 2 || TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), this.LIZ.getAuthorUid())) {
            return;
        }
        this.LJ.LIZJ(new C62174Oag(this.LIZ));
    }

    public final void LJIJJ() {
        int LIZ;
        if (!C78996UzQ.LJJIIZI(this.LIZ) || TextUtils.equals(this.LJIIL, "graphic_detail") || !((Boolean) DZP.LIZ.getValue()).booleanValue()) {
            return;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService().getClass();
        if (!C19N.LJ("lemon8_photopost_music_edit_enable", true) || (LIZ = C41066G9u.LIZ(this.LIZ.getEditPostPermission())) == EnumC41101GBd.NO_SHOW.getValue()) {
            return;
        }
        this.LJ.LIZJ(new C41300GIu(LIZ, this.LJII, this.LIZ));
    }

    public final void LJIJJLI() {
        if (C78996UzQ.LJJIIZI(this.LIZ) || this.LIZIZ) {
            return;
        }
        this.LJ.LIZJ(new C3A1(this.LJFF, this.LIZ, this.LJII, this.LJI));
    }

    public final void LJIL() {
        if (o.LJ(this.LJII, "homepage_podcast") && C78996UzQ.LJJIIZI(this.LIZ)) {
            return;
        }
        if ((C7F0.LIZ() || C186997Vn.LIZIZ()) && C78996UzQ.LJJIIZI(this.LIZ)) {
            C62394OeE c62394OeE = this.LJ;
            final Aweme aweme = this.LIZ;
            final String str = this.LJII;
            final String str2 = this.LJI;
            final String LIZJ = LIZJ(aweme);
            c62394OeE.LIZJ(new InterfaceC62486Ofi(str, str2, LIZJ, aweme) { // from class: X.7Z6
                public final Aweme LJLIL;
                public final String LJLILLLLZI;
                public final String LJLJI;
                public final String LJLJJI;

                @Override // X.InterfaceC62486Ofi
                public final void LJ() {
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJFF() {
                    return R.raw.icon_2pt_person_plus;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJIJ() {
                    return R.raw.icon_person_pen_fill;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String LJJIFFI() {
                    return "";
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJJII() {
                    return R.string.s1p;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJIIJZLJL() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String key() {
                    return "video_tag_edit";
                }

                @Override // X.InterfaceC62486Ofi
                public final int LIZ() {
                    return C62485Ofh.LIZIZ();
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC41317GJl LJIILIIL() {
                    return EnumC41317GJl.ShareButton;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC26273ASv LJIILLIIL() {
                    return EnumC26273ASv.NORMAL;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIIZ(TextView textView) {
                    C62485Ofh.LJ(this, textView);
                }

                @Override // X.InterfaceC62486Ofi
                public final void onClick(View view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                    int i;
                    List<InteractionTagUserInfo> list;
                    String authorUid;
                    int i2;
                    List<InteractionTagUserInfo> list2;
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(sharePackage, "sharePackage");
                    String str3 = null;
                    if (C186997Vn.LIZJ()) {
                        Activity LIZ = C105574Cj.LIZ(context);
                        if (LIZ != null && (LIZ instanceof ActivityC45651qj)) {
                            C186927Vg c186927Vg = C186927Vg.LIZIZ;
                            ActivityC45651qj activityC45651qj = (ActivityC45651qj) LIZ;
                            String str4 = this.LJLILLLLZI;
                            Aweme aweme2 = this.LJLIL;
                            AwemeStatus status = aweme2.getStatus();
                            if (status != null) {
                                i2 = status.getPrivateStatus();
                            } else {
                                i2 = 0;
                            }
                            InteractionTagInfo interactionTagInfo = this.LJLIL.getInteractionTagInfo();
                            if (interactionTagInfo != null) {
                                list2 = interactionTagInfo.getTaggedUsers();
                            } else {
                                list2 = null;
                            }
                            c186927Vg.LIZLLL(activityC45651qj, str4, aweme2, i2, list2, new C7BK(this));
                        }
                    } else {
                        Activity LIZ2 = C105574Cj.LIZ(context);
                        if (LIZ2 != null && (LIZ2 instanceof ActivityC45651qj)) {
                            C186927Vg c186927Vg2 = C186927Vg.LIZIZ;
                            String str5 = this.LJLILLLLZI;
                            Aweme aweme3 = this.LJLIL;
                            AwemeStatus status2 = aweme3.getStatus();
                            if (status2 != null) {
                                i = status2.getPrivateStatus();
                            } else {
                                i = 0;
                            }
                            InteractionTagInfo interactionTagInfo2 = this.LJLIL.getInteractionTagInfo();
                            if (interactionTagInfo2 != null) {
                                list = interactionTagInfo2.getTaggedUsers();
                            } else {
                                list = null;
                            }
                            c186927Vg2.LJFF(LIZ2, str5, aweme3, i, list, new OnActivityResultCallback() { // from class: X.7BL
                                @Override // com.bytedance.router.OnActivityResultCallback
                                public final void onActivityResult(int i3, int i4, Intent intent) {
                                }
                            });
                        }
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
                    c188727au.LJIIIZ("enter_method", this.LJLJI);
                    Aweme aweme4 = this.LJLIL;
                    if (aweme4 != null) {
                        str3 = aweme4.getAid();
                    }
                    String str6 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    c188727au.LJIIIZ("group_id", str3);
                    Aweme aweme5 = this.LJLIL;
                    if (aweme5 != null && (authorUid = aweme5.getAuthorUid()) != null) {
                        str6 = authorUid;
                    }
                    c188727au.LJIIIZ("author_id", str6);
                    c188727au.LJIIIZ("click_type", "click_edit");
                    c188727au.LJIIIZ("anchor_type", this.LJLJJI);
                    FMX.LJIIL("click_tag_edit", c188727au.LIZ);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZJ(context, baseSharePackage, this);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIZILJ(ImageView imageView, View view, int i) {
                    C62485Ofh.LIZLLL(imageView, view);
                }

                {
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(str, "enterFrom");
                    o.LJIIIZ(str2, "enterMethod");
                    this.LJLIL = aweme;
                    this.LJLILLLLZI = str;
                    this.LJLJI = str2;
                    this.LJLJJI = LIZJ;
                }
            });
        }
    }

    public final void LJJ() {
        List<InteractionTagUserInfo> taggedUsers;
        InteractionTagInfo interactionTagInfo = this.LIZ.getInteractionTagInfo();
        boolean z = false;
        if (interactionTagInfo != null && (taggedUsers = interactionTagInfo.getTaggedUsers()) != null && (!taggedUsers.isEmpty())) {
            z = AV1.LJIJI(((InteractionTagUserInfo) ListProtector.get(taggedUsers, 0)).getUid());
        }
        if ((C7F0.LIZJ() || C186997Vn.LIZIZ()) && z) {
            C62394OeE c62394OeE = this.LJ;
            final Aweme aweme = this.LIZ;
            final String str = this.LJII;
            final String str2 = this.LJI;
            final String LIZJ = LIZJ(aweme);
            c62394OeE.LIZJ(new InterfaceC62486Ofi(str, str2, LIZJ, aweme) { // from class: X.7Z7
                public final Aweme LJLIL;
                public final String LJLILLLLZI;
                public final String LJLJI;
                public final String LJLJJI;

                @Override // X.InterfaceC62486Ofi
                public final void LJ() {
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJFF() {
                    return R.raw.icon_2pt_person_x_mark;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJIJ() {
                    return R.raw.icon_person_x_fill;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String LJJIFFI() {
                    return "";
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJJII() {
                    return R.string.s1s;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJIIJZLJL() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String key() {
                    return "video_tag_remove";
                }

                @Override // X.InterfaceC62486Ofi
                public final int LIZ() {
                    return C62485Ofh.LIZIZ();
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC41317GJl LJIILIIL() {
                    return EnumC41317GJl.ShareButton;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC26273ASv LJIILLIIL() {
                    return EnumC26273ASv.NORMAL;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIIZ(TextView textView) {
                    C62485Ofh.LJ(this, textView);
                }

                @Override // X.InterfaceC62486Ofi
                public final void onClick(View view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                    String authorUid;
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(sharePackage, "sharePackage");
                    Activity LIZ = C105574Cj.LIZ(context);
                    String str3 = null;
                    if (LIZ != null && (LIZ instanceof ActivityC45651qj)) {
                        C186927Vg.LIZIZ.LJ((ActivityC45651qj) LIZ, this.LJLIL, this.LJLILLLLZI, this.LJLJJI);
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
                    c188727au.LJIIIZ("panel_source", this.LJLJI);
                    Aweme aweme2 = this.LJLIL;
                    if (aweme2 != null) {
                        str3 = aweme2.getAid();
                    }
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    c188727au.LJIIIZ("group_id", str3);
                    Aweme aweme3 = this.LJLIL;
                    if (aweme3 != null && (authorUid = aweme3.getAuthorUid()) != null) {
                        str4 = authorUid;
                    }
                    c188727au.LJIIIZ("author_id", str4);
                    c188727au.LJIIIZ("click_type", "click_remove");
                    c188727au.LJIIIZ("anchor_type", this.LJLJJI);
                    FMX.LJIIL("click_tag_edit", c188727au.LIZ);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZJ(context, baseSharePackage, this);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIZILJ(ImageView imageView, View view, int i) {
                    C62485Ofh.LIZLLL(imageView, view);
                }

                {
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(str, "enterFrom");
                    o.LJIIIZ(str2, "panelSource");
                    this.LJLIL = aweme;
                    this.LJLILLLLZI = str;
                    this.LJLJI = str2;
                    this.LJLJJI = LIZJ;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0628, code lost:
    
        if (com.ss.android.ugc.aweme.api.AnchorBusinessApiImpl.LIZIZ().LIZ(r10.LIZ) != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x062a, code lost:
    
        r10.LJ.LIZJ(new X.C227688we(r10.LJII, r10.LIZ));
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x05f3, code lost:
    
        if (X.TCM.LJIIJ(r10.LIZ) == false) goto L226;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII() {
        /*
            Method dump skipped, instructions count: 1949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62433Oer.LJJII():void");
    }

    public final void LJFF() {
        if (C48758JBq.LIZ() && !C48758JBq.LIZ() && !this.LIZ.isAd() && !TextUtils.equals(this.LJIIL, "graphic_detail") && ((RBX) HG3.LJIILL()).isLogin() && this.LIZ.getAwemeType() != 101) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if ((LJIIIIZZ != null && C79004UzY.LJJIJIIJI(LJIIIIZZ)) || !TextUtils.equals(this.LJII, "homepage_hot")) {
                return;
            }
            C62394OeE c62394OeE = this.LJ;
            final Aweme aweme = this.LIZ;
            final String str = this.LJII;
            final String str2 = this.LJI;
            c62394OeE.LIZJ(new InterfaceC62486Ofi(str, aweme, str2) { // from class: X.8pU
                public static final /* synthetic */ int LJLJJI = 0;
                public final Aweme LJLIL;
                public final String LJLILLLLZI;
                public final String LJLJI;

                @Override // X.InterfaceC62486Ofi
                public final void LJ() {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String LJJIFFI() {
                    return "";
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJIIJZLJL() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String key() {
                    return "auto_scroll";
                }

                @Override // X.InterfaceC62486Ofi
                public final int LIZ() {
                    return C62485Ofh.LIZIZ();
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJFF() {
                    if (C223258pV.LIZ()) {
                        return R.raw.icon_auto_scroll;
                    }
                    return R.raw.icon_auto_scroll_off;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJIJ() {
                    if (C223258pV.LIZ()) {
                        return R.raw.icon_auto_scroll_fill;
                    }
                    return R.raw.icon_auto_scroll_off_fill;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJJII() {
                    if (C223258pV.LIZ()) {
                        return R.string.by8;
                    }
                    return R.string.by9;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC41317GJl LJIILIIL() {
                    return EnumC41317GJl.ShareButton;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC26273ASv LJIILLIIL() {
                    return EnumC26273ASv.NORMAL;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIIZ(TextView textView) {
                    C62485Ofh.LJ(this, textView);
                }

                @Override // X.InterfaceC62486Ofi
                public final void onClick(View view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                    EnumC223268pW enumC223268pW;
                    HomeTabAbility LJIL;
                    Fragment Ja;
                    InterfaceC55235Lm3 LJFF;
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(sharePackage, "sharePackage");
                    Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
                    if (!(LJIIIIZZ2 instanceof ActivityC45651qj)) {
                        return;
                    }
                    MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI((ActivityC45651qj) LJIIIIZZ2);
                    IAutoAScrollAbility iAutoAScrollAbility = null;
                    if (LJJLIIIJJI == null || (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) == null || (Ja = LJIL.Ja("For You")) == null || (LJFF = KR8.LJFF(Ja)) == null || (iAutoAScrollAbility = (IAutoAScrollAbility) C55096Ljo.LIZ(LJFF, IAutoAScrollAbility.class, null)) == null || (enumC223268pW = iAutoAScrollAbility.dl()) == null) {
                        enumC223268pW = EnumC223268pW.AUTO_SCROLL_STATE_STOP;
                    }
                    if (enumC223268pW == EnumC223268pW.AUTO_SCROLL_STATE_STOP) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
                        c188727au.LJIIIZ("enter_method", this.LJLJI);
                        c188727au.LJIIIZ("author_id", this.LJLIL.getAuthorUid());
                        String aid = this.LJLIL.getAid();
                        if (aid == null) {
                            aid = "";
                        }
                        c188727au.LJIIIZ("group_id", aid);
                        FMX.LJIIL("turn_on_auto_scroll", c188727au.LIZ);
                        if (iAutoAScrollAbility != null) {
                            iAutoAScrollAbility.zl();
                            return;
                        }
                        return;
                    }
                    if (iAutoAScrollAbility == null) {
                        return;
                    }
                    iAutoAScrollAbility.j60(this.LJLJI);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZJ(context, baseSharePackage, this);
                }

                {
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(str, "eventType");
                    o.LJIIIZ(str2, "enterMethod");
                    this.LJLIL = aweme;
                    this.LJLILLLLZI = str;
                    this.LJLJI = str2;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIZILJ(ImageView imageView, View view, int i) {
                    C62485Ofh.LIZLLL(imageView, view);
                }
            });
        }
    }

    public final void LJI() {
        if ((C53326KwM.LIZ() && !AV1.LJIJ(this.LIZ.getAuthor())) || !C53379KxD.LIZ()) {
            return;
        }
        if (C41032G8m.LIZ()) {
            if (this.LIZ.getAwemeType() != 150 && !this.LIZ.isAd()) {
                if (C79004UzY.LJJIJIIJI(this.LIZJ) && LFH.LIZIZ.LIZLLL().LJIILL()) {
                    return;
                }
                this.LJ.LIZJ(new C86660Xzk(this.LIZJ, this.LIZ, this.LJII));
                return;
            }
            return;
        }
        if (AGD.LIZ()) {
            this.LJ.LIZJ(new C86660Xzk(this.LIZJ, this.LIZ, this.LJII));
            return;
        }
        boolean LJJIJIIJI = C86670Xzu.LJJIJIIJI(this.LIZ);
        boolean LJJIJIIJIL = C86670Xzu.LJJIJIIJIL(this.LIZ);
        boolean LIZJ = C86670Xzu.LIZJ(this.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video ");
        String aid = this.LIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        LIZ.append(aid);
        LIZ.append(" can turn-on/turn off captions: ");
        LIZ.append(LIZJ);
        C36922EeM.LIZLLL(4, "caption", X1D.LIZIZ(LIZ));
        if (LJJIJIIJI || LJJIJIIJIL || LIZJ) {
            this.LJ.LIZJ(new C86660Xzk(this.LIZJ, this.LIZ, this.LJII));
        }
    }

    public final void LJII() {
        IFavoriteService LJIJJLI = FavoriteServiceImpl.LJIJJLI();
        if (LJIJJLI != null && !LJIJJLI.LJIIIZ()) {
            return;
        }
        if (!this.LIZ.isAd() && !this.LIZ.isLive() && !TextUtils.equals(this.LJII, "graphic_detail") && !TextUtils.equals(this.LJIIL, "graphic_detail") && !FavoriteServiceImpl.LJIJJLI().LJFF()) {
            return;
        }
        this.LJ.LIZJ(new C2061987j(this.LIZJ, this.LIZ, this.LJII, this.LJI, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL));
    }

    public final void LJIIJ() {
        String str;
        ACLCommonShare downloadGeneral;
        if (AV1.LJIIJJI() || o.LJ(this.LJII, "homepage_podcast")) {
            return;
        }
        AwemeACLShare awemeACLShare = this.LIZ.awemeACLShareInfo;
        if ((awemeACLShare != null && (downloadGeneral = awemeACLShare.getDownloadGeneral()) != null && downloadGeneral.getShowType() == 0) || !this.LIZ.isSharedStoryVisible()) {
            return;
        }
        if (!LIZ(this.LJII, this.LJI) && Z8A.LIZIZ.isFromProfileLongPress(this.LJII, this.LJI)) {
            str = "shortcut_panel";
        } else if (!LIZ(this.LJII, this.LJI) || o.LJ(this.LJI, "share_panel")) {
            str = "click_download_icon";
        } else {
            str = "long_press_download";
        }
        this.LJ.LIZJ(new C44928HkC(this.LIZJ, this.LIZ, this.LJII, str, this.LJIIIIZZ));
    }

    public final void LJIILJJIL() {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        if (C55318LnO.LIZ(this.LIZ, curUser)) {
            this.LJ.LIZJ(new C55395Lod(this.LIZJ, this.LIZ, this.LJI));
        }
    }

    public final void LJIILLIIL() {
        Boolean LIZ = SharePrefCache.inst().getIsPrivateAvailable().LIZ();
        o.LJIIIIZZ(LIZ, "inst().isPrivateAvailable.cache");
        if (LIZ.booleanValue() && C78996UzQ.LJJIIZI(this.LIZ)) {
            this.LJ.LIZJ(new C7Z9(this.LJII, this.LIZ, this.LJI));
        }
    }

    public final void LJJI() {
        int i;
        if (!AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableStitch()) {
            return;
        }
        if (this.LIZ.getAuthor() != null && this.LIZ.getAuthor().isSecret() && !C78996UzQ.LJJIIZI(this.LIZ)) {
            return;
        }
        InteractPermission interactPermission = this.LIZ.getInteractPermission();
        if (interactPermission != null) {
            i = interactPermission.getStitch();
            if (i == 4) {
                return;
            }
        } else {
            i = 0;
        }
        if ((C78996UzQ.LJJIIZI(this.LIZ) || (i != 2 && !this.LIZIZ)) && !o.LJ(this.LJII, "homepage_podcast") && !C220858ld.LJII(this.LIZ) && this.LIZ.canStitchVideoType() && !this.LIZ.isWithPromotionalMusic() && this.LIZ.getStitchSetting() != 2) {
            C62394OeE c62394OeE = this.LJ;
            final Aweme aweme = this.LIZ;
            final String str = this.LJII;
            final String str2 = this.LJI;
            c62394OeE.LIZJ(new InterfaceC62486Ofi(str, aweme, str2) { // from class: X.8Hs
                public static final /* synthetic */ int LJLJJI = 0;
                public final Aweme LJLIL;
                public final String LJLILLLLZI;
                public final String LJLJI;

                @Override // X.InterfaceC62486Ofi
                public final int LJFF() {
                    return R.raw.icon_2pt_stitch;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJIIJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJIJ() {
                    return R.raw.icon_stitch_fill;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String LJJIFFI() {
                    return "";
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJJII() {
                    return R.string.r5f;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJIIJZLJL() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final String key() {
                    return "stitch";
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJ() {
                    if (this.LJLIL.isAd() && enable()) {
                        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", this.LJLIL.getAwemeRawAd());
                        LIZLLL.LIZJ("stitch", "refer");
                        LIZLLL.LJI();
                    }
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean enable() {
                    int stitchSetting;
                    boolean z;
                    int i2;
                    boolean z2;
                    boolean LIZLLL = C220858ld.LIZLLL(this.LJLIL);
                    Aweme aweme2 = this.LJLIL;
                    o.LJIIIZ(aweme2, "aweme");
                    if (aweme2.getAuthor() == null || ((stitchSetting = aweme2.getAuthor().getStitchSetting()) != 0 && (stitchSetting != 1 || aweme2.getAuthor() == null || aweme2.getAuthor().getFollowStatus() != 2))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    InteractPermission interactPermission2 = this.LJLIL.getInteractPermission();
                    if (interactPermission2 != null) {
                        i2 = interactPermission2.getStitch();
                    } else {
                        i2 = 0;
                    }
                    if (this.LJLIL.getAwemeType() == 150) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!LIZLLL || i2 == 3) {
                        return false;
                    }
                    if (!C78996UzQ.LJJIIZI(this.LJLIL) && (!z || i2 == 1)) {
                        return false;
                    }
                    if ((this.LJLIL.getAuthor().isSecret() && !C78996UzQ.LJJIIZI(this.LJLIL)) || CommerceMediaServiceImpl.LIZJ().LJIILLIIL(this.LJLIL.getMusic()) || z2) {
                        return false;
                    }
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LIZ() {
                    return C62485Ofh.LIZIZ();
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC41317GJl LJIILIIL() {
                    return EnumC41317GJl.ShareButton;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC26273ASv LJIILLIIL() {
                    return EnumC26273ASv.NORMAL;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIIZ(TextView textView) {
                    C62485Ofh.LJ(this, textView);
                }

                @Override // X.InterfaceC62486Ofi
                public final void onClick(View view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                }

                /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
                
                    if (r1 == false) goto L22;
                 */
                @Override // X.InterfaceC62486Ofi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZLLL(android.content.Context r6, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r7) {
                    /*
                        r5 = this;
                        java.lang.String r0 = "context"
                        kotlin.jvm.internal.o.LJIIIZ(r6, r0)
                        java.lang.String r0 = "sharePackage"
                        kotlin.jvm.internal.o.LJIIIZ(r7, r0)
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLIL
                        com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
                        if (r0 != 0) goto L13
                        return
                    L13:
                        com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService r0 = com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService.LJIIL()
                        boolean r0 = r0.LJI(r6)
                        r1 = 0
                        if (r0 == 0) goto L29
                        r0 = 2131828436(0x7f111ed4, float:1.9289813E38)
                        android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r1)
                        X.C16880lQ.LLZILL(r0)
                        return
                    L29:
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLIL
                        int r1 = r0.getAwemeType()
                        r0 = 150(0x96, float:2.1E-43)
                        if (r1 != r0) goto L46
                        X.5S1 r1 = new X.5S1
                        r1.<init>(r6)
                        r0 = 2131842450(0x7f115592, float:1.9318237E38)
                        java.lang.String r0 = r6.getString(r0)
                        r1.LIZLLL(r0)
                        r1.LJ()
                        return
                    L46:
                        boolean r1 = r5.enable()
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLIL
                        boolean r0 = r0.isAd()
                        if (r0 == 0) goto L85
                        if (r1 == 0) goto L87
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLIL
                        com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
                        java.lang.String r1 = "draw_ad"
                        java.lang.String r0 = "otherclick"
                        X.N0h r2 = X.C58704N2e.LIZLLL(r1, r0, r2)
                        java.lang.String r1 = "refer"
                        java.lang.String r0 = "stitch"
                        r2.LIZJ(r0, r1)
                        r2.LJI()
                    L6c:
                        android.app.Activity r4 = X.C78609UtB.LJJLIIIJ(r6)
                        if (r4 == 0) goto L84
                        X.HdG r0 = com.ss.android.ugc.aweme.share.ShareDependService.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.share.ShareDependService r3 = X.C44498HdG.LIZ()
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.LJLIL
                        java.lang.String r1 = r5.LJLILLLLZI
                        java.lang.String r0 = r5.LJLJI
                        r3.LIZIZ(r2, r4, r1, r0)
                    L84:
                        return
                    L85:
                        if (r1 != 0) goto L6c
                    L87:
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLIL
                        boolean r0 = r0.isSubOnlyVideo()
                        if (r0 == 0) goto L98
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLIL
                        boolean r0 = X.C78996UzQ.LJJIIZI(r0)
                        if (r0 != 0) goto L98
                        return
                    L98:
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLIL
                        X.HRi r2 = X.C220858ld.LIZJ(r0)
                        com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
                        com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
                        com.ss.android.ugc.aweme.services.IShortVideoConfig r1 = r0.shortVideoConfig()
                        X.HRi r0 = X.EnumC44070HRi.VIDEO_LENGTH_RESTRICT
                        if (r2 != r0) goto Lc2
                        r0 = 2
                        java.lang.String r1 = r1.getErrorHintWhenDisableDuetOrStitch(r0)
                    Lb3:
                        java.lang.String r0 = "toastMessage"
                        kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                        int r0 = r1.length()
                        if (r0 <= 0) goto Lc1
                        X.C30869C9p.LIZIZ(r6, r1)
                    Lc1:
                        return
                    Lc2:
                        X.HRi r0 = X.EnumC44070HRi.COMMERCE_USER_NOT_COMMERCE_MUSIC
                        if (r2 != r0) goto Lce
                        r0 = 2131845110(0x7f115ff6, float:1.9323632E38)
                        java.lang.String r1 = r6.getString(r0)
                        goto Lb3
                    Lce:
                        r0 = 2131845939(0x7f116333, float:1.9325313E38)
                        java.lang.String r1 = r6.getString(r0)
                        goto Lb3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C208888Hs.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZJ(context, baseSharePackage, this);
                }

                {
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(str, "eventType");
                    o.LJIIIZ(str2, "enterMethod");
                    this.LJLIL = aweme;
                    this.LJLILLLLZI = str;
                    this.LJLJI = str2;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIZILJ(ImageView imageView, View view, int i2) {
                    C62485Ofh.LIZLLL(imageView, view);
                }
            });
        }
    }

    public final void LJJIFFI() {
        ActivityC45651qj activityC45651qj;
        if (!o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE)) {
            Aweme aweme = this.LIZ;
            o.LJIIIZ(aweme, "aweme");
            List<RecReasonEntry> recReasonsEntry = aweme.getRecReasonsEntry();
            if (recReasonsEntry == null || recReasonsEntry.isEmpty()) {
                return;
            }
            Activity activity = this.LIZJ;
            if (!(activity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) activity) == null) {
                return;
            }
            this.LJ.LIZJ(new C63037Oob(activityC45651qj, this.LJI, this.LIZ));
        }
    }

    public static String LIZJ(Aweme aweme) {
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null) {
            int interestLevel = interactionTagInfo.getInterestLevel();
            if (interestLevel == InteractionTagInterestLevel.LOW.getLevel()) {
                return "low_interest";
            }
            if (interestLevel == InteractionTagInterestLevel.HIGH.getLevel()) {
                return "high_interest";
            }
        }
        return "";
    }

    public static boolean LIZ(String enterFrom, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        return !Z8A.LIZIZ.isFromProfileLongPress(enterFrom, enterMethod);
    }

    public C62433Oer(Aweme aweme, boolean z, Activity activity, Fragment fragment, C62394OeE c62394OeE, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, String enterMethod, String str, int i, String actionType, String tagId, String parentTagId, String categoryName, String fromPage, boolean z2) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(tagId, "tagId");
        o.LJIIIZ(parentTagId, "parentTagId");
        o.LJIIIZ(categoryName, "categoryName");
        o.LJIIIZ(fromPage, "fromPage");
        this.LIZ = aweme;
        this.LIZIZ = z;
        this.LIZJ = activity;
        this.LIZLLL = fragment;
        this.LJ = c62394OeE;
        this.LJFF = interfaceC72642tA;
        this.LJI = enterMethod;
        this.LJII = str;
        this.LJIIIIZZ = actionType;
        this.LJIIIZ = tagId;
        this.LJIIJ = parentTagId;
        this.LJIIJJI = categoryName;
        this.LJIIL = fromPage;
        this.LJIILIIL = z2;
        this.LJIILJJIL = C47261Igj.LJII("save");
    }
}
