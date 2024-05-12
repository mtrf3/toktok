package X;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1DJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DJ implements InterfaceC06380Mw, C0K7 {
    public static final C1DJ LJLIL = new C1DJ();
    public static volatile boolean LJLILLLLZI = true;

    public static final boolean LJJI(Object obj) {
        return obj != null;
    }

    public static JSONObject LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version_name", "1.0.0-rc.51.1-bugfix");
            jSONObject.put("sdk_version_code", 100005151L);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public static final void LIZ(java.util.Map map) {
        Long l;
        String str;
        String l2;
        Room LJJIL = C29306Beo.LJJIL(DataChannelGlobal.LJLJJI);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        String str2 = null;
        if (LIZIZ != null) {
            l = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId());
        } else {
            l = null;
        }
        OSZ[] oszArr = new OSZ[3];
        if (LJJIL != null) {
            str2 = LJJIL.getIdStr();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        oszArr[0] = new OSZ("room_id", str2);
        if (LJJIL == null || (str = Long.valueOf(LJJIL.getOwnerUserId()).toString()) == null) {
            str = "";
        }
        oszArr[1] = new OSZ("anchor_id", str);
        if (l != null && (l2 = l.toString()) != null) {
            str3 = l2;
        }
        oszArr[2] = new OSZ("guest_id", str3);
        map.putAll(C113554cx.LJJL(oszArr));
    }

    public static final void LIZIZ(java.util.Map map) {
        OSZ LJFF = TWL.LJFF();
        map.putAll(C113554cx.LJJL(new OSZ("layout_setting", LJFF.getFirst()), new OSZ("window_setting", LJFF.getSecond())));
    }

    public static void LJIIIIZZ(String str) {
        if (C61359O6h.LJI() != null) {
            StringBuilder sb = new StringBuilder();
            LJJIII(sb, 0L, str, null);
            C61359O6h.LJI().LJZ(sb.toString());
        }
    }

    public static void LJIIJ(String str) {
        LJIIIZ(0L, str, null);
    }

    public static final Object LJIIL(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        return c109544Rq.getLocalCache(501);
    }

    public static final String LJIILIIL(Room room) {
        BattleSetting battleSetting;
        int i;
        if (room != null && room.getLinkMicInfo() != null) {
            RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
            o.LJIIIIZZ(linkMicInfo, "linkMicInfo");
            if (linkMicInfo.channelId > 0 && linkMicInfo.rivalAnchorId > 0) {
                BattleInfoResponse battleInfoResponse = linkMicInfo.battleInfo;
                if (battleInfoResponse == null || (battleSetting = battleInfoResponse.setting) == null || ((i = battleSetting.status) != 1 && i != 3)) {
                    return "anchor";
                }
                return "manual_pk";
            }
            List<Long> list = linkMicInfo.audienceIdList;
            if (list != null && list.size() > 0) {
                return "audience";
            }
            return "normal";
        }
        return "normal";
    }

    public static final String LJIILJJIL(User user) {
        MusicTabClaimInfo musicTabClaimInfo;
        String num;
        o.LJIIIZ(user, "<this>");
        if (user.getShowArtistPlaylist() == 1) {
            return ClaimStatus.APPROVED.toString();
        }
        MusicTabInfo musicTabInfo = user.getMusicTabInfo();
        if (musicTabInfo != null && (musicTabClaimInfo = musicTabInfo.getMusicTabClaimInfo()) != null && (num = Integer.valueOf(musicTabClaimInfo.getStatus()).toString()) != null) {
            return num;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final BaseTemplate LJIILL(C109544Rq c109544Rq) {
        BaseTemplate baseTemplate;
        o.LJIIIZ(c109544Rq, "<this>");
        Object LJIIL = LJIIL(c109544Rq);
        if ((LJIIL instanceof BaseTemplate) && (baseTemplate = (BaseTemplate) LJIIL) != null) {
            return baseTemplate;
        }
        BaseTemplate LJJJ = C78963Uyt.LJJJ(c109544Rq);
        if (LJJJ == null) {
            return null;
        }
        c109544Rq.putLocalCache(501, LJJJ);
        return LJJJ;
    }

    public static final ReferenceInfoHint LJIIZILJ(C109544Rq c109544Rq) {
        ReferenceInfoHint referenceInfoHint;
        String str;
        o.LJIIIZ(c109544Rq, "<this>");
        Object localCache = c109544Rq.getLocalCache(502);
        if (localCache instanceof ReferenceInfoHint) {
            referenceInfoHint = (ReferenceInfoHint) localCache;
        } else {
            referenceInfoHint = null;
        }
        if (referenceInfoHint != null) {
            return referenceInfoHint;
        }
        ReferenceInfo referenceInfo = c109544Rq.getReferenceInfo();
        if (referenceInfo != null) {
            str = referenceInfo.hint;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            ReferenceInfoHint referenceInfoHint2 = (ReferenceInfoHint) C62070OXq.LIZ(ReferenceInfoHint.class, str);
            if (referenceInfoHint2 == null) {
                return null;
            }
            c109544Rq.putLocalCache(502, referenceInfoHint2);
            return referenceInfoHint2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final BaseContent LJIJ(C109544Rq c109544Rq) {
        long j;
        BaseContent baseContent;
        o.LJIIIZ(c109544Rq, "<this>");
        Object localCache = c109544Rq.getLocalCache(503);
        if ((localCache instanceof BaseContent) && (baseContent = (BaseContent) localCache) != null) {
            return baseContent;
        }
        ReferenceInfoHint LJIIZILJ = LJIIZILJ(c109544Rq);
        if (LJIIZILJ == null) {
            return null;
        }
        C110134Tx c110134Tx = EnumC110124Tw.Companion;
        int refmsg_type = LJIIZILJ.getRefmsg_type();
        String refMsgSubType = LJIIZILJ.getRefMsgSubType();
        String refmsg_content = LJIIZILJ.getRefmsg_content();
        Long LJJIZ = C38350F3i.LJJIZ(LJIIZILJ.getRefmsg_uid());
        if (LJJIZ != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        c110134Tx.getClass();
        BaseContent LIZIZ = C110134Tx.LIZIZ(refmsg_type, refMsgSubType, refmsg_content, false, j);
        if (LIZIZ == null) {
            return null;
        }
        c109544Rq.putLocalCache(503, LIZIZ);
        return LIZIZ;
    }

    public static void LJIJJ(String str) {
        LJIJI(0L, str);
    }

    public static final boolean LJIJJLI(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isEnableMidRoll()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIL(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        return o.LJ(c109544Rq.getLocalCache(507), Boolean.TRUE);
    }

    public static final boolean LJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getRollType() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIFFI(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        return o.LJ(c109544Rq.getLocalCache(505), Boolean.TRUE);
    }

    public static final boolean LJJIJIIJI(User user) {
        MusicTabInfo musicTabInfo;
        MusicTabInfo musicTabInfo2;
        MusicTabClaimInfo musicTabClaimInfo;
        o.LJIIIZ(user, "<this>");
        if (HG3.LJIILL().isChildrenMode() || !HG3.LJIILL().isLogin() || user.getShowArtistPlaylist() != 0 || (musicTabInfo = user.getMusicTabInfo()) == null || !musicTabInfo.getShowGhostMusicTab() || (musicTabInfo2 = user.getMusicTabInfo()) == null || musicTabInfo2.getMusicTabClaimInfo() == null) {
            return false;
        }
        MusicTabInfo musicTabInfo3 = user.getMusicTabInfo();
        if ((musicTabInfo3 != null && (musicTabClaimInfo = musicTabInfo3.getMusicTabClaimInfo()) != null && musicTabClaimInfo.getStatus() == ClaimStatus.UNCLAIMED.getValue()) || !Keva.getRepo("repo_profile_music").getBoolean("key_show_claim_status_tab", true)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(User user) {
        o.LJIIIZ(user, "<this>");
        if (LJJIJIL(user) || LJJIJIIJI(user)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIL(User user) {
        MusicTabInfo musicTabInfo;
        MusicTabInfo musicTabInfo2;
        MusicTabClaimInfo musicTabClaimInfo;
        o.LJIIIZ(user, "<this>");
        if (HG3.LJIILL().isChildrenMode() || !HG3.LJIILL().isLogin() || user.getShowArtistPlaylist() != 0 || (musicTabInfo = user.getMusicTabInfo()) == null || !musicTabInfo.getShowGhostMusicTab()) {
            return false;
        }
        MusicTabInfo musicTabInfo3 = user.getMusicTabInfo();
        if ((musicTabInfo3 != null && musicTabInfo3.getMusicTabClaimInfo() != null && ((musicTabInfo2 = user.getMusicTabInfo()) == null || (musicTabClaimInfo = musicTabInfo2.getMusicTabClaimInfo()) == null || musicTabClaimInfo.getStatus() != ClaimStatus.UNCLAIMED.getValue())) || !Keva.getRepo("repo_profile_music").getBoolean("key_show_ghost_music_tab", true)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIL(JSONObject params) {
        o.LJIIIZ(params, "params");
        String anchorData = params.optString("ec_anchor_data");
        if (anchorData == null || anchorData.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject(anchorData);
        int optInt = jSONObject.optInt("type", 6);
        String optString = jSONObject.optString("keyword", "");
        String optString2 = jSONObject.optString("subtype", "");
        String optString3 = jSONObject.optString("url", "");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        o.LJIIIIZZ(anchorData, "anchorData");
        boolean z = false;
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeString("ec_anchor_data", C27739Aud.LJI(new AnchorTransData(optInt, anchorData, optString, null, 1, null == true ? 1 : 0, null == true ? 1 : 0, z, optString3, null == true ? 1 : 0, Long.valueOf(elapsedRealtime), null == true ? 1 : 0, optString2, z, 10984, null == true ? 1 : 0)));
    }

    public static C73181Snp LJJIZ(C70846RrG c70846RrG) {
        LifecycleOwner lifecycleOwner = c70846RrG.LIZJ;
        InterfaceC61500OBs interfaceC61500OBs = null;
        if (!(lifecycleOwner instanceof InterfaceC73150SnK)) {
            lifecycleOwner = null;
        }
        InterfaceC73150SnK interfaceC73150SnK = (InterfaceC73150SnK) lifecycleOwner;
        if (interfaceC73150SnK != null) {
            SQT sqt = new SQT(c70846RrG, c70846RrG.LIZJ, c70846RrG.LIZIZ);
            C60930Nvi c60930Nvi = sqt.LJLIL;
            if (c60930Nvi != null) {
                interfaceC61500OBs = c60930Nvi.LIZ;
            }
            C73181Snp c73181Snp = new C73181Snp(sqt, new C73201So9(sqt), interfaceC73150SnK);
            c73181Snp.LJIIJ = (ListViewModel) interfaceC61500OBs;
            return c73181Snp;
        }
        "realAdapter does not provide ISubscriber, please specify it".toString();
        throw new IllegalArgumentException("realAdapter does not provide ISubscriber, please specify it");
    }

    public static void LJJJ(String str) {
        if (C61359O6h.LJI() != null) {
            StringBuilder sb = new StringBuilder();
            LJJIII(sb, 0L, str, null);
            C61359O6h.LJI().LLLLLZ(sb.toString());
        }
    }

    public static String LJJJI(AbstractC87134YHq abstractC87134YHq) {
        StringBuilder sb = new StringBuilder(abstractC87134YHq.zzd());
        for (int i = 0; i < abstractC87134YHq.zzd(); i++) {
            byte zza = abstractC87134YHq.zza(i);
            if (zza != 34) {
                if (zza != 39) {
                    if (zza != 92) {
                        switch (zza) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                sb.append("\\r");
                                break;
                            default:
                                if (zza >= 32 && zza <= 126) {
                                    sb.append((char) zza);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((zza >>> 6) & 3) + 48));
                                    sb.append((char) (((zza >>> 3) & 7) + 48));
                                    sb.append((char) ((zza & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static final int LIZJ(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final void LJI(String str, boolean z) {
        if (!z && C84763XOl.LJIIJJI) {
            return;
        }
        String LIZJ = FVR.LIZJ();
        String installId = AppLog.getInstallId();
        if (!C38354F3m.LJ(LIZJ) && !C38354F3m.LJ(installId)) {
            if (C35154Dqw.LIZ()) {
                C67128QWe.LIZIZ.LIZ(str);
                return;
            } else {
                C67125QWb.LJLL.LIZ(str);
                return;
            }
        }
        String LIZIZ = UPJ.LIZIZ("deviceId:", LIZJ, " or iid:", installId, " is empty!");
        QOZ.LIZ(str, "did_or_iid_is_empty", LIZIZ);
        C36922EeM.LIZLLL(6, "ws", LIZIZ);
    }

    public static final boolean LJII(MusicGroup musicGroup, String str) {
        String str2;
        o.LJIIIZ(musicGroup, "<this>");
        if (str == null) {
            return false;
        }
        Music sourceMusic = musicGroup.getSourceMusic();
        if (sourceMusic != null) {
            str2 = sourceMusic.getIdStr();
        } else {
            str2 = null;
        }
        if (!o.LJ(str2, str)) {
            Iterator<Music> it = musicGroup.getSimilarMusics().iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getIdStr(), str)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r3 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.music.model.MusicGroup LJIIJJI(java.lang.String r5, java.util.List r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "musicId"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.Iterator r4 = r6.iterator()
        Le:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L4b
            java.lang.Object r2 = r4.next()
            r1 = r2
            com.ss.android.ugc.aweme.music.model.MusicGroup r1 = (com.ss.android.ugc.aweme.music.model.MusicGroup) r1
            com.ss.android.ugc.aweme.music.model.Music r0 = r1.getSourceMusic()
            if (r0 == 0) goto L26
            java.lang.String r3 = r0.getIdStr()
        L26:
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r5)
            if (r0 != 0) goto L4a
            java.util.List r0 = r1.getSimilarMusics()
            java.util.Iterator r1 = r0.iterator()
        L34:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.music.model.Music r0 = (com.ss.android.ugc.aweme.music.model.Music) r0
            java.lang.String r0 = r0.getIdStr()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 == 0) goto L34
        L4a:
            r3 = r2
        L4b:
            com.ss.android.ugc.aweme.music.model.MusicGroup r3 = (com.ss.android.ugc.aweme.music.model.MusicGroup) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DJ.LJIIJJI(java.lang.String, java.util.List):com.ss.android.ugc.aweme.music.model.MusicGroup");
    }

    public static void LJIJI(long j, String str) {
        if (C61359O6h.LJI() != null) {
            StringBuilder sb = new StringBuilder();
            LJJIII(sb, j, str, null);
            C61359O6h.LJI().LLJJJIL(sb.toString());
        }
    }

    public static final void LJJII(InterfaceC83142Wk6 operateApplyComposeNodes, AbstractC83179Wkh abstractC83179Wkh) {
        o.LJIIIZ(operateApplyComposeNodes, "$this$operateApplyComposeNodes");
        if (abstractC83179Wkh instanceof C83174Wkc) {
            operateApplyComposeNodes.z7().clear();
            operateApplyComposeNodes.z7().addAll(((C83174Wkc) abstractC83179Wkh).LIZ);
        } else if (abstractC83179Wkh instanceof C83172Wka) {
            operateApplyComposeNodes.z7().addAll(((C83172Wka) abstractC83179Wkh).LIZ);
        } else if (abstractC83179Wkh instanceof C83173Wkb) {
            C83173Wkb c83173Wkb = (C83173Wkb) abstractC83179Wkh;
            operateApplyComposeNodes.z7().removeAll(c83173Wkb.LIZ);
            operateApplyComposeNodes.z7().addAll(c83173Wkb.LIZIZ);
        }
        operateApplyComposeNodes.A7().LJII(operateApplyComposeNodes.z7());
    }

    public static final boolean LJJIIJ(InterfaceC24650xx interfaceC24650xx, InterfaceC24650xx interfaceC24650xx2) {
        C24400xY c24400xY;
        if (interfaceC24650xx == null) {
            return true;
        }
        if ((interfaceC24650xx instanceof C35991b9) && (interfaceC24650xx2 instanceof C35991b9)) {
            C35991b9 c35991b9 = (C35991b9) interfaceC24650xx;
            if (c35991b9.LIZIZ == null || (c24400xY = c35991b9.LIZJ) == null || !c24400xY.LIZ() || o.LJ(interfaceC24650xx, interfaceC24650xx2) || o.LJ(c35991b9.LIZJ, ((C35991b9) interfaceC24650xx2).LIZJ)) {
                return true;
            }
        }
        return false;
    }

    public static final void LJJIIJZLJL(m mVar, String str) {
        g LJJIJIIJI = mVar.LJJIJIIJI(str);
        if (LJJIJIIJI != null) {
            if (LJJIJIIJI.size() > 0) {
                j LJJIIZ = LJJIJIIJI.LJJIIZ(0);
                LJJIIZ.getClass();
                if (!(LJJIIZ instanceof p)) {
                    g gVar = new g();
                    int size = LJJIJIIJI.size();
                    for (int i = 0; i < size; i++) {
                        gVar.LJJIIJ(LJJIJIIJI.LJJIIZ(i).LJIIZILJ().LJJIJ("path").LJJIFFI());
                    }
                    mVar.LJJJ(str);
                    mVar.LJJII(str, gVar);
                }
            }
        }
    }

    public static final void LJJIIZI(m mVar, String str) {
        j LJJIJ = mVar.LJJIJ(str);
        if (LJJIJ != null && !(LJJIJ instanceof p)) {
            mVar.LJJJ(str);
            mVar.LJJII(str, LJJIJ.LJIIZILJ().LJJIJ("path"));
        }
    }

    public static final List LJJIJL(MusicGroup musicGroup, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        List<Music> similarMusics = musicGroup.getSimilarMusics();
        ArrayList arrayList = new ArrayList(C32I.LJJL(similarMusics, 10));
        int i = 0;
        for (Music music : similarMusics) {
            int i2 = i + 1;
            if (i >= 0) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                o.LJIIIIZZ(convertToMusicModel, "similarMusic.convertToMusicModel()");
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == musicGroup.getSimilarMusics().size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    z3 = false;
                }
                arrayList.add(new C240719cZ(convertToMusicModel, new C240639cR(null, false, true, 0, false, z, z2, false, z3, 155)));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC06380Mw
    public void onEventV3(String str, JSONObject jSONObject) {
        C276216o.LJIIL.LIZ.LJIIIZ.onEventV3(str, jSONObject);
    }

    public static final C40431iJ LJ(InterfaceC24520xk composer, int i, AbstractC65781Prl abstractC65781Prl) {
        C40431iJ c40431iJ;
        o.LJIIIZ(composer, "composer");
        composer.LJJIIJ(i);
        Object LJIILL = composer.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            c40431iJ = new C40431iJ(i, true);
            composer.LJJIII(c40431iJ);
        } else {
            o.LJII(LJIILL, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            c40431iJ = (C40431iJ) LJIILL;
        }
        c40431iJ.LJI(abstractC65781Prl);
        composer.LJJIJIIJIL();
        return c40431iJ;
    }

    public static final C40431iJ LJFF(AbstractC65781Prl block, int i, boolean z) {
        o.LJIIIZ(block, "block");
        C40431iJ c40431iJ = new C40431iJ(i, z);
        c40431iJ.LJI(block);
        return c40431iJ;
    }

    public static void LJIIIZ(long j, String str, Throwable th) {
        if (C61359O6h.LJI() != null) {
            StringBuilder sb = new StringBuilder();
            LJJIII(sb, j, str, th);
            C61359O6h.LJI().LJZL(sb.toString());
        }
    }

    public static final void LJJIIZ(String str, String str2, m mVar) {
        g LJJIJIIJI = mVar.LJJIJIIJI(str2);
        if (LJJIJIIJI != null) {
            if (LJJIJIIJI.size() > 0) {
                j LJJIIZ = LJJIJIIJI.LJJIIZ(0);
                LJJIIZ.getClass();
                if (!(LJJIIZ instanceof p)) {
                    g gVar = new g();
                    int size = LJJIJIIJI.size();
                    for (int i = 0; i < size; i++) {
                        gVar.LJJIIJ(LJJIJIIJI.LJJIIZ(i).LJIIZILJ().LJJIJ("path").LJJIFFI());
                    }
                    mVar.LJJJ(str);
                    mVar.LJJJ(str2);
                    mVar.LJJII(str, gVar);
                }
            }
        }
    }

    public static final void LJJIJ(String str, String str2, m mVar) {
        j LJJIJ = mVar.LJJIJ(str2);
        if (LJJIJ != null) {
            mVar.LJJJ(str);
            mVar.LJJJ(str2);
            mVar.LJJII(str, LJJIJ.LJIIZILJ().LJJIJ("path"));
        }
    }

    public static void LJJIII(StringBuilder sb, long j, String str, Throwable th) {
        sb.append("[BDASplash]");
        if (j > 0) {
            C1DI.LIZIZ(sb, ", ", "SplashAdId", "= ");
            sb.append(j);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", message: ");
            sb.append(str);
        }
        if (th != null) {
            sb.append(", tr: ");
            sb.append(th.getMessage());
        }
    }

    public static C240719cZ LJJIJLIJ(MusicGroup musicGroup, EnumC240399c3 enumC240399c3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        EnumC240399c3 enumC240399c32 = enumC240399c3;
        C240719cZ c240719cZ = null;
        if ((i & 1) != 0) {
            enumC240399c32 = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = null;
        }
        o.LJIIIZ(musicGroup, "<this>");
        Music sourceMusic = musicGroup.getSourceMusic();
        if (sourceMusic != null) {
            MusicModel convertToMusicModel = sourceMusic.convertToMusicModel();
            o.LJIIIIZZ(convertToMusicModel, "it.convertToMusicModel()");
            if (enumC240399c32 == null) {
                enumC240399c32 = EnumC240399c3.DISABLE_PINNED;
            }
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            int size = musicGroup.getSimilarMusics().size();
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            if (bool3 != null) {
                z3 = bool3.booleanValue();
            } else {
                z3 = false;
            }
            c240719cZ = new C240719cZ(convertToMusicModel, new C240639cR(enumC240399c32, z, false, size, z2, false, false, z3, false, 356));
        }
        return c240719cZ;
    }
}
