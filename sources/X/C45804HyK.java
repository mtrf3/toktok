package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.common.utility.Logger;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HyK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45804HyK implements InterfaceC162186Yc, C0K7 {
    public static final C45804HyK LJLIL = new C45804HyK();
    public static final C45804HyK LJLILLLLZI = new C45804HyK();

    public static C73165SnZ LJIJ() {
        C73165SnZ c73165SnZ = new C73165SnZ();
        c73165SnZ.LIZJ = true;
        return c73165SnZ;
    }

    public static final String[] LJIL() {
        return new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC45601Hv3 LJ(Context context) {
        if (context instanceof InterfaceC45601Hv3) {
            return (InterfaceC45601Hv3) context;
        }
        if (context instanceof MutableContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof InterfaceC45601Hv3) {
                Object baseContext = contextWrapper.getBaseContext();
                o.LJII(baseContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
                return (InterfaceC45601Hv3) baseContext;
            }
            return null;
        }
        return null;
    }

    public static final EnumC74991Tbv LJI(String str) {
        for (EnumC74991Tbv enumC74991Tbv : EnumC74991Tbv.values()) {
            if (o.LJ(enumC74991Tbv.getBusinessType(), str)) {
                return enumC74991Tbv;
            }
        }
        return EnumC74991Tbv.NORMAL;
    }

    public static final boolean LJII(Aweme aweme) {
        boolean z;
        o.LJIIIZ(aweme, "<this>");
        User author = aweme.getAuthor();
        if (author != null && author.getCommentSetting() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && aweme.getFollowStatus() == 2) {
            return true;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null && author2.getCommentSetting() == 2 && aweme.getFollowStatus() >= 1) {
            return true;
        }
        User author3 = aweme.getAuthor();
        if ((author3 != null && author3.getCommentSetting() == 0) || LJJJJ(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return true;
        }
        User author = aweme.getAuthor();
        int commentSetting = author.getCommentSetting();
        if (AccountService.LJIJ().LJFF().isMe(author.getUid())) {
            if (AccountService.LJIJ().LJFF().getCurUser().getCommentSetting() != 3 && aweme.getCommentSetting() != 3) {
                return true;
            }
            return false;
        }
        if (commentSetting == 0) {
            return true;
        }
        if (commentSetting == 1) {
            if (C80S.LIZLLL(aweme)) {
                return true;
            }
        } else if (commentSetting == 2 && C80S.LIZIZ(aweme)) {
            return true;
        }
        return false;
    }

    public static final Activity LJIJJ(Context context) {
        o.LJIIIZ(context, "<this>");
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final BeautyMobParam LJIJJLI(List composers) {
        boolean z;
        o.LJIIIZ(composers, "composers");
        StrArray strArray = new StrArray();
        StrArray strArray2 = new StrArray();
        StrArray strArray3 = new StrArray();
        StrArray strArray4 = new StrArray();
        StrArray strArray5 = new StrArray();
        StrArray strArray6 = new StrArray();
        Iterator it = composers.iterator();
        while (it.hasNext()) {
            ComposerBeauty composerBeauty = (ComposerBeauty) it.next();
            String parentId = composerBeauty.getParentId();
            if (parentId == null || parentId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                strArray4.add(composerBeauty.getEffect().getEffectId());
                strArray5.add(composerBeauty.getEffect().getName());
                strArray6.add(String.valueOf(composerBeauty.getProgressValue() / 100.0f));
            } else {
                strArray.add(composerBeauty.getEffect().getEffectId());
                strArray2.add(composerBeauty.getEffect().getName());
                strArray3.add(String.valueOf(composerBeauty.getProgressValue() / 100.0f));
            }
        }
        String strArray7 = strArray.toString();
        o.LJIIIIZZ(strArray7, "beautifyChildIdList.toString()");
        String strArray8 = strArray2.toString();
        o.LJIIIIZZ(strArray8, "beautifyChildNameList.toString()");
        String strArray9 = strArray3.toString();
        o.LJIIIIZZ(strArray9, "beautifyChildValueList.toString()");
        String strArray10 = strArray4.toString();
        o.LJIIIIZZ(strArray10, "beautifyParentIdList.toString()");
        String strArray11 = strArray5.toString();
        o.LJIIIIZZ(strArray11, "beautifyParentNameList.toString()");
        String strArray12 = strArray6.toString();
        o.LJIIIIZZ(strArray12, "beautifyParentValueList.toString()");
        return new BeautyMobParam(strArray7, strArray8, strArray9, strArray10, strArray11, strArray12);
    }

    public static final float LJJ(float f) {
        return (EF7.LIZIZ().getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    public static final int LJJI(int i) {
        return (int) LJJ(i);
    }

    public static final ActivityC45651qj LJJIFFI(Context context) {
        o.LJIIIZ(context, "<this>");
        Activity LJIJJ = LJIJJ(context);
        if (LJIJJ instanceof ActivityC45651qj) {
            return (ActivityC45651qj) LJIJJ;
        }
        return null;
    }

    public static final int LJJII(List list) {
        int i;
        int i2 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                List<MusNotice> items = ((NoticeItems) it.next()).getItems();
                if (items != null) {
                    i = items.size();
                } else {
                    i = 0;
                }
                i2 += i;
            }
        }
        return i2;
    }

    public static final int LJJIIJ(User user) {
        if (user == null || !((RBX) HG3.LJIILL()).isLogin()) {
            return -1;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                return 1;
            }
            if (followStatus != 2) {
                if (followStatus == 4) {
                    return 4;
                }
            } else {
                if (C49421JaT.LIZLLL(user)) {
                    return 2;
                }
                return 3;
            }
        } else if (user.getFollowerStatus() == 1) {
            return 5;
        }
        return 0;
    }

    public static List LJJIIJZLJL(String str) {
        List LIZIZ;
        String fileName = i0.LJFF("im_resources_", str);
        synchronized (C64544PUu.class) {
            o.LJIIIZ(fileName, "fileName");
            File file = EF7.LIZIZ().getFileStreamPath(fileName);
            o.LJIIIIZZ(file, "file");
            LIZIZ = C64544PUu.LIZIZ(file, Resources.class);
        }
        return LIZIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJIIZ(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            r7.getClass()
            int r0 = r7.hashCode()
            r5 = 5
            r4 = 4
            r3 = 3
            r2 = 2
            r1 = 1
            switch(r0) {
                case -677145915: goto L57;
                case -186119313: goto L4e;
                case 3322092: goto L45;
                case 3599307: goto L3c;
                case 104263205: goto L33;
                case 112202875: goto L2a;
                case 1402633315: goto L21;
                case 1948294547: goto L18;
                default: goto L17;
            }
        L17:
            return r6
        L18:
            java.lang.String r0 = "sticker_detail"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L60
            goto L17
        L21:
            java.lang.String r0 = "challenge"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L63
            goto L17
        L2a:
            java.lang.String r0 = "video"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L64
            goto L17
        L33:
            java.lang.String r0 = "music"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L65
            goto L17
        L3c:
            java.lang.String r0 = "user"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L66
            goto L17
        L45:
            java.lang.String r0 = "live"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L67
            goto L17
        L4e:
            java.lang.String r0 = "bodydancelist"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L68
            goto L17
        L57:
            java.lang.String r0 = "forward"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L6b
            goto L17
        L60:
            r0 = 17
            return r0
        L63:
            return r2
        L64:
            return r1
        L65:
            return r3
        L66:
            return r4
        L67:
            return r5
        L68:
            r0 = 8
            return r0
        L6b:
            r0 = 19
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45804HyK.LJJIIZ(java.lang.String):int");
    }

    public static final String LJJIIZI(User user) {
        if (user.getFollowStatus() == 2) {
            return "friends";
        }
        if (user.getFollowStatus() == 1) {
            return "following";
        }
        if (user.getMatchedFriendStruct() != null) {
            return "maf";
        }
        return "find_more";
    }

    public static final double LJJIJ(Context context) {
        return LJIILIIL(Integer.valueOf(C60605NqT.LJI(context)), context);
    }

    public static final void LJJIJIIJIL(View view) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final boolean LJJIJLIJ(String str) {
        Boolean bool;
        String LJII = V3N.LJII(str, "audio_graph");
        if (LJII != null) {
            AudioGraph audioGraph = (AudioGraph) GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), LJII, AudioGraph.class);
            if (audioGraph != null) {
                bool = audioGraph.getUseOutput();
            } else {
                bool = null;
            }
            return o.LJ(bool, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJJIL(int i) {
        int LJIIL = C07290Qj.LJIIL(i, 255);
        int LJIIIIZZ = C07290Qj.LJIIIIZZ(4.5f, -1, LJIIL);
        int LJIIIIZZ2 = C07290Qj.LJIIIIZZ(3.0f, -1, LJIIL);
        if (LJIIIIZZ != -1 && LJIIIIZZ2 != -1) {
            return true;
        }
        int LJIIIIZZ3 = C07290Qj.LJIIIIZZ(4.5f, -16777216, LJIIL);
        int LJIIIIZZ4 = C07290Qj.LJIIIIZZ(3.0f, -16777216, LJIIL);
        if ((LJIIIIZZ3 == -1 || LJIIIIZZ4 == -1) && LJIIIIZZ2 != -1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIZ(Aweme aweme) {
        boolean z;
        User author = aweme.getAuthor();
        if (author != null && author.getCommentSetting() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (LJJJJ(aweme) && z) {
            return z;
        }
        if (aweme.getCommentSetting() != 3 && !z) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJ(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (aweme.getAuthor().getCommentSetting() != 3 && aweme.getCommentSetting() != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJI(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (TextUtils.isEmpty(videoPublishEditModel.getMMusicPath()) && videoPublishEditModel.mIsFromDraft && videoPublishEditModel.isDraftMusicIllegal()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJIL(EnumC74991Tbv layoutName) {
        o.LJIIIZ(layoutName, "layoutName");
        if (o.LJ(layoutName.getBusinessType(), EnumC74991Tbv.FLOAT.getBusinessType()) || o.LJ(layoutName.getBusinessType(), EnumC74991Tbv.GRID_FLOAT.getBusinessType())) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJ(Aweme aweme) {
        String str;
        o.LJIIIZ(aweme, "<this>");
        User author = aweme.getAuthor();
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        return o.LJ(str, HG3.LJIILL().getCurUserId());
    }

    public static final boolean LJJJJIZL(String str) {
        for (EnumC74991Tbv enumC74991Tbv : EnumC74991Tbv.values()) {
            if (o.LJ(enumC74991Tbv.toString(), str)) {
                return true;
            }
        }
        return false;
    }

    public static final int LJJJJL(List list) {
        Object obj;
        Object obj2;
        if (((ArrayList) list).isEmpty()) {
            return 1;
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((Number) obj2).intValue() == 8) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            num.intValue();
            return 8;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int intValue = ((Number) next).intValue();
            if (intValue == 2 || intValue == 32 || intValue == 1) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            num2.intValue();
            return 2;
        }
        return 16;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJJJLL(java.lang.String r2) {
        /*
            if (r2 == 0) goto L60
            int r0 = r2.hashCode()
            switch(r0) {
                case -1560364328: goto L54;
                case -1231575857: goto L48;
                case -181013528: goto L3f;
                case 3497: goto L34;
                case 635173669: goto L2b;
                case 1271274793: goto L1f;
                case 1544803905: goto L13;
                case 1866578827: goto La;
                default: goto L9;
            }
        L9:
            return r2
        La:
            java.lang.String r0 = "infostickerv2"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L51
            goto L9
        L13:
            java.lang.String r0 = "default"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1c
            goto L9
        L1c:
            java.lang.String r2 = "effect"
            goto L9
        L1f:
            java.lang.String r0 = "editingeffect"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L28
            goto L9
        L28:
            java.lang.String r2 = "edit_effect"
            goto L9
        L2b:
            java.lang.String r0 = "colorfilternew"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5d
            goto L9
        L34:
            java.lang.String r1 = "mv"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L3d
            goto L9
        L3d:
            r2 = r1
            goto L9
        L3f:
            java.lang.String r0 = "emoji-android"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L51
            goto L9
        L48:
            java.lang.String r0 = "infosticker"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L51
            goto L9
        L51:
            java.lang.String r2 = "info_effect"
            goto L9
        L54:
            java.lang.String r0 = "colorfilterexperiment"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5d
            goto L9
        L5d:
            java.lang.String r2 = "color_filter"
            goto L9
        L60:
            java.lang.String r2 = ""
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45804HyK.LJJJJLL(java.lang.String):java.lang.String");
    }

    public static void LJJLIIIJJIZ(Throwable th) {
        OC6.LJ("gecko-debug-tag", "throwIfDebug:", th);
    }

    public static final List LJJLIIIJL(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AVChallenge aVChallenge = new AVChallenge();
            aVChallenge.challengeName = str;
            LJ.add(aVChallenge);
        }
        return LJ;
    }

    public static final VideoCardFallbackInfoComponent LJJLIIIJLJLI(V4W v4w) {
        ImageComponent LIZ;
        TextComponent LIZ2;
        ActionLinkComponent LIZ3;
        C79135V3z c79135V3z = v4w.image;
        if (c79135V3z != null) {
            LIZ = C79081V1x.LJJIZ(c79135V3z);
        } else {
            ImageComponent.Companion.getClass();
            LIZ = C79095V2l.LIZ();
        }
        RUF ruf = v4w.text;
        if (ruf == null || (LIZ2 = C17N.LJJL(ruf)) == null) {
            TextComponent.Companion.getClass();
            LIZ2 = C79109V2z.LIZ();
        }
        C63714OzW c63714OzW = v4w.link_info;
        if (c63714OzW != null) {
            LIZ3 = C62814Ol0.LJJIIZI(c63714OzW);
        } else {
            ActionLinkComponent.Companion.getClass();
            LIZ3 = C63715OzX.LIZ();
        }
        return new VideoCardFallbackInfoComponent(LIZ3, LIZ, LIZ2);
    }

    public static final C112974c1 LJJLIIIJLLLLLLLZ(VideoCardFallbackInfoComponent videoCardFallbackInfoComponent) {
        o.LJIIIZ(videoCardFallbackInfoComponent, "<this>");
        VideoCardFallbackInfoComponent.Companion.getClass();
        if (o.LJ(videoCardFallbackInfoComponent, VideoCardFallbackInfoComponent.EMPTY_FALLBACK)) {
            return null;
        }
        return new C112974c1(videoCardFallbackInfoComponent.linkInfo, videoCardFallbackInfoComponent.image, videoCardFallbackInfoComponent.text);
    }

    public static final Gift LJJLIIJ(long j) {
        Gift findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById == null) {
            return null;
        }
        return findGiftById;
    }

    public static final VideoCardTemplate LJJLIL(C79134V3y c79134V3y) {
        VideoCoverComponent videoCoverComponent;
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent;
        PreviewHintComponent LIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        V43 v43 = c79134V3y.video;
        if (v43 != null) {
            videoCoverComponent = V3N.LJJIJIIJIL(v43);
        } else {
            VideoCoverComponent.Companion.getClass();
            videoCoverComponent = VideoCoverComponent.EMPTY_VIDEO_COVER;
        }
        V4W v4w = c79134V3y.fallback;
        if (v4w != null) {
            videoCardFallbackInfoComponent = LJJLIIIJLJLI(v4w);
        } else {
            VideoCardFallbackInfoComponent.Companion.getClass();
            videoCardFallbackInfoComponent = VideoCardFallbackInfoComponent.EMPTY_FALLBACK;
        }
        V4L v4l = c79134V3y.preview_hint;
        if (v4l != null) {
            LIZ = V2B.LJIIZILJ(v4l);
        } else {
            PreviewHintComponent.Companion.getClass();
            LIZ = C79087V2d.LIZ();
        }
        RU2 ru2 = c79134V3y.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = c79134V3y.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        return new VideoCardTemplate(videoCoverComponent, videoCardFallbackInfoComponent, LIZ, baseRequestComponent, baseResponseComponent);
    }

    public static final String LJJLJ(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
        int i = 0;
        while (i < length) {
            char c = charArray[i];
            if (o.LJIIJJI(c, 32) > 0 && c != 160 && c != 12288) {
                break;
            }
            i++;
        }
        while (i < length) {
            int i2 = length - 1;
            char c2 = charArray[i2];
            if (o.LJIIJJI(c2, 32) > 0 && c2 != 160 && c2 != 12288) {
                break;
            }
            length = i2;
        }
        if (i > 0 || length < str.length()) {
            String substring = str.substring(i, length);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final DraftDBSaveResult LJJLJLI(NDG ndg) {
        String json;
        String json2;
        String json3;
        GPI gpi;
        NowsExtra nowsExtra;
        o.LJIIIZ(ndg, "<this>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftUpdateDBParams.updateToDB; creativeInfo : ");
        LIZ.append(((AwemeDraft) ndg.LJLILLLLZI).LIZIZ());
        LIZ.append(", extraInfo : ");
        LIZ.append(ndg.LJLJI);
        String str = "";
        GPR.LIZ("", X1D.LIZIZ(LIZ));
        C43545H7d LIZIZ = C43545H7d.LIZIZ();
        AwemeDraft awemeDraft = (AwemeDraft) ndg.LJLILLLLZI;
        LIZIZ.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(awemeDraft.LJJJJI.filterLocalPath)) {
            FilterBean getFilterFolder = C60903NvH.LJIIJJI().LJIILL().LJ().getFilter(awemeDraft.LJIIL);
            o.LJIIIZ(getFilterFolder, "$this$getFilterFolder");
            awemeDraft.LJJJJI.filterLocalPath = getFilterFolder.getFilterFolder();
        }
        ContentValues contentValues = new ContentValues();
        if (awemeDraft.aweme == null) {
            json = "";
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), awemeDraft.aweme);
        }
        contentValues.put("aweme", json);
        contentValues.put("video_path", awemeDraft.LIZJ());
        contentValues.put("music_path", awemeDraft.LJI);
        contentValues.put("video_volume", Integer.valueOf(awemeDraft.LJIIIIZZ));
        contentValues.put("music_volume", Integer.valueOf(awemeDraft.LJIIIZ));
        if (awemeDraft.LIZ.musicBuzModel.isDraftMusicValid || awemeDraft.LIZLLL == null) {
            json2 = "";
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), awemeDraft.LIZLLL);
        }
        contentValues.put("music", json2);
        contentValues.put("filter", Integer.valueOf(awemeDraft.LJIIL));
        contentValues.put("music_start", Integer.valueOf(awemeDraft.LJIILIIL));
        contentValues.put("time", Long.valueOf(awemeDraft.lastEditTime));
        boolean z = false;
        contentValues.put("effect", (Integer) 0);
        contentValues.put("origin", Integer.valueOf(awemeDraft.LJIILL));
        contentValues.put("face_beauty", Integer.valueOf(awemeDraft.LJJIII));
        contentValues.put("user_id", awemeDraft.LJJIIJ);
        contentValues.put("segment_video", awemeDraft.LJJIIJZLJL);
        contentValues.put("hard_encode", Integer.valueOf(awemeDraft.LJJIIZ));
        contentValues.put("special_points", (Integer) 0);
        contentValues.put("sticker_path", awemeDraft.LJJIJ);
        contentValues.put("sticker_id", awemeDraft.LJJIJIIJI);
        contentValues.put("camera_poi", Integer.valueOf(awemeDraft.LJIJJLI));
        contentValues.put("filter_label", awemeDraft.LJIJJ);
        contentValues.put("beauty_label", Integer.valueOf(awemeDraft.LJIL));
        contentValues.put("video_speed", awemeDraft.LJIIZILJ);
        contentValues.put("music_effect_segments", awemeDraft.LJJIJIL);
        contentValues.put("is_private", Integer.valueOf(awemeDraft.LJJI));
        contentValues.put("max_duration", Long.valueOf(awemeDraft.LJJII));
        contentValues.put("audio_track", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), awemeDraft.LJIJ));
        if (awemeDraft.photoMovieContext == null) {
            json3 = "";
        } else {
            json3 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), awemeDraft.photoMovieContext);
        }
        contentValues.put("photo_movie", json3);
        contentValues.put("effect_list", "");
        AVMusic aVMusic = awemeDraft.LIZLLL;
        if (aVMusic != null) {
            if (aVMusic.isLocalMusic()) {
                str = String.valueOf(aVMusic.getLocalMusicId());
            } else {
                str = aVMusic.getMusicId();
                o.LJIIIIZZ(str, "{\n            draftMusic.musicId\n        }");
            }
        }
        contentValues.put("music_id", str);
        contentValues.put("new_version", Integer.valueOf(awemeDraft.LJJIJL));
        contentValues.put("custom_cover_start", Float.valueOf(awemeDraft.LJJIJLIJ));
        contentValues.put("duet_from", awemeDraft.LJJIL);
        contentValues.put("sync_platforms", awemeDraft.LJJIZ);
        contentValues.put("draft_extras", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), awemeDraft.LJJJJI));
        AwemeDraft LIZJ = GPD.LIZJ(new GPE(awemeDraft.LIZIZ(), false));
        long j = awemeDraft.lastEditTime;
        if (LIZJ != null) {
            long j2 = LIZJ.saveTime;
            if (j2 != 0 && !awemeDraft.LJJJJ) {
                j = j2;
            }
        }
        awemeDraft.saveTime = j;
        contentValues.put("save_time", Long.valueOf(j));
        contentValues.put("draft_view_info", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), C87277YNd.LIZJ(awemeDraft)));
        Object value = C65409Pll.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-creativeModelGson>(...)");
        contentValues.put("creative_model", GsonProtectorUtils.toJson((Gson) value, awemeDraft.LIZ));
        contentValues.put("visible_to_user", Integer.valueOf(awemeDraft.LJ ? 1 : 0));
        contentValues.put("is_published", Integer.valueOf(awemeDraft.LJJJ ? 1 : 0));
        contentValues.put("published_time", Long.valueOf(awemeDraft.LJJJI));
        contentValues.put("published_aweme_id", awemeDraft.LJJJIL);
        NowsShootModel nowsShootModel = awemeDraft.LIZ.nowsShootModel;
        if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null && nowsExtra.isNowPublish) {
            gpi = GPI.TTN;
        } else {
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
            if (aVDraftExtras.creationMode == 2) {
                gpi = GPI.PHOTO_MODE;
            } else if (aVDraftExtras.lighteningExtraInfo != null) {
                gpi = GPI.STORY_LIGHTENING;
            } else {
                gpi = GPI.DEFAULT;
            }
        }
        contentValues.put("format_type", Integer.valueOf(gpi.getValue()));
        DraftDBSaveResult draftDBSaveResult = new DraftDBSaveResult();
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("start draft save, musicModel: ");
            LIZ2.append(awemeDraft.LIZLLL);
            LIZ2.append(", musicPath:");
            LIZ2.append(awemeDraft.LJI);
            H78.LJI(X1D.LIZIZ(LIZ2));
            long replaceOrThrow = LIZIZ.LIZ.replaceOrThrow("local_draft", null, contentValues);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("draft save done, rowId: ");
            LIZ3.append(replaceOrThrow);
            H78.LJI(X1D.LIZIZ(LIZ3));
            if (replaceOrThrow < 0) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("rowId : ");
                LIZ4.append(replaceOrThrow);
                draftDBSaveResult = new DraftDBSaveResult(currentTimeMillis2, new DraftDBSaveException(-1000, new RuntimeException(X1D.LIZIZ(LIZ4))));
            }
        } catch (Exception e) {
            draftDBSaveResult = new DraftDBSaveResult(System.currentTimeMillis() - currentTimeMillis, new DraftDBSaveException(-1001, e));
        }
        if (draftDBSaveResult.isSuc()) {
            AwemeDraft awemeDraft2 = (AwemeDraft) ndg.LJLILLLLZI;
            int i = ((GLI) ndg.LJLJI).LIZIZ;
            if (i == 1 || i == 8) {
                z = true;
            }
            XKX.LIZLLL(C48841JEv.LIZ(EXT.LIZ), null, null, new C773131r(new IDraftListener.UpdateParams(awemeDraft2, z), null), 3);
        }
        return draftDBSaveResult;
    }

    public static final void LJJLL(View view) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    public static final void LIZ(AbstractC531926x abstractC531926x, C29321Dc c29321Dc) {
        long LJJJZ = C78977Uz7.LJJJZ(c29321Dc.LLI.LIZIZ);
        int LJJIIZ = O6R.LJJIIZ(C10370av.LIZLLL(LJJJZ));
        int LJJIIZ2 = O6R.LJJIIZ(C10370av.LJ(LJJJZ));
        abstractC531926x.layout(LJJIIZ, LJJIIZ2, abstractC531926x.getMeasuredWidth() + LJJIIZ, abstractC531926x.getMeasuredHeight() + LJJIIZ2);
    }

    public static final Uri.Builder LIZIZ(android.net.Uri uri, OSZ... query) {
        o.LJIIIZ(query, "query");
        Uri.Builder buildUpon = uri.buildUpon();
        o.LJIIIIZZ(buildUpon, "buildUpon()");
        LIZJ(buildUpon, (OSZ[]) Arrays.copyOf(query, query.length));
        return buildUpon;
    }

    public static final void LIZJ(Uri.Builder builder, OSZ... query) {
        String obj;
        o.LJIIIZ(query, "query");
        for (OSZ osz : query) {
            String str = (String) osz.getFirst();
            Object second = osz.getSecond();
            if (second != null && (obj = second.toString()) != null && !ujb.o.LJJJJJL(obj)) {
                builder.appendQueryParameter(str, obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(C145995oB c145995oB, BeautyMobParam beautyMobParam) {
        BeautyMobParam beautyMobParam2 = beautyMobParam;
        if (beautyMobParam2 == null) {
            beautyMobParam2 = new BeautyMobParam(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }
        c145995oB.LJI("beautify_child_id_list", beautyMobParam2.getBeautifyChildIdListStr());
        c145995oB.LJI("beautify_child_name_list", beautyMobParam2.getBeautifyChildNameListStr());
        c145995oB.LJI("beautify_child_value_list", beautyMobParam2.getBeautifyChildValueListStr());
        c145995oB.LJI("beautify_parent_id_list", beautyMobParam2.getBeautifyParentIdListStr());
        c145995oB.LJI("beautify_parent_name_list", beautyMobParam2.getBeautifyParentNameListStr());
        c145995oB.LJI("beautify_parent_value_list", beautyMobParam2.getBeautifyParentValueListStr());
    }

    public static String LJFF(int i, String str) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 8) {
                                if (i != 9) {
                                    if (i != 17) {
                                        if (i != 23) {
                                            if (i != 31) {
                                                return "text";
                                            }
                                            return "live";
                                        }
                                        return "challenge";
                                    }
                                    return "sticker_detail";
                                }
                                return "shoot";
                            }
                            return "bodydance_detail";
                        }
                        return "live";
                    }
                    if (TextUtils.equals(HG3.LJIILL().getCurUserId(), str)) {
                        return "personal_homepage";
                    }
                    return "others_homepage";
                }
                return "music";
            }
            return "challenge";
        }
        return "video";
    }

    public static final void LJIIJJI(int i, int i2) {
        String LIZIZ;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            LIZIZ = C48690J9a.LJIIJJI("Both size ", i, " and step ", i2, " must be greater than zero.");
        } else {
            LIZIZ = C0NY.LIZIZ("size ", i, " must be greater than zero.");
        }
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static void LJIIL(String str, String str2) {
        if (str.length() == 0 || str2 == null || str2.length() == 0 || str2.length() <= 3072) {
            return;
        }
        while (str2.length() > 3072) {
            str2 = str2.replace(str2.substring(0, 3072), "");
        }
    }

    public static final double LJIILIIL(Number div, Context context) {
        o.LJIIJ(div, "$this$div");
        double doubleValue = div.doubleValue();
        o.LJFF(context.getResources(), "context.resources");
        return doubleValue / r1.getDisplayMetrics().density;
    }

    public static final int LJIILJJIL(int i, List paragraphInfoList) {
        o.LJIIIZ(paragraphInfoList, "paragraphInfoList");
        int size = ((ArrayList) paragraphInfoList).size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C1NC c1nc = (C1NC) ListProtector.get(paragraphInfoList, i3);
            if (c1nc.LJLILLLLZI > i) {
                size = i3 - 1;
            } else if (c1nc.LJLJI <= i) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int LJIILL(int i, List paragraphInfoList) {
        o.LJIIIZ(paragraphInfoList, "paragraphInfoList");
        int size = ((ArrayList) paragraphInfoList).size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C1NC c1nc = (C1NC) ListProtector.get(paragraphInfoList, i3);
            if (c1nc.LJLJJI > i) {
                size = i3 - 1;
            } else if (c1nc.LJLJJL <= i) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int LJIIZILJ(List paragraphInfoList, float f) {
        o.LJIIIZ(paragraphInfoList, "paragraphInfoList");
        int size = ((ArrayList) paragraphInfoList).size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C1NC c1nc = (C1NC) ListProtector.get(paragraphInfoList, i2);
            if (c1nc.LJLJJLL > f) {
                size = i2 - 1;
            } else if (c1nc.LJLJL <= f) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static String LJIJI(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final int LJJIII(Context context, boolean z) {
        int i;
        o.LJIIIZ(context, "<this>");
        if (z) {
            i = R.attr.bpt;
        } else {
            i = R.attr.bpv;
        }
        Integer LJ = C79045V0n.LJ(i, context);
        if (LJ != null) {
            return LJ.intValue();
        }
        return 0;
    }

    public static final void LJJJJJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        ((Keva) C43814HHm.LIZ.getValue()).storeBoolean(videoPublishEditModel.getCreationId(), z);
    }

    public static final void LJJJJJL(C2054384l c2054384l, List textComponentMatcherList) {
        o.LJIIIZ(textComponentMatcherList, "textComponentMatcherList");
        c2054384l.LJ(new AqS169S0100000_3(textComponentMatcherList, (List<AnonymousClass852<C85M>>) 47));
    }

    public static final Uri.Builder LJJJJZ(android.net.Uri uri, OSZ... oszArr) {
        String str;
        if (uri.isOpaque()) {
            return LIZIZ(uri, (OSZ[]) Arrays.copyOf(oszArr, oszArr.length));
        }
        Uri.Builder buildUpon = uri.buildUpon();
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
        java.util.Set<String> LLJILLL = ORZ.LLJILLL(queryParameterNames);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (OSZ osz : oszArr) {
            Object first = osz.getFirst();
            Object second = osz.getSecond();
            if (second != null) {
                str = second.toString();
            } else {
                str = null;
            }
            String LJJIFFI = C17N.LJJIFFI(str);
            if (LJJIFFI != null) {
                linkedHashMap.put(first, LJJIFFI);
                if (LLJILLL.remove(first)) {
                    z = true;
                }
            }
        }
        if (z) {
            buildUpon.clearQuery();
            for (String str2 : LLJILLL) {
                buildUpon.appendQueryParameter(str2, UriProtector.getQueryParameter(uri, str2));
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        o.LJIIIIZZ(buildUpon, "buildUpon().apply {\n    …ter(it.key, it.value) }\n}");
        return buildUpon;
    }

    public static final double LJJJLIIL(Activity activity, Number statusBarHeightDp) {
        int i;
        Window window;
        o.LJIIJ(statusBarHeightDp, "statusBarHeightDp");
        try {
            window = activity.getWindow();
        } catch (NullPointerException unused) {
        }
        if (window != null) {
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            Integer valueOf = Integer.valueOf(rect.bottom);
            if (valueOf != null) {
                i = valueOf.intValue();
                return LJIILIIL(Integer.valueOf(i), activity) - statusBarHeightDp.doubleValue();
            }
        }
        android.content.res.Resources resources = activity.getResources();
        o.LJFF(resources, "resources");
        i = resources.getDisplayMetrics().heightPixels;
        return LJIILIIL(Integer.valueOf(i), activity) - statusBarHeightDp.doubleValue();
    }

    public static void LJJJLL(String str, List list) {
        String fileName = i0.LJFF("im_resources_", str);
        synchronized (C64544PUu.class) {
            o.LJIIIZ(fileName, "fileName");
            File file = EF7.LIZIZ().getFileStreamPath(fileName);
            o.LJIIIIZZ(file, "file");
            C64544PUu.LIZLLL(file, list);
        }
    }

    public static final OSZ LJJJLZIJ(VideoPublishEditModel videoPublishEditModel, String segmentKey) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(segmentKey, "segmentKey");
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        o.LJIIIIZZ(curMultiEditVideoRecordData, "curMultiEditVideoRecordData");
        List LJJIJ = C46104I7o.LJJIJ(curMultiEditVideoRecordData);
        if (videoPublishEditModel.getFinalVideoList().size() == ((ArrayList) LJJIJ).size()) {
            int size = videoPublishEditModel.getFinalVideoList().size();
            for (int i = 0; i < size; i++) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ListProtector.get(LJJIJ, i);
                Object obj = ListProtector.get(videoPublishEditModel.getFinalVideoList(), i);
                o.LJIIIIZZ(obj, "finalVideoList.get(i)");
                if (o.LJ(segmentKey, ((TimeSpeedModelExtension) obj).getIdentityKey())) {
                    return new OSZ(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
                }
            }
            return null;
        }
        return null;
    }

    public static final List LJJJZ(VideoPublishEditModel videoPublishEditModel, String segmentKey) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(segmentKey, "segmentKey");
        ArrayList arrayList = new ArrayList();
        if (videoPublishEditModel.getCurMultiEditVideoRecordData().segmentDataList == null) {
            return arrayList;
        }
        List<MultiEditVideoSegmentRecordData> list = videoPublishEditModel.getCurMultiEditVideoRecordData().segmentDataList;
        ArrayList<TimeSpeedModelExtension> arrayList2 = videoPublishEditModel.multiEditVideoRecordData.editSegments;
        o.LJIIIIZZ(arrayList2, "multiEditVideoRecordData.editSegments");
        Iterator<TimeSpeedModelExtension> it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                TimeSpeedModelExtension timeSpeedModelExtension = next;
                if (list.size() > i && o.LJ(timeSpeedModelExtension.getIdentityKey(), segmentKey)) {
                    arrayList.add(new HFO(timeSpeedModelExtension.getSpeed(), ((MultiEditVideoSegmentRecordData) ListProtector.get(list, i)).getStartTime(), ((MultiEditVideoSegmentRecordData) ListProtector.get(list, i)).getEndTime()));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    public static final void LJJL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJJLI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJJLIIIIJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJJLIIIJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static void LJJLIIIJILLIZJL(View view, Aweme aweme) {
        if (C220858ld.LJIIIIZZ(aweme)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public static void LJIIIZ(String str, boolean z, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalArgumentException(C16880lQ.LLLZ(str, objArr));
        }
    }

    public static void LJIIJ(Object obj, String str, Object... objArr) {
        if (obj != null) {
        } else {
            throw new NullPointerException(C16880lQ.LLLZ(str, objArr));
        }
    }

    public static final List LJJIJIIJI(PdpViewModel pdpViewModel, Context context, List mediaItems) {
        int i;
        int i2;
        String string;
        ProductBase productBase;
        SizeGuide sizeGuide;
        o.LJIIIZ(pdpViewModel, "<this>");
        o.LJIIIZ(mediaItems, "mediaItems");
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = mediaItems.listIterator(mediaItems.size());
        while (true) {
            i = 0;
            if (listIterator.hasPrevious()) {
                if (((MediaItem) listIterator.previous()).type == 1) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        String string2 = context.getString(R.string.jfp);
        String LIZIZ = OKG.LIZIZ(string2, "context.getString(R.string.pdp_image_video)", context, R.string.slm, "context.getString(R.string.ttec_pdp_image_product)");
        ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
        if (productPackStruct == null || (productBase = productPackStruct.baseInfo) == null || (sizeGuide = productBase.sizeGuide) == null || (string = sizeGuide.pdpSizeGuideButtonText) == null || !C78685UuP.LJJJZ(string)) {
            string = context.getString(R.string.sln);
            o.LJIIIIZZ(string, "context.getString(R.stri…tec_pdp_image_size_guize)");
        }
        Iterator it = mediaItems.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int i3 = i + 1;
            if (((MediaItem) it.next()).type == 2) {
                arrayList.add(new C45809HyP(string2, "video", i));
            } else if (i == i2 && pdpViewModel.xw0()) {
                arrayList.add(new C45809HyP(string, "size", i));
            } else if (!z) {
                arrayList.add(new C45809HyP(LIZIZ, "products", i));
                z = true;
            }
            i = i3;
        }
        return arrayList;
    }

    public static final void LJJIJIL(VideoPublishEditModel args, ExtractFramesModel extractFramesModel, boolean z) {
        OSZ LJJJLZIJ;
        o.LJIIIZ(args, "args");
        if (HDB.LIZ() && extractFramesModel != null && extractFramesModel.getSegmentEffectPhoto() != null) {
            ArrayList<TimeSpeedModelExtension> finalVideoList = args.getFinalVideoList();
            o.LJIIIIZZ(finalVideoList, "model.finalVideoList");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (true) {
                if (it.hasNext()) {
                    TimeSpeedModelExtension next = it.next();
                    if (next.getIdentityKey() == null) {
                        break;
                    }
                    String identityKey = next.getIdentityKey();
                    o.LJIIIIZZ(identityKey, "timeSpeedModelExtension.identityKey");
                    linkedHashSet.add(identityKey);
                } else {
                    HashMap<String, List<String>> segmentEffectPhoto = extractFramesModel.getSegmentEffectPhoto();
                    if (segmentEffectPhoto != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, List<String>> entry : segmentEffectPhoto.entrySet()) {
                            if (linkedHashSet.contains(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            ORS.LJJLIIIJILLIZJL((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList);
                        }
                        HashSet LLIZLLLIL = ORZ.LLIZLLLIL(arrayList);
                        HashMap<Integer, List<String>> multiStickers = extractFramesModel.getMultiStickers();
                        if (multiStickers != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<Map.Entry<Integer, List<String>>> it3 = multiStickers.entrySet().iterator();
                            while (it3.hasNext()) {
                                ORS.LJJLIIIJILLIZJL(it3.next().getValue(), arrayList2);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next2 = it4.next();
                                if (!LLIZLLLIL.contains(next2)) {
                                    arrayList3.add(next2);
                                }
                            }
                            Iterator it5 = arrayList3.iterator();
                            while (it5.hasNext()) {
                                String str = (String) it5.next();
                                if (C1B6.LIZIZ(str) && C170626mo.LIZ(str)) {
                                    XBM.LJ(str);
                                }
                            }
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
        if (args.isStitchMode()) {
            if (extractFramesModel == null || extractFramesModel.getFramesV1() == null || extractFramesModel.getSegmentFrameKeys() == null) {
                return;
            }
            Iterator<Map.Entry<Integer, String>> it6 = extractFramesModel.getSegmentFrameKeys().entrySet().iterator();
            while (it6.hasNext()) {
                Map.Entry<Integer, String> next3 = it6.next();
                if (!LJJJJI(args, next3.getValue(), false)) {
                    HashMap<Integer, ArrayList<FrameItem>> framesV1 = extractFramesModel.getFramesV1();
                    if (framesV1 != null) {
                        framesV1.remove(next3.getKey());
                    }
                    HashMap<Integer, List<String>> multiStickers2 = extractFramesModel.getMultiStickers();
                    if (multiStickers2 != null) {
                        multiStickers2.remove(next3.getKey());
                    }
                    it6.remove();
                }
            }
            return;
        }
        if (!args.isMultiVideoEdit() || extractFramesModel == null || extractFramesModel.getFramesV1() == null || extractFramesModel.getSegmentFrameKeys() == null) {
            return;
        }
        if (!args.isCurrentAutoCutMode()) {
            Iterator<Map.Entry<Integer, String>> it7 = extractFramesModel.getSegmentFrameKeys().entrySet().iterator();
            while (it7.hasNext()) {
                Map.Entry<Integer, String> next4 = it7.next();
                if (!LJJJJI(args, next4.getValue(), z)) {
                    HashMap<Integer, ArrayList<FrameItem>> framesV12 = extractFramesModel.getFramesV1();
                    if (framesV12 != null) {
                        framesV12.remove(next4.getKey());
                    }
                    HashMap<Integer, List<String>> multiStickers3 = extractFramesModel.getMultiStickers();
                    if (multiStickers3 != null) {
                        multiStickers3.remove(next4.getKey());
                    }
                    it7.remove();
                }
            }
        }
        EditorProModel editorProModel = args.getEditorProModel();
        if (editorProModel != null && editorProModel.isAdvancedEditDraft()) {
            HashMap<Integer, ArrayList<FrameItem>> framesV13 = extractFramesModel.getFramesV1();
            if (framesV13 == null) {
                return;
            }
            for (Map.Entry<Integer, ArrayList<FrameItem>> entry2 : framesV13.entrySet()) {
                String str2 = extractFramesModel.getSegmentFrameKeys().get(entry2.getKey());
                if (str2 != null && str2.length() != 0) {
                    ArrayList arrayList4 = (ArrayList) LJJJZ(args, str2);
                    if (arrayList4.isEmpty()) {
                        entry2.getValue().clear();
                    } else {
                        for (int size = entry2.getValue().size() - 1; -1 < size; size--) {
                            Iterator it8 = arrayList4.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    break;
                                }
                                Object next5 = it8.next();
                                HFO hfo = (HFO) next5;
                                Object obj = ListProtector.get(entry2.getValue(), size);
                                o.LJIIIIZZ(obj, "entry.value[i]");
                                long timeStamp = ((FrameItem) obj).getTimeStamp() / 1000;
                                if (timeStamp >= hfo.LJLIL && timeStamp <= hfo.LJLILLLLZI) {
                                    if (next5 != null) {
                                    }
                                }
                            }
                            ListProtector.remove(entry2.getValue(), size);
                        }
                    }
                }
            }
            return;
        }
        HashMap<Integer, ArrayList<FrameItem>> framesV14 = extractFramesModel.getFramesV1();
        if (framesV14 == null) {
            return;
        }
        for (Map.Entry<Integer, ArrayList<FrameItem>> entry3 : framesV14.entrySet()) {
            String str3 = extractFramesModel.getSegmentFrameKeys().get(entry3.getKey());
            if (str3 != null && str3.length() != 0 && (LJJJLZIJ = LJJJLZIJ(args, str3)) != null) {
                ORS.LJJLIL(new AqS173S0100000_7(LJJJLZIJ, (OSZ<Long, Long>) 182), entry3.getValue());
            }
        }
    }

    public static final boolean LJJJJI(VideoPublishEditModel model, String str, boolean z) {
        o.LJIIIZ(model, "model");
        TimeSpeedModelExtension timeSpeedModelExtension = null;
        if (model.getEditorProModel().isAdvancedEditDraft()) {
            if (str == null) {
                return true;
            }
            ArrayList<TimeSpeedModelExtension> arrayList = model.multiEditVideoRecordData.editSegments;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            ArrayList<TimeSpeedModelExtension> arrayList2 = model.multiEditVideoRecordData.editSegments;
            o.LJIIIIZZ(arrayList2, "model.multiEditVideoRecordData.editSegments");
            Iterator<TimeSpeedModelExtension> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TimeSpeedModelExtension next = it.next();
                TimeSpeedModelExtension timeSpeedModelExtension2 = next;
                if (timeSpeedModelExtension2.getIdentityKey() != null && o.LJ(timeSpeedModelExtension2.getIdentityKey(), str)) {
                    timeSpeedModelExtension = next;
                    break;
                }
            }
            TimeSpeedModelExtension timeSpeedModelExtension3 = timeSpeedModelExtension;
            if (timeSpeedModelExtension3 == null) {
                return false;
            }
            if (model.hasUploadFrameConditionInEdit()) {
                return true;
            }
            String stickerId = timeSpeedModelExtension3.getStickerId();
            if (stickerId != null && stickerId.length() != 0) {
                return true;
            }
            List<String> pipResourcePaths = model.getEditorProModel().getPipResourcePaths();
            if ((pipResourcePaths != null && !pipResourcePaths.isEmpty()) || z) {
                return true;
            }
            return false;
        }
        if (str == null) {
            return true;
        }
        ArrayList<TimeSpeedModelExtension> finalVideoList = model.getFinalVideoList();
        o.LJIIIIZZ(finalVideoList, "model.finalVideoList");
        Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TimeSpeedModelExtension next2 = it2.next();
            String identityKey = next2.getIdentityKey();
            if (identityKey != null && o.LJ(identityKey, str)) {
                timeSpeedModelExtension = next2;
                break;
            }
        }
        TimeSpeedModelExtension timeSpeedModelExtension4 = timeSpeedModelExtension;
        if (timeSpeedModelExtension4 == null) {
            return false;
        }
        if (model.hasUploadFrameConditionInEdit()) {
            return true;
        }
        String stickerId2 = timeSpeedModelExtension4.getStickerId();
        if ((stickerId2 != null && stickerId2.length() != 0) || z) {
            return true;
        }
        return false;
    }

    public static void LJJIJL(C62394OeE c62394OeE, boolean z, Activity activity, int i) {
        boolean z2 = true;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            activity = C84763XOl.LJIIIIZZ();
        }
        if ((i & 4) == 0) {
            z2 = false;
        }
        C62275OcJ.LIZLLL(c62394OeE, z, activity, z2, 16);
    }

    public static void LJJJJZI(String str, String str2, int i, JSONObject jSONObject) {
        try {
            InterfaceC64741Paz tTNetDepend = TTNetInit.getTTNetDepend();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("module_type", str);
            if (i != Integer.MAX_VALUE) {
                jSONObject2.put("code", i);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("message", str2);
            }
            jSONObject2.put("detail_log", jSONObject);
            Logger.debug();
            tTNetDepend.LJIIJJI("ttnet_all_log", jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public static final Iterator LJJZ(Iterator iterator, int i, int i2, boolean z) {
        o.LJIIIZ(iterator, "iterator");
        if (!iterator.hasNext()) {
            return OJB.LJLIL;
        }
        C38488F8q c38488F8q = new C38488F8q(i, i2, iterator, z, true, null);
        C37656EqC c37656EqC = new C37656EqC();
        c37656EqC.LJLJJI = C78555UsJ.LJIILIIL(c38488F8q, c37656EqC, c37656EqC);
        return c37656EqC;
    }

    public static void LJJLIIIJJI(Context context, int i, int i2, int i3, int i4) {
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        C6QQ.LIZ(new HP8(context, i, i2, i3, null));
    }

    public static final void LJJJJLI(String str, Context context, boolean z, boolean z2, C60072Nhs c60072Nhs, AbstractC60815Ntr abstractC60815Ntr, AbstractC60811Ntn abstractC60811Ntn, InterfaceC60850NuQ interfaceC60850NuQ) {
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(context, "context");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        String LLLZ = C16880lQ.LLLZ("aweme://webview/?url=%s&use_spark=1&target_handler=crossPlatform", Arrays.copyOf(new Object[]{android.net.Uri.encode(str)}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        sparkContext.LJJIJLIJ(LLLZ);
        sparkContext.LJJIIJZLJL("show_close_all", z);
        sparkContext.LJJIIJZLJL("use_webview_title", true);
        sparkContext.LJJIIJZLJL("show_web_url", true);
        if (z2) {
            sparkContext.LJJIIJZLJL("need_sec_link", true);
            sparkContext.LJJIIJ("sec_link_scene", "anchor_article");
        }
        if (c60072Nhs != null) {
            sparkContext.LJJIJL(new C60071Nhr(c60072Nhs));
        }
        sparkContext.LJII(M2K.class, new C45805HyL());
        if (abstractC60815Ntr != null) {
            sparkContext.LJJ(abstractC60815Ntr);
        }
        if (abstractC60811Ntn != null) {
            sparkContext.LJJI(abstractC60811Ntn);
        }
        if (interfaceC60850NuQ != null) {
            sparkContext.LJJIJIIJI(interfaceC60850NuQ);
        }
        OKG.LIZLLL(c40342FsQ, context, sparkContext);
    }
}
