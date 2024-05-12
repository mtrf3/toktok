package X;

import Y.ARunnableS26S0200000_7;
import Y.IDComparatorS35S0000000_7;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.android.play.core.appupdate.u;
import com.google.gson.s;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.anchor.service.GetLeadsAnchorService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.feed.model.AnchorPlaylistInfo;
import com.ss.android.ugc.aweme.feed.model.Lemon8AnchorContentInfo;
import com.ss.android.ugc.aweme.feed.model.Lemon8GeneralAnchorContentInfo;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionBiz;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.MultiAnchorPublishModel;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.a1;
import defpackage.e1;
import defpackage.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GsY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42898GsY implements IAVPublishExtension<MultiAnchorPublishModel>, InterfaceC72822Si2 {
    public AbstractC42900Gsa LJLILLLLZI;
    public Fragment LJLJI;
    public LifecycleOwner LJLJJI;
    public View LJLJJL;
    public ExtensionMisc LJLJJLL;
    public AVPublishContentType LJLJL;
    public PublishOutput LJLJLJ;
    public PublishExtensionModel LJLJLLL;
    public String LJLL;
    public UrlModel LJLLI;
    public DialogC42922Gsw LJLLJ;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public AnchorPublishStruct LJZ;
    public int LJZL;
    public final int LJLIL = 2;
    public boolean LJLLILLLL = true;
    public final int LJLLL = 29;
    public final AnchorLock$IAnchorStateService LJLZ = AnchorStateServiceImpl.LJIIJ();
    public final List<InterfaceC65784Pro<C76800UCe>> LJZI = new ArrayList();
    public final C62822Ol8 LL = C221108m2.LIZIZ(C41382GLy.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return "MultiAnchorPublishExtension";
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onAccountUpdate() {
        AnchorListManager.LIZJ(new AqS157S0100000_7(this, 548));
    }

    public final ExtensionMisc LJ() {
        ExtensionMisc extensionMisc = this.LJLJJLL;
        if (extensionMisc != null) {
            return extensionMisc;
        }
        o.LJIJI("extensionMisc");
        throw null;
    }

    public final void LJIJ() {
        boolean z;
        if (AnchorListManager.LJI > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC42900Gsa abstractC42900Gsa = this.LJLILLLLZI;
            if (abstractC42900Gsa != null) {
                abstractC42900Gsa.LJFF();
            } else {
                o.LJIJI("delegate");
                throw null;
            }
        } else {
            AbstractC42900Gsa abstractC42900Gsa2 = this.LJLILLLLZI;
            if (abstractC42900Gsa2 != null) {
                abstractC42900Gsa2.LIZIZ();
            } else {
                o.LJIJI("delegate");
                throw null;
            }
        }
        AnchorListManager.LJIIIZ(AnchorListManager.LJI());
        if (AnchorListManager.LJIIIIZZ && e1.LIZ(31744, "ec_addlink_product_tips_enable", true, false)) {
            if (e1.LIZ(31744, "ec_anchor_addlink_guild_enable", true, false)) {
                Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
                o.LJIIIIZZ(repo, "getRepo(KEVA_TOOLS_PUBLISH_REPO)");
                boolean LJIJ = C79057V0z.LJIJ(repo, "autogenerated_caption_popup_shown_again_extra", false);
                Keva keva = C66822jm.LIZ;
                int i = keva.getInt("is_first_show_anchor_guild", -1);
                if (i == 1 || i == 2) {
                    AbstractC42900Gsa abstractC42900Gsa3 = this.LJLILLLLZI;
                    if (abstractC42900Gsa3 != null) {
                        abstractC42900Gsa3.LJI(false);
                    } else {
                        o.LJIJI("delegate");
                        throw null;
                    }
                } else if (LJIJ && i == -1) {
                    C79057V0z.LJJJJIZL(1, keva, "is_first_show_anchor_guild");
                    AbstractC42900Gsa abstractC42900Gsa4 = this.LJLILLLLZI;
                    if (abstractC42900Gsa4 != null) {
                        abstractC42900Gsa4.LJI(true);
                    } else {
                        o.LJIJI("delegate");
                        throw null;
                    }
                } else {
                    AbstractC42900Gsa abstractC42900Gsa5 = this.LJLILLLLZI;
                    if (abstractC42900Gsa5 != null) {
                        abstractC42900Gsa5.LJI(false);
                    } else {
                        o.LJIJI("delegate");
                        throw null;
                    }
                }
            } else {
                AbstractC42900Gsa abstractC42900Gsa6 = this.LJLILLLLZI;
                if (abstractC42900Gsa6 != null) {
                    abstractC42900Gsa6.LJI(false);
                } else {
                    o.LJIJI("delegate");
                    throw null;
                }
            }
            FMX.LJIIL("label_panel_info_show", new C188727au().LIZ);
            return;
        }
        AbstractC42900Gsa abstractC42900Gsa7 = this.LJLILLLLZI;
        if (abstractC42900Gsa7 != null) {
            abstractC42900Gsa7.LIZJ();
        } else {
            o.LJIJI("delegate");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final MultiAnchorPublishModel provideExtensionData() {
        return new MultiAnchorPublishModel();
    }

    public final boolean LJIIIZ() {
        AVMusic currentMusic = LJ().getCurrentMusic();
        if (currentMusic != null) {
            return currentMusic.isCommerceMusic();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        C72818Shy.LJII("lemon8_add_anchor_event", this);
        C72818Shy.LJII("music_add_playlist_anchor_event", this);
        C72818Shy.LJII("ba_product_link_attach_video", this);
        C72818Shy.LJII("ba_product_link_status_update", this);
        java.util.Map LJI = AnchorListManager.LJI();
        if (LJI != null) {
            Iterator it = LJI.entrySet().iterator();
            while (it.hasNext()) {
                ((AnchorPublishStruct) ((Map.Entry) it.next()).getValue()).setOnClickAction(C42911Gsl.LJLIL);
            }
        }
        if (C53258KvG.LIZIZ()) {
            this.LJLZ.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        String LJJIFFI;
        IAVPublishExtension.DefaultImpls.onResume(this);
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        if (repo != null && (LJJIFFI = C79057V0z.LJJIFFI(repo, "ec_anchor_data")) != null) {
            AnchorTransData anchorTransData = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), LJJIFFI, C65330PkU.LIZJ(C65352Pkq.LJI(AnchorTransData.class)));
                if (!(fromJson instanceof AnchorTransData)) {
                    fromJson = null;
                }
                anchorTransData = (AnchorTransData) fromJson;
            } catch (s unused) {
            }
            if (anchorTransData != null) {
                LJ().getExtensionDataRepo().getUpdateAnchors().setValue(LIZ(anchorTransData));
                repo.erase("ec_anchor_data");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final UrlModel getAnchorIconUrl() {
        return this.LJLLI;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getAnchorText() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean isDisplayAnchor() {
        return this.LJLLILLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList LIZJ(java.util.ArrayList r10) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r10.iterator()
        L9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r3 = r10.next()
            com.ss.android.ugc.aweme.common.AnchorTransData r3 = (com.ss.android.ugc.aweme.common.AnchorTransData) r3
            java.util.Iterator r9 = r4.iterator()
        L19:
            boolean r0 = r9.hasNext()
            r2 = 0
            if (r0 == 0) goto L2b
            java.lang.Object r5 = r9.next()
            com.ss.android.ugc.aweme.common.AnchorTransData r5 = (com.ss.android.ugc.aweme.common.AnchorTransData) r5
            if (r5 != 0) goto L31
        L28:
            if (r2 == 0) goto L19
            r2 = 1
        L2b:
            if (r2 != 0) goto L9
            r4.add(r3)
            goto L9
        L31:
            int r1 = r3.getBusinessType()
            X.Gt8 r0 = X.EnumC42934Gt8.ANCHOR_LIBRARY
            int r0 = r0.getTYPE()
            if (r1 != r0) goto L6f
            java.lang.String r1 = r3.getExtra()
            java.lang.String r8 = "JSONObject(it).optString…onstants.KEY_MATERIAL_ID)"
            java.lang.String r7 = "id"
            java.lang.String r6 = ""
            if (r1 == 0) goto L56
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L56
            r0.<init>(r1)     // Catch: java.lang.Exception -> L56
            java.lang.String r2 = r0.optString(r7)     // Catch: java.lang.Exception -> L56
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r8)     // Catch: java.lang.Exception -> L56
            goto L57
        L56:
            r2 = r6
        L57:
            java.lang.String r1 = r5.getExtra()
            if (r1 == 0) goto L6a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = r0.optString(r7)     // Catch: java.lang.Exception -> L6a
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r8)     // Catch: java.lang.Exception -> L6a
            r6 = r0
        L6a:
            boolean r2 = kotlin.jvm.internal.o.LJ(r2, r6)
            goto L28
        L6f:
            int r1 = r3.getBusinessType()
            X.Gt8 r0 = X.EnumC42934Gt8.MUSIC_PLAYLIST
            int r0 = r0.getTYPE()
            if (r1 == r0) goto L87
            int r1 = r3.getBusinessType()
            X.Gt8 r0 = X.EnumC42934Gt8.UG_PICK
            int r0 = r0.getTYPE()
            if (r1 != r0) goto L94
        L87:
            java.lang.String r1 = r3.getSubtype()
            java.lang.String r0 = r5.getSubtype()
            boolean r2 = kotlin.jvm.internal.o.LJ(r1, r0)
            goto L28
        L94:
            java.lang.String r1 = r3.getTitle()
            java.lang.String r0 = r5.getTitle()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L28
            int r1 = r3.getBusinessType()
            X.Gt8 r0 = X.EnumC42934Gt8.PROP
            int r0 = r0.getTYPE()
            if (r1 == r0) goto Ld0
            int r1 = r3.getBusinessType()
            X.Gt8 r0 = X.EnumC42934Gt8.TIKTOK_GAME
            int r0 = r0.getTYPE()
            if (r1 == r0) goto Ld0
            java.lang.String r1 = r3.getExtra()
            java.lang.String r0 = r5.getExtra()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L28
            java.lang.String r0 = "anchor_deduplicate_condition_switch"
            boolean r0 = X.C19N.LJ(r0, r2)
            if (r0 == 0) goto L28
        Ld0:
            r2 = 1
            goto L28
        Ld3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42898GsY.LIZJ(java.util.ArrayList):java.util.ArrayList");
    }

    public static boolean LJIIIIZZ(AnchorPublishStruct anchorPublishStruct) {
        String str = anchorPublishStruct.scheme;
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(AnchorTransData anchorTransData) {
        if (anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(List list) {
        int i;
        if (C53258KvG.LIZ() == 4) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                AnchorTransData anchorTransData = (AnchorTransData) obj;
                if (anchorTransData.getBusinessType() == EnumC42934Gt8.PROP.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.MV_TEMPLATE.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_SOUND_SYNC.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.DONATION_STICKER.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_LIBRARY.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.TTS_VOICE.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_VOICECONVERSION.getTYPE() || anchorTransData.getBusinessType() == EnumC42934Gt8.ANCHOR_AUTO_CUT.getTYPE()) {
                    arrayList.add(obj);
                }
            }
            list.removeAll(arrayList);
        }
        if (list.isEmpty() || list.size() == 1) {
            return;
        }
        if (list.size() > 1) {
            C40675Fxn.LJJLIIIJ(list, new IDComparatorS35S0000000_7(14));
        }
        if (list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((AnchorTransData) ListProtector.get(list, 0)).getBusinessType() == ((AnchorTransData) it.next()).getBusinessType() && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        list.removeAll(ORZ.LLIILZL(ORZ.LLIIIL(C78842Uww.LJJ(0, i - 1), C78842Uww.LJJ(i, list.size())), list));
    }

    public final List<AnchorTransData> LIZ(AnchorTransData anchorTransData) {
        ArrayList arrayList = new ArrayList();
        List<AnchorTransData> value = LJ().getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value != null) {
            Iterator<AnchorTransData> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        arrayList.add(anchorTransData);
        return LIZJ(arrayList);
    }

    public final List<AnchorTransData> LIZIZ(AnchorTransData anchorTransData) {
        ArrayList arrayList = new ArrayList();
        List<AnchorTransData> value = LJ().getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AnchorTransData anchorTransData2 : value) {
                AnchorTransData anchorTransData3 = anchorTransData2;
                if (anchorTransData3.getBusinessType() != EnumC42934Gt8.LEMON8_ANCHOR.getTYPE() && anchorTransData3.getBusinessType() != EnumC42934Gt8.LEMON8_GENERAL_ANCHOR.getTYPE()) {
                    arrayList2.add(anchorTransData2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        arrayList.add(anchorTransData);
        return LIZJ(arrayList);
    }

    public final void LIZLLL(AnchorPublishStruct anchorPublishStruct) {
        C26284ATg c26284ATg;
        if (anchorPublishStruct.isNew) {
            anchorPublishStruct.isNew = false;
            AnchorListManager.LJI--;
            DialogC42922Gsw dialogC42922Gsw = this.LJLLJ;
            if (dialogC42922Gsw != null && (c26284ATg = dialogC42922Gsw.LJLLL) != null) {
                c26284ATg.notifyDataSetChanged();
            }
            AnchorListManager.LJIIJJI(anchorPublishStruct);
            LJIJ();
        }
        String shootWay = LJ().getMobParam().getShootWay();
        String creationId = LJ().getMobParam().getCreationId();
        Fragment fragment = this.LJLJI;
        if (fragment != null) {
            SmartRoute LIZ = m0.LIZ(fragment.getContext(), anchorPublishStruct.scheme, "shoot_way", shootWay, "creation_id", creationId);
            LIZ.withParam("title", anchorPublishStruct.title);
            LIZ.withParam("type", anchorPublishStruct.type);
            LIZ.withParam("subtype", anchorPublishStruct.subtype);
            LIZ.open();
            DialogC42922Gsw dialogC42922Gsw2 = this.LJLLJ;
            if (dialogC42922Gsw2 != null) {
                dialogC42922Gsw2.dismiss();
                return;
            }
            return;
        }
        o.LJIJI("fragment");
        throw null;
    }

    public final void LJFF(AnchorPublishStruct anchorPublishStruct) {
        String str = "";
        Lemon8GeneralAnchorContentInfo lemon8GeneralAnchorContentInfo = null;
        if (anchorPublishStruct.type == EnumC42934Gt8.LEMON8_ANCHOR.getTYPE()) {
            try {
                Lemon8AnchorContentInfo lemon8AnchorContentInfo = (Lemon8AnchorContentInfo) GsonHolder.LIZLLL().LIZ().LJI(anchorPublishStruct.content, Lemon8AnchorContentInfo.class);
                if (lemon8AnchorContentInfo == null) {
                    return;
                }
                AbstractC42900Gsa abstractC42900Gsa = this.LJLILLLLZI;
                if (abstractC42900Gsa != null) {
                    Context context = abstractC42900Gsa.getContext();
                    if (o.LJ(anchorPublishStruct.subtype, "lemon8_campaign")) {
                        String selectionUrl = lemon8AnchorContentInfo.getSelectionUrl();
                        if (selectionUrl.length() != 0 && !ujb.s.LJJJLZIJ(selectionUrl, "playlist_author_openid", false)) {
                            String LIZ = C243939hl.LIZ("music_resso_openid_%s");
                            if (LIZ.length() != 0) {
                                str = C243939hl.LIZ.getString(LIZ, "");
                                o.LJIIIIZZ(str, "keva.getString(key, \"\")");
                            }
                            if (str.length() != 0) {
                                selectionUrl = a1.LJ(selectionUrl, "&playlist_author_openid=", str);
                            }
                        }
                        SmartRouter.buildRoute(context, selectionUrl).open();
                        return;
                    }
                    return;
                }
                o.LJIJI("delegate");
                throw null;
            } catch (Exception unused) {
                return;
            }
        }
        if (anchorPublishStruct.type == EnumC42934Gt8.LEMON8_GENERAL_ANCHOR.getTYPE()) {
            try {
                lemon8GeneralAnchorContentInfo = (Lemon8GeneralAnchorContentInfo) GsonHolder.LIZLLL().LIZ().LJI(anchorPublishStruct.content, Lemon8GeneralAnchorContentInfo.class);
            } catch (Exception unused2) {
            }
            if (lemon8GeneralAnchorContentInfo == null) {
                return;
            }
            int type = EnumC42934Gt8.LEMON8_GENERAL_ANCHOR.getTYPE();
            String subtype = lemon8GeneralAnchorContentInfo.getSubtype();
            String LJJJJZ = ujb.o.LJJJJZ(lemon8GeneralAnchorContentInfo.getKeyword(), "|", "·", false);
            String str2 = anchorPublishStruct.content;
            if (str2 != null) {
                str = str2;
            }
            AnchorTransData anchorTransData = new AnchorTransData(type, str, LJJJJZ, null, null, null, null, false, null, null, null, null, subtype, false, 12280, null);
            anchorTransData.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
            LJ().getExtensionDataRepo().getUpdateAnchors().setValue(LIZIZ(anchorTransData));
            LJIILL(1, "Lemon8 | app");
        }
    }

    public final void LJI(AnchorPublishStruct anchorPublishStruct) {
        AnchorPlaylistInfo anchorPlaylistInfo;
        try {
            anchorPlaylistInfo = (AnchorPlaylistInfo) GsonHolder.LIZLLL().LIZ().LJI(anchorPublishStruct.content, AnchorPlaylistInfo.class);
        } catch (Exception unused) {
        }
        if (anchorPlaylistInfo != null) {
            AbstractC42900Gsa abstractC42900Gsa = this.LJLILLLLZI;
            if (abstractC42900Gsa != null) {
                Context context = abstractC42900Gsa.getContext();
                if (o.LJ(anchorPublishStruct.subtype, "ttm_playlist")) {
                    SmartRouter.buildRoute(context, anchorPlaylistInfo.getSelectionUrl()).open();
                    return;
                }
                DialogC42922Gsw dialogC42922Gsw = this.LJLLJ;
                if (dialogC42922Gsw == null) {
                    return;
                }
                dialogC42922Gsw.dismiss();
                return;
            }
            o.LJIJI("delegate");
            throw null;
        }
        DialogC42922Gsw dialogC42922Gsw2 = this.LJLLJ;
        if (dialogC42922Gsw2 != null) {
            dialogC42922Gsw2.dismiss();
        }
    }

    public final boolean LJIILLIIL(AnchorPublishStruct anchorPublishStruct) {
        if (anchorPublishStruct.type != EnumC42934Gt8.PAID_COLLECTION.getTYPE() || LJIIIZ() || !C19N.LJ("creator_m10n_android_paid_content_prevent_non_commercial_music_is_enabled", false)) {
            return false;
        }
        return true;
    }

    public final boolean LJIJI(List<AnchorTransData> list) {
        boolean z = false;
        this.LJLLLLLL = 0;
        if (list != null) {
            Iterator<AnchorTransData> it = list.iterator();
            while (it.hasNext()) {
                if (LJIIJ(it.next())) {
                    this.LJLLLLLL++;
                    z = true;
                }
            }
        }
        AVExternalServiceImpl.LIZ().publishService().setECCommerceAnchor(z);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> createAnchorInfoList) {
        o.LJIIIZ(createAnchorInfoList, "createAnchorInfoList");
        if (this.LJLILLLLZI == null) {
            return;
        }
        Fragment fragment = this.LJLJI;
        if (fragment != null) {
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.runOnUiThread(new ARunnableS26S0200000_7(this, createAnchorInfoList, 23));
                return;
            }
            return;
        }
        o.LJIJI("fragment");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean haveAnchors(int i) {
        List<AnchorTransData> value = LJ().getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value == null || value.isEmpty()) {
            return false;
        }
        Iterator<AnchorTransData> it = value.iterator();
        while (it.hasNext()) {
            if (it.next().getBusinessType() == i) {
                return true;
            }
        }
        return false;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAsyncAnchor(C7TR c7tr) {
        AnchorTransData anchorTransData;
        if (c7tr != null && (anchorTransData = c7tr.LJLIL) != null) {
            anchorTransData.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
            if (C53258KvG.LIZIZ()) {
                AbstractC42900Gsa abstractC42900Gsa = this.LJLILLLLZI;
                if (abstractC42900Gsa != null) {
                    abstractC42900Gsa.LIZ();
                    LJ().getExtensionDataRepo().getUpdateAnchors().setValue(new ArrayList());
                } else {
                    o.LJIJI("delegate");
                    throw null;
                }
            }
            LJ().getExtensionDataRepo().getUpdateAnchors().setValue(LIZ(anchorTransData));
        }
        DialogC42922Gsw dialogC42922Gsw = this.LJLLJ;
        if (dialogC42922Gsw != null) {
            dialogC42922Gsw.dismiss();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAsyncRemoveAnchor(C42908Gsi event) {
        o.LJIIIZ(event, "event");
        ArrayList arrayList = new ArrayList();
        List<AnchorTransData> value = LJ().getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AnchorTransData anchorTransData : value) {
                if (anchorTransData.getBusinessType() != event.LJLIL) {
                    arrayList2.add(anchorTransData);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        LJ().getExtensionDataRepo().getUpdateAnchors().setValue(LIZJ(arrayList));
        DialogC42922Gsw dialogC42922Gsw = this.LJLLJ;
        if (dialogC42922Gsw != null) {
            dialogC42922Gsw.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onBackPressed(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onExtensionEnable(java.util.Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map) {
        IAVPublishExtension.DefaultImpls.onExtensionEnable(this, map);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroacastReceiver(C56642Ke broadCastEvent) {
        DialogC42922Gsw dialogC42922Gsw;
        DialogC42922Gsw dialogC42922Gsw2;
        DialogC42922Gsw dialogC42922Gsw3;
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        try {
            String string = JSONObjectProtectorUtils.getString(broadCastEvent.LJLIL, "eventName");
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != -1482957736) {
                    if (hashCode != 972249363) {
                        if (hashCode == 1746687142 && string.equals("leadsGenStatusChangeNotification") && GetLeadsAnchorService.LIZLLL().LIZJ(broadCastEvent.LJLIL) && (dialogC42922Gsw3 = this.LJLLJ) != null) {
                            dialogC42922Gsw3.LJJII();
                        }
                    } else if (string.equals("enterGetLeadsPageNotification") && GetLeadsAnchorService.LIZLLL().LIZIZ(broadCastEvent.LJLIL) && (dialogC42922Gsw2 = this.LJLLJ) != null) {
                        dialogC42922Gsw2.LJJII();
                    }
                } else if (string.equals("closeLeadForm") && GetLeadsAnchorService.LIZLLL().LIZ(5) && (dialogC42922Gsw = this.LJLLJ) != null) {
                    dialogC42922Gsw.LJJII();
                }
            }
            String string2 = JSONObjectProtectorUtils.getString(broadCastEvent.LJLIL, "eventName");
            if (o.LJ(string2, "anchor_merch_pick_content") && string2 != null && broadCastEvent.LJLIL.has("data")) {
                String data = broadCastEvent.LJLIL.optString("data");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("jsb_param", data);
                c188727au.LJIIIZ("where", "MultiAnchorPublishExtension");
                FMX.LJIIL("rd_tiktokec_shop_anchor_jsb_add_event", c188727au.LIZ);
                JSONObject jSONObject = new JSONObject(data);
                int optInt = jSONObject.optInt("type", EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE());
                String optString = jSONObject.optString("keyword", "");
                String optString2 = jSONObject.optString("subtype", "");
                String optString3 = jSONObject.optString("url", "");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                o.LJIIIIZZ(data, "data");
                AnchorTransData anchorTransData = new AnchorTransData(optInt, data, optString, null, 1, null, null, false, optString3, null, Long.valueOf(elapsedRealtime), null, optString2, false, 10984, null);
                if (C53258KvG.LIZIZ()) {
                    LJ().getExtensionDataRepo().getUpdateAnchors().setValue(new ArrayList());
                }
                LJ().getExtensionDataRepo().getUpdateAnchors().setValue(LIZ(anchorTransData));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("e_stack_trace", C36747EbX.LIZIZ(e));
            c188727au2.LJFF(broadCastEvent.LJLIL, "extra_data");
            c188727au2.LJIIIZ("where", "MultiAnchorPublishExtension");
            FMX.LJIIL("rd_tiktokec_shop_anchor_exception", c188727au2.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onPublish(this, publishOutput);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        JSONObject jSONObject;
        String jSONObject2;
        UrlModel urlModel;
        InterfaceC78280Uns interfaceC78280Uns;
        java.util.Map LJI;
        InterfaceC78280Uns interfaceC78280Uns2;
        if (o.LJ(c199097rd.LJLIL, "music_add_playlist_anchor_event")) {
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns3 != null) {
                int i = interfaceC78280Uns3.getInt("business_type");
                String string = interfaceC78280Uns3.getString("subtype");
                String string2 = interfaceC78280Uns3.getString("keyword");
                JSONObject jSONObject3 = new JSONObject(interfaceC78280Uns3.getString("anchor_content"));
                String jSONObject4 = jSONObject3.put("third_id", jSONObject3.optString("id", "")).toString();
                o.LJIIIIZZ(jSONObject4, "json.put(\"third_id\", jso…ing(\"id\", \"\")).toString()");
                AnchorTransData anchorTransData = new AnchorTransData(i, jSONObject4, string2, null, null, null, null, false, null, null, null, null, string, false, 12280, null);
                anchorTransData.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
                LJ().getExtensionDataRepo().getUpdateAnchors().setValue(LIZ(anchorTransData));
            }
            DialogC42922Gsw dialogC42922Gsw = this.LJLLJ;
            if (dialogC42922Gsw != null) {
                dialogC42922Gsw.dismiss();
            }
        } else if (o.LJ(c199097rd.LJLIL, "lemon8_add_anchor_event")) {
            InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns4 != null) {
                int LJJIJIIJI = u.LJJIJIIJI(interfaceC78280Uns4, "type", EnumC42934Gt8.LEMON8_ANCHOR.getTYPE());
                String LJJIJIL = u.LJJIJIL(interfaceC78280Uns4, "subtype", "");
                String LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns4, "keyword", "");
                if (LJJIJIL2.length() == 0) {
                    return;
                }
                String LJJIJIL3 = u.LJJIJIL(interfaceC78280Uns4, "anchor_content", "");
                if (C78685UuP.LJJJZ(LJJIJIL3)) {
                    try {
                        jSONObject = new JSONObject(LJJIJIL3);
                    } catch (JSONException unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                try {
                    jSONObject2 = jSONObject.put("third_id", u.LJJIJIL(interfaceC78280Uns4, "id", "")).toString();
                } catch (JSONException unused2) {
                    jSONObject2 = jSONObject.toString();
                }
                o.LJIIIIZZ(jSONObject2, "try {\n                  …tring()\n                }");
                try {
                    urlModel = (UrlModel) GsonHolder.LIZLLL().LIZ().LJI(u.LJJIJIL(interfaceC78280Uns4, "lemon8_icon", ""), UrlModel.class);
                } catch (Exception unused3) {
                    urlModel = null;
                }
                AnchorTransData anchorTransData2 = new AnchorTransData(LJJIJIIJI, jSONObject2, ujb.o.LJJJJZ(LJJIJIL2, "|", "·", false), null, null, null, urlModel, false, null, null, null, null, LJJIJIL, false, 12216, null);
                anchorTransData2.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
                LJ().getExtensionDataRepo().getUpdateAnchors().setValue(LIZIZ(anchorTransData2));
                if (LJJIJIIJI == EnumC42934Gt8.LEMON8_GENERAL_ANCHOR.getTYPE()) {
                    LJJIJIL2 = "Lemon8 | app";
                }
                LJIILL(0, LJJIJIL2);
            }
            DialogC42922Gsw dialogC42922Gsw2 = this.LJLLJ;
            if (dialogC42922Gsw2 != null) {
                dialogC42922Gsw2.dismiss();
            }
        }
        if (o.LJ(c199097rd.LJLIL, "ba_product_link_attach_video") && (interfaceC78280Uns2 = c199097rd.LJLILLLLZI) != null) {
            try {
                EnumC42934Gt8 enumC42934Gt8 = EnumC42934Gt8.BA_PRODUCT_ANCHOR;
                C2U8.LIZ(new C42908Gsi(enumC42934Gt8.getTYPE()));
                int type = enumC42934Gt8.getTYPE();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("add_from", this.LJLIL);
                jSONObject5.put("third_id", u.LJJIJIL(interfaceC78280Uns2, "link_id", ""));
                jSONObject5.put("keyword", u.LJJIJIL(interfaceC78280Uns2, "cta_text", ""));
                jSONObject5.put("name", u.LJJIJIL(interfaceC78280Uns2, "cta_text_key", ""));
                jSONObject5.put("url", u.LJJIJIL(interfaceC78280Uns2, "website", ""));
                String jSONObject6 = jSONObject5.toString();
                o.LJIIIIZZ(jSONObject6, "JSONObject().apply {\n   …             }.toString()");
                C2U8.LIZ(new C7TR(new AnchorTransData(type, jSONObject6, u.LJJIJIL(interfaceC78280Uns2, "cta_text", ""), null, 1, null, null, false, null, null, null, null, null, false, 16360, null)));
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
            DialogC42922Gsw dialogC42922Gsw3 = this.LJLLJ;
            if (dialogC42922Gsw3 != null) {
                dialogC42922Gsw3.dismiss();
            }
        }
        if (o.LJ(c199097rd.LJLIL, "ba_product_link_status_update") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null && (LJI = AnchorListManager.LJI()) != null) {
            Iterator it = LJI.entrySet().iterator();
            while (it.hasNext()) {
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it.next()).getValue();
                if (anchorPublishStruct.type == EnumC42934Gt8.BA_PRODUCT_ANCHOR.getTYPE()) {
                    anchorPublishStruct.baProductLinkState = u.LJJIJIIJI(interfaceC78280Uns, "status", 0);
                    AnchorListManager.LJIILIIL(LJI);
                    DialogC42922Gsw dialogC42922Gsw4 = this.LJLLJ;
                    if (dialogC42922Gsw4 != null) {
                        dialogC42922Gsw4.LJJII();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onSaveDraft(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void registerOnAddAnchorListener(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        ((ArrayList) this.LJZI).add(callback);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void unregisterOnAddAnchorListener(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        ((ArrayList) this.LJZI).remove(callback);
    }

    public static boolean LJII(Integer num, List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = ((AnchorPublishStruct) it.next()).type;
            if (num != null && i == num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public static void LJIILL(int i, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_type", "Lemon8");
        c188727au.LJIIIZ("anchor_name", str);
        c188727au.LIZLLL(i, "is_auto_choose");
        FMX.LJIIL("choose_anchor", c188727au.LIZ);
    }

    public final void LJIIJJI(AnchorPublishStruct anchorPublishStruct, View view) {
        IBAAnchorService LJII = BAAnchorServiceImpl.LJII();
        int i = anchorPublishStruct.baProductLinkState;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        LJII.LJ(i, context, new AqS157S0100000_7(this, 549));
    }

    public final void LJIIL(AnchorPublishStruct anchorPublishStruct, View view) {
        IBAAnchorService LJII = BAAnchorServiceImpl.LJII();
        int i = anchorPublishStruct.getLeadsAnchorState;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        LJII.LIZJ(i, context, new AqS154S0200000_7(anchorPublishStruct, this, 104), new AqS157S0100000_7(this, 550));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0246 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.util.List<com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct> r22, java.util.List<com.ss.android.ugc.aweme.common.AnchorTransData> r23) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42898GsY.LJIILJJIL(java.util.List, java.util.List):void");
    }

    public final void LJIIZILJ(String str, AnchorPublishStruct anchorPublishStruct) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        c188727au.LJIIIZ("page_name", "video_add_link");
        c188727au.LJIIIZ("anchor_type", str);
        c188727au.LIZLLL(anchorPublishStruct.type, "button_for");
        c188727au.LJIIIZ("creation_id", LJ().getMobParam().getCreationId());
        c188727au.LJIIIZ("traceparent", PII.LIZIZ());
        FMX.LJIIL("tiktokmusic_video_add_link_click", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onActivityResult(int i, int i2, Intent intent) {
        IAVPublishExtension.DefaultImpls.onActivityResult(this, i, i2, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x04db, code lost:
    
        if (r8 != null) goto L220;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b3 A[Catch: Exception -> 0x02c3, TryCatch #2 {Exception -> 0x02c3, blocks: (B:134:0x02ad, B:136:0x02b3, B:198:0x02bf, B:199:0x02c2), top: B:133:0x02ad }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d7 A[LOOP:4: B:172:0x03d1->B:174:0x03d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02bf A[Catch: Exception -> 0x02c3, TryCatch #2 {Exception -> 0x02c3, blocks: (B:134:0x02ad, B:136:0x02b3, B:198:0x02bf, B:199:0x02c2), top: B:133:0x02ad }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ec  */
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(androidx.fragment.app.Fragment r47, android.view.View r48, androidx.lifecycle.LifecycleOwner r49, android.widget.LinearLayout r50, android.os.Bundle r51, com.ss.android.ugc.aweme.services.publish.AVPublishContentType r52, com.ss.android.ugc.aweme.services.publish.PublishOutput r53, com.ss.android.ugc.aweme.services.publish.ExtensionMisc r54, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback r55) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42898GsY.onCreate(androidx.fragment.app.Fragment, android.view.View, androidx.lifecycle.LifecycleOwner, android.widget.LinearLayout, android.os.Bundle, com.ss.android.ugc.aweme.services.publish.AVPublishContentType, com.ss.android.ugc.aweme.services.publish.PublishOutput, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback):void");
    }
}
