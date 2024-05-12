package X;

import Y.AfS7S2000000_13;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictor;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictorListener;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictorMLConfig;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.inbox.SkylightStoryUser;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.UrlModel;
import defpackage.b1;
import defpackage.i0;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.o;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Uyw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78966Uyw implements InterfaceC26409AYb, C0K7, RTU, InterfaceC31922Cfu {
    public static StringBuilder LJLILLLLZI;
    public static Aweme LJLJJI;
    public static List LJLJJL;
    public static User LJLJJLL;
    public static ISpeedPredictorListener LJLJL;
    public static ISpeedPredictorMLConfig LJLJLJ;
    public static ISpeedPredictor LJLJLLL;
    public static DefaultSpeedPredictor LJLL;
    public static final C78966Uyw LJLIL = new C78966Uyw();
    public static final C78966Uyw LJLJI = new C78966Uyw();

    public static int LJJIFFI() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        LJIIJ("glGenTextures");
        int i = iArr[0];
        if (i != 0) {
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
        }
        return iArr[0];
    }

    public static final String LJJIIJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("default");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append("\"");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("\"");
            } else {
                sb.append(",\"");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("\"");
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        LIZ.append(sb2);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public static IIMUnder16Proxy LJJIJ() {
        Object LIZ = C58096Mr6.LIZ(IIMUnder16Proxy.class, false);
        if (LIZ != null) {
            return (IIMUnder16Proxy) LIZ;
        }
        if (C58096Mr6.l1 == null) {
            synchronized (IIMUnder16Proxy.class) {
                if (C58096Mr6.l1 == null) {
                    C58096Mr6.l1 = new IMUnder16ProxyImpl();
                }
            }
        }
        return C58096Mr6.l1;
    }

    public static final boolean LJJIJL() {
        C72041SPd.LIZ.getClass();
        PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
        if (LJI != null) {
            return C62848OlY.LIZLLL(LJI);
        }
        return false;
    }

    public static final C1HQ LJFF(OSZ... oszArr) {
        C1HQ c1hq = new C1HQ();
        for (OSZ osz : oszArr) {
            c1hq.put(osz.getFirst(), osz.getSecond());
        }
        return c1hq;
    }

    public static final SKZ LJI(int i) {
        C71909SKb.LIZ.getClass();
        return C71909SKb.LIZLLL().LJ(i);
    }

    public static final C76H LJII(C64907Pdf cachePolicy) {
        o.LJIIIZ(cachePolicy, "$this$cachePolicy");
        Object obj = cachePolicy.LJII;
        Object obj2 = null;
        if (!(obj instanceof C252699vt)) {
            obj = null;
        }
        C252699vt c252699vt = (C252699vt) obj;
        if (c252699vt == null) {
            return null;
        }
        Object obj3 = c252699vt.LJIJ.get(C76H.class);
        if (obj3 instanceof C76H) {
            obj2 = obj3;
        }
        return (C76H) obj2;
    }

    public static int LJIIJ(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder LIZJ = b1.LIZJ(str, ": gl error = ");
            LIZJ.append(GLUtils.getEGLErrorString(glGetError));
            C48284IxE.LIZ(6, -1, "GLUtils", X1D.LIZIZ(LIZJ));
        }
        return glGetError;
    }

    public static void LJIIJJI(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public static final boolean LJIILL(Effect containDiffInfo) {
        o.LJIIJ(containDiffInfo, "$this$containDiffInfo");
        if (C78970Uz0.LIZ && containDiffInfo.getSource() == 101 && containDiffInfo.getFile_diff() != null) {
            return true;
        }
        return false;
    }

    public static IMUser LJIIZILJ(User user) {
        if (user == null) {
            return null;
        }
        return IMUser.fromUser(user);
    }

    public static void LJIJ(int i) {
        if (i > 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    public static final C44001o4 LJIJI(InterfaceC65784Pro calculation) {
        o.LJIIIZ(calculation, "calculation");
        return new C44001o4(calculation);
    }

    public static final boolean LJIJJ(Room room) {
        Long l;
        java.util.Map<Long, Long> map = room.adminEcShowPermission;
        if (map == null || (l = map.get(8L)) == null || l.longValue() != 1) {
            return false;
        }
        return true;
    }

    public static final String LJIJJLI(String str) {
        o.LJIIIZ(str, "<this>");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (ujb.o.LJJJJ(str, separator, false)) {
            return str;
        }
        return i0.LJFF(str, separator);
    }

    public static final String LJIL(Effect expectedMd5) {
        DiffEffect file_diff;
        UrlModel diff_url;
        String uri;
        o.LJIIJ(expectedMd5, "$this$expectedMd5");
        if (LJIILL(expectedMd5) && (file_diff = expectedMd5.getFile_diff()) != null && (diff_url = file_diff.getDiff_url()) != null && (uri = diff_url.getUri()) != null) {
            return uri;
        }
        if (o.LJ(expectedMd5.getFile_url().getUri(), "")) {
            return null;
        }
        return expectedMd5.getFile_url().getUri();
    }

    public static final String[] LJJ(SkuItem skuItem) {
        List<SkuSaleProp> list;
        if (skuItem != null && (list = skuItem.skuSalePropList) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<SkuSaleProp> it = list.iterator();
            while (it.hasNext()) {
                String str = it.next().propValueId;
                if (str == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        return null;
    }

    public static String LJJII(String str) {
        String str2 = new String();
        if (str != null) {
            str2 = i0.LJFF(str2, str);
        }
        Random random = new Random();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        LIZ.append(random.nextInt());
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ);
        LIZ2.append(System.currentTimeMillis());
        return Base64.encodeToString(X1D.LIZIZ(LIZ2).getBytes(), 2);
    }

    public static final int LJJIIZ(MusNotice musNotice) {
        AnnouncementNotice announcementNotice;
        CommentNotice commentNotice;
        o.LJIIIZ(musNotice, "<this>");
        if (musNotice.templateNotice != null) {
            return -10000;
        }
        int i = musNotice.type;
        if ((i == 1 || i == 11) && (announcementNotice = musNotice.announcement) != null && announcementNotice.getChallenge() != null) {
            return 101;
        }
        if (musNotice.type == 31 && (commentNotice = musNotice.commentNotice) != null && commentNotice.isReplyWithVideo()) {
            return 1003;
        }
        return musNotice.type;
    }

    public static boolean LJJIJIIJI(Collection collection) {
        if (collection != null && collection.size() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(String str) {
        File file;
        o.LJIIIZ(str, "<this>");
        if (C44694HgQ.LJIL(str)) {
            return true;
        }
        Application application = C60903NvH.LJ;
        if (Build.VERSION.SDK_INT >= 24) {
            file = C04290Ev.LIZIZ(application);
        } else {
            String str2 = application.getApplicationInfo().dataDir;
            if (str2 != null) {
                file = new File(str2);
            } else {
                file = null;
            }
        }
        o.LJI(file);
        String dataDir = file.getAbsolutePath();
        o.LJIIIIZZ(dataDir, "dataDir");
        return !ujb.o.LJJJLIIL(str, dataDir, false);
    }

    public static final boolean LJJIJIL(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (LJJIJLIJ(str)) {
            return true;
        }
        if (C44694HgQ.LJIL(str)) {
            return C44694HgQ.LJIJJLI(str, null);
        }
        return C1B6.LIZIZ(str);
    }

    public static final boolean LJJIJLIJ(String str) {
        o.LJIIIZ(str, "<this>");
        return ujb.o.LJJJLIIL(str, "http", false);
    }

    public static ParcelableSnapshotMutableState LJJJIL(Object obj) {
        return LJJJI(obj, C36041bE.LIZ);
    }

    public static final Bitmap LJJJJI(SingleImageCoverBitmapData singleImageCoverBitmapData) {
        double d;
        W5A w5a;
        W5B w5b;
        Bitmap bitmap = null;
        if (singleImageCoverBitmapData == null) {
            return null;
        }
        boolean z = true;
        if (singleImageCoverBitmapData.getPreviewBitmap() != null) {
            String key = singleImageCoverBitmapData.getPreviewBitmap();
            o.LJIIIZ(key, "key");
            if (o.LJ(C43662HBq.LIZ.getFirst(), key)) {
                bitmap = C43662HBq.LIZ.getSecond();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("try get previewSurfaceBitmap: ");
            if (bitmap == null) {
                z = false;
            }
            LIZ.append(z);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            return bitmap;
        }
        C44947HkV c44947HkV = InterfaceC44948HkW.LJI;
        if (c44947HkV.getOpenAlbumOptiGroup() == 1) {
            d = 0.8d;
        } else if (c44947HkV.getOpenAlbumOptiGroup() == 2) {
            d = 0.6d;
        } else {
            d = 1.0d;
        }
        int itemCoverWidth = singleImageCoverBitmapData.getItemCoverWidth() * ((int) d);
        if (itemCoverWidth <= 0) {
            return null;
        }
        W6K LIZJ = W8E.LJII().LIZJ();
        String uri = C44694HgQ.LJIIIIZZ(singleImageCoverBitmapData.getSourcePath()).toString();
        C79238V7y c79238V7y = new C79238V7y(itemCoverWidth, itemCoverWidth);
        V85 v85 = V85.LIZJ;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.getClass();
        C81392Vwy LJFF = LIZJ.LJFF(new V91(uri, c79238V7y, v85, new C81810W8w(imageDecodeOptionsBuilder), null, null, null));
        if (LJFF != null) {
            w5a = (W5A) LJFF.LJI();
        } else {
            w5a = null;
        }
        if (!(w5a instanceof W5C) || (w5b = (W5B) w5a) == null) {
            return null;
        }
        return w5b.getUnderlyingBitmap();
    }

    public static final void LJJJJLL(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    public static final boolean LJJJJZ(File file) {
        o.LJIIIZ(file, "<this>");
        if (file.exists()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists()) {
                return file.createNewFile();
            }
            if (parentFile.mkdirs() && file.createNewFile()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final C3C3 LJJJJZI(InterfaceC65784Pro interfaceC65784Pro) {
        return new C3C3(new C2GU(interfaceC65784Pro, null));
    }

    public static final JSONObject LJJJLIIL(String str) {
        boolean z;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    return new JSONObject(str);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    public static final java.util.Map LJJJLZIJ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            return linkedHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String it = keys.next();
                String value = jSONObject.optString(it);
                o.LJIIIIZZ(it, "it");
                o.LJIIIIZZ(value, "value");
                linkedHashMap.put(it, value);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return linkedHashMap;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static final void LJ(C145995oB c145995oB, VideoPublishEditModel model) {
        String str;
        o.LJIIIZ(c145995oB, "<this>");
        o.LJIIIZ(model, "model");
        if (G6Y.LIZ()) {
            if (model.creativeModel.pugcTemplateData.canPostTemplate) {
                c145995oB.LIZLLL("is_allow_pugc_template", "1");
                c145995oB.LIZ(model.creativeModel.pugcTemplateData.contentCnt, "pugc_content_cnt");
                c145995oB.LIZ(model.creativeModel.pugcTemplateData.fixedSlots.size(), "pugc_non_replaceable_content_cnt");
                c145995oB.LIZLLL("pugc_non_replaceable_content_location_list", model.creativeModel.pugcTemplateData.fixedSlotIndex.toString());
                c145995oB.LIZLLL("pugc_content_duration_list", model.creativeModel.pugcTemplateData.slotDurations.toString());
            } else {
                c145995oB.LIZLLL("is_allow_pugc_template", CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (H7R.LJJLIIIJL(model)) {
            String str2 = model.creativeModel.ugcTemplateData.ugcTemplateId;
            if (str2 == null) {
                str2 = "";
            }
            c145995oB.LIZLLL("followed_template_id", str2);
            if (H7R.LJJJLIIL(model)) {
                str = "pugc";
            } else {
                str = "ugc";
            }
            c145995oB.LIZLLL("followed_template_type", str);
        }
    }

    public static int LJIIIIZZ(OTX otx, Throwable th) {
        int i;
        if (otx != null) {
            otx.LIZIZ();
        }
        if (th instanceof ConnectTimeoutException) {
            return -13;
        }
        if (th instanceof SocketTimeoutException) {
            i = -14;
        } else {
            if (!(th instanceof SocketException)) {
                if (!(th instanceof SSLPeerUnverifiedException)) {
                    if (!(th instanceof IOException)) {
                        if (!(th instanceof SSLHandshakeException)) {
                            if (th instanceof UnknownHostException) {
                                return -16;
                            }
                            return -1;
                        }
                    }
                }
                return -21;
            }
            i = -15;
        }
        if (otx == null || otx.LJ()) {
            return i;
        }
        return -12;
    }

    public static boolean LJIIIZ(Object[] objArr, Object[] objArr2) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                if (objArr2[i] != null) {
                    return false;
                }
            } else {
                if (!obj.equals(objArr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final InterfaceC35811ar LJIILIIL(InterfaceC71762rk interfaceC71762rk, InterfaceC24520xk interfaceC24520xk) {
        o.LJIIIZ(interfaceC71762rk, "<this>");
        interfaceC24520xk.LJJIIJ(-1439883919);
        InterfaceC35811ar LJIIL = LJIIL(interfaceC71762rk, interfaceC71762rk.getValue(), MBB.INSTANCE, interfaceC24520xk, 0);
        interfaceC24520xk.LJJIJIIJIL();
        return LJIIL;
    }

    public static int LJIILJJIL(int i, int i2) {
        return C07290Qj.LJIIL(i, (Color.alpha(i) * i2) / 255);
    }

    public static final String LJJI(SkuItem skuItem, Integer num) {
        String str;
        int i;
        List<SkuSaleProp> list;
        if (skuItem != null && (list = skuItem.skuSalePropList) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<SkuSaleProp> it = list.iterator();
            while (it.hasNext()) {
                String str2 = it.next().propValue;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = ORZ.LLD(arrayList, " · ", null, null, null, 62);
        } else {
            str = "";
        }
        if (C78685UuP.LJJJZ(str)) {
            StringBuilder LIZJ = b1.LIZJ(str, " · ");
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            LIZJ.append(i);
            return X1D.LIZIZ(LIZJ);
        }
        return str;
    }

    public static int LJJIII(int i, View view) {
        return C78972Uz2.LIZIZ(view.getContext(), i, C16880lQ.LJLLILLLL(view.getClass()));
    }

    public static final int LJJIIJZLJL(Fragment fragment, InterfaceC69056R8i accountCallback) {
        int i;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        int value = V86.DYABindEmailSourceTypeUnknown.getValue();
        Bundle extras = accountCallback.getExtras();
        if (extras != null) {
            i = extras.getInt("email_source", value);
        } else {
            i = value;
        }
        if (i == value) {
            LJJJJJ(accountCallback, "email");
        }
        return i;
    }

    public static final int LJJIIZI(Fragment fragment, InterfaceC69056R8i accountCallback) {
        int i;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        int value = EnumC78973Uz3.DYABindPhoneNumberSourceTypeUnknown.getValue();
        Bundle extras = accountCallback.getExtras();
        if (extras != null) {
            i = extras.getInt("phone_number_source", value);
        } else {
            i = value;
        }
        if (i == value) {
            LJJJJJ(accountCallback, "phone_number");
        }
        return i;
    }

    public static final boolean LJJJ(C64907Pdf matchCachePolicy, int i) {
        o.LJIIIZ(matchCachePolicy, "$this$matchCachePolicy");
        C76H LJII = LJII(matchCachePolicy);
        if (LJII == null || (LJII.LIZJ & i) <= 0) {
            return false;
        }
        return true;
    }

    public static final ParcelableSnapshotMutableState LJJJI(Object obj, InterfaceC24600xs policy) {
        o.LJIIIZ(policy, "policy");
        return new ParcelableSnapshotMutableState(obj, policy);
    }

    public static final InterfaceC35811ar LJJJJIZL(Object obj, InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJJIIJ(-1058319986);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = LJJJIL(obj);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
        interfaceC35811ar.setValue(obj);
        interfaceC24520xk.LJJIJIIJIL();
        return interfaceC35811ar;
    }

    public static final void LJJJJJ(InterfaceC69056R8i interfaceC69056R8i, String str) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", str);
        c198517qh.LIZ.put("stack_trace", android.util.Log.getStackTraceString(new Exception()));
        c198517qh.LIZ.put("enter_from", interfaceC69056R8i.q9().LJJLIIIJJI());
        c198517qh.LIZ.put("enter_method", interfaceC69056R8i.q9().LJJLIIIJLLLLLLLZ());
        JSONObject json = c198517qh.LJ();
        o.LJIIIIZZ(json, "json");
        Q13.LIZIZ("monitor_account_bind_with_unknown_source", 1, json);
    }

    public static final void LJJJJL(SafeMutableLiveData threadSoftValue, Object obj) {
        o.LJIIIZ(threadSoftValue, "$this$threadSoftValue");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            threadSoftValue.setValue(obj);
        } else {
            threadSoftValue.postValue(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0109, code lost:
    
        if (r6 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Type inference failed for: r0v35, types: [long] */
    /* JADX WARN: Type inference failed for: r0v37, types: [long] */
    /* JADX WARN: Type inference failed for: r6v0, types: [long[]] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJJLI(android.content.Context r12, java.lang.StringBuilder r13) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78966Uyw.LJJJJLI(android.content.Context, java.lang.StringBuilder):void");
    }

    public static String LJJJLL(String str, Object... objArr) {
        return new Formatter().format(str, objArr).toString();
    }

    public static final void LJJL(Object obj, InterfaceC67352kd interfaceC67352kd) {
        o.LJIIIZ(interfaceC67352kd, "<this>");
        try {
            C3C5.m7constructorimpl(obj);
            interfaceC67352kd.resumeWith(obj);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final Object LJJLI(WeakReference weakReference, InterfaceC88472Yns f) {
        o.LJIIIZ(weakReference, "<this>");
        o.LJIIIZ(f, "f");
        Object obj = weakReference.get();
        if (obj != null) {
            return f.invoke(obj);
        }
        return null;
    }

    @Override // X.InterfaceC26409AYb
    public void LIZIZ(String event, java.util.Map map) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(map, "map");
        FMX.LJIIL(event, map);
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        FollowingInterestUsersResponse live = (FollowingInterestUsersResponse) obj;
        StoryGetFeedByPageResponse story = (StoryGetFeedByPageResponse) obj2;
        o.LJIIIZ(live, "live");
        o.LJIIIZ(story, "story");
        List<Aweme> awemes = story.getAwemes();
        ArrayList arrayList = null;
        if (awemes != null) {
            List<FollowingInterestUser> followingInterestUsers = live.getFollowingInterestUsers();
            if (followingInterestUsers != null) {
                arrayList = new ArrayList(C32I.LJJL(followingInterestUsers, 10));
                Iterator<FollowingInterestUser> it = followingInterestUsers.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getUser().getUid());
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Aweme aweme : awemes) {
                Aweme aweme2 = aweme;
                if (!C54838Lfe.LJIJI(aweme2) && (arrayList == null || !arrayList.contains(aweme2.getAuthorUid()))) {
                    arrayList2.add(aweme);
                }
            }
            arrayList = arrayList2;
        }
        List<FollowingInterestUser> followingInterestUsers2 = live.getFollowingInterestUsers();
        boolean hasMore = story.getHasMore();
        long cursor = story.getCursor();
        long totalCnt = story.getTotalCnt();
        List<SkylightStoryUser> skylightStoryUsers = story.getSkylightStoryUsers();
        Aweme LJI = C55723Ltv.LIZIZ.LJIL().LJI();
        if (L7K.LJ && (arrayList == null || arrayList.isEmpty())) {
            return new LY3(followingInterestUsers2, C47261Igj.LJJIJ(LJI), C54838Lfe.LJIJI(LJI), hasMore, cursor, totalCnt, LYM.LIZLLL(arrayList, skylightStoryUsers));
        }
        return new LY3(followingInterestUsers2, arrayList, C54838Lfe.LJIJI(LJI), hasMore, cursor, totalCnt, LYM.LIZLLL(arrayList, skylightStoryUsers));
    }

    public static final void LIZJ(C145995oB c145995oB, VideoPublishEditModel model, String str) {
        boolean z;
        boolean z2;
        o.LJIIIZ(c145995oB, "<this>");
        o.LJIIIZ(model, "model");
        boolean LJ = o.LJ(model.getMusicOrigin(), "edit_page_tikbot_recommend");
        int i = 0;
        if (model.creativeModel.autoCutModel.curSource == C63A.ACTION_AI.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        List LJJIIZI = C44729Hgz.LJJIIZI(model);
        if (LJJIIZI != null) {
            Iterator it = ((ArrayList) LJJIIZI).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                TextStickerData textStickerData = (TextStickerData) next;
                if (textStickerData != null && textStickerData.isActionAIText()) {
                    if (next != null) {
                        z2 = true;
                    }
                }
            }
        }
        z2 = false;
        if (z || LJ || z2) {
            c145995oB.LIZLLL("is_edit_page_tikbot", "1");
        } else {
            c145995oB.LIZLLL("is_edit_page_tikbot", CardStruct.IStatusCode.DEFAULT);
        }
        if (z) {
            c145995oB.LIZLLL("is_tikbot_template", "1");
        } else {
            c145995oB.LIZLLL("is_tikbot_template", CardStruct.IStatusCode.DEFAULT);
        }
        if (o.LJ(str, "publish")) {
            List LJJIIZI2 = C44729Hgz.LJJIIZI(model);
            if (LJJIIZI2 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) LJJIIZI2).iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    TextStickerData textStickerData2 = (TextStickerData) next2;
                    if (textStickerData2 != null && textStickerData2.isActionAIText()) {
                        arrayList.add(next2);
                    }
                }
                i = arrayList.size();
            }
            c145995oB.LIZ(i, "edit_page_tikbot_text_clips_cnt");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r7 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.C145995oB r16, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78966Uyw.LIZLLL(X.5oB, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String):void");
    }

    public static int LJJIL(float f, int i, int i2) {
        return C07290Qj.LJIIIZ(C07290Qj.LJIIL(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final C73641SvF LJJIZ(AbstractC73638SvC abstractC73638SvC, String str, String str2) {
        o.LJIIIZ(abstractC73638SvC, "<this>");
        return abstractC73638SvC.LJIILIIL(new AfS7S2000000_13(str, str2, 7)).LJIIJ(new AfS7S2000000_13(str, str2, 8));
    }

    public static final void LJJJJ(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns start, InterfaceC88472Yns done) {
        o.LJIIIZ(start, "start");
        o.LJIIIZ(done, "done");
        C24730y5 c24730y5 = C24630xv.LIZIZ;
        C25710zf c25710zf = (C25710zf) c24730y5.LIZ();
        if (c25710zf == null) {
            c25710zf = new C25710zf(new OSZ[16]);
            c24730y5.LIZIZ(c25710zf);
        }
        try {
            c25710zf.LIZLLL(new OSZ(start, done));
            interfaceC65784Pro.invoke();
        } finally {
            c25710zf.LJIILJJIL(c25710zf.LJLJI - 1);
        }
    }

    public static final Object LJJJJJL(Gson gson, String str, Class cls) {
        boolean z;
        o.LJIIIZ(gson, "<this>");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return GsonProtectorUtils.fromJson(gson, str, cls);
        } catch (s unused) {
            return null;
        }
    }

    public static final C69925RcP LJJJZ(CommonFeedData commonFeedData, String str, C69926RcQ c69926RcQ) {
        List<Feed> list;
        boolean z;
        String str2;
        SkuItem skuItem;
        Integer num;
        int i;
        Integer num2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (commonFeedData == null || (list = commonFeedData.feedList) == null) {
            return new C69925RcP(null, null, null, null, null, null);
        }
        if (c69926RcQ == null) {
            for (Feed feed : list) {
                FeedProduct feedProduct = feed.product;
                if (feedProduct != null && (str2 = feedProduct.id) != null) {
                    List<SkuItem> list2 = feedProduct.skus;
                    String str3 = null;
                    if (list2 != null) {
                        skuItem = (SkuItem) ORZ.LJLLLL(list2);
                    } else {
                        skuItem = null;
                    }
                    boolean z2 = feed.product.isSelected;
                    String[] LJJ = LJJ(skuItem);
                    if (skuItem != null) {
                        num = skuItem.minBuyQuantity;
                    } else {
                        num = null;
                    }
                    String LJJI = LJJI(skuItem, num);
                    if (skuItem != null && (num2 = skuItem.minBuyQuantity) != null) {
                        i = num2.intValue();
                    } else {
                        i = 1;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (skuItem != null) {
                        str3 = skuItem.skuId;
                    }
                    linkedHashMap.put(str2, new RYM(LJJ, LJJI, valueOf, str3, feed.product.price, z2));
                }
            }
            z = false;
        } else {
            java.util.Map<String, RYM> map = c69926RcQ.LIZ;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            z = c69926RcQ.LIZIZ;
        }
        C69925RcP c69925RcP = new C69925RcP(commonFeedData.title, commonFeedData.addToCartButtonText, commonFeedData.promotion, commonFeedData.bundlePriceText, commonFeedData.feedList, new C69926RcQ(linkedHashMap, z));
        c69925RcP.LJLJLJ = str;
        c69925RcP.LJLJL = commonFeedData.requestId;
        c69925RcP.LJLJLLL = commonFeedData.minBundlePrice;
        c69925RcP.LJLL = commonFeedData.maxBundlePrice;
        return c69925RcP;
    }

    public static C1QV LIZ(int i, int i2, int i3, int i4) {
        C1RU colorSpace;
        Bitmap createBitmap;
        boolean z = false;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            colorSpace = C13240fY.LIZJ;
        } else {
            colorSpace = null;
        }
        o.LJIIIZ(colorSpace, "colorSpace");
        Bitmap.Config LJJLIIIJJI = C78688UuS.LJJLIIIJJI(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = C11640cy.LIZJ(i, i2, i3, z, colorSpace);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, LJJLIIIJJI);
            o.LJIIIIZZ(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z);
        }
        return new C1QV(createBitmap);
    }

    public static final InterfaceC35811ar LJIIL(InterfaceC65462ha interfaceC65462ha, Object obj, MBA mba, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(interfaceC65462ha, "<this>");
        interfaceC24520xk.LJJIIJ(-606625098);
        if ((i & 2) != 0) {
            mba = MBB.INSTANCE;
        }
        C2GT c2gt = new C2GT(mba, interfaceC65462ha, null);
        interfaceC24520xk.LJJIIJ(-1703169085);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = LJJJIL(obj);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
        C24610xt.LIZLLL(interfaceC65462ha, mba, new C2GQ(c2gt, interfaceC35811ar, null), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        interfaceC24520xk.LJJIJIIJIL();
        return interfaceC35811ar;
    }
}
