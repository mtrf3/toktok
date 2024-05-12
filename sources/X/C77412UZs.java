package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.format.DateFormat;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResults;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import com.zhiliaoapp.musically.R;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.TimeZone;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UZs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77412UZs implements InterfaceC48038ItG, HF6, InterfaceC36767Ebr, InterfaceC46111I7v {
    public static JSONObject LJLILLLLZI;
    public static long LJLJI;
    public static long LJLJJI;
    public static final C77412UZs LJLIL = new C77412UZs();
    public static final C77412UZs LJLJJL = new C77412UZs();

    public static boolean LJJJ(byte b) {
        return b > -65;
    }

    @Override // X.InterfaceC36767Ebr
    public void LIZIZ(String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // X.InterfaceC36767Ebr
    public void LIZJ(String message, Throwable throwable) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(throwable, "throwable");
    }

    public static final LiveEffect LJIIJ() {
        LiveEffect liveEffect = new LiveEffect();
        liveEffect.effectId = 0L;
        liveEffect.setResourceId(CardStruct.IStatusCode.DEFAULT);
        liveEffect.isNone = true;
        liveEffect.name = C15380j0.LJIILJJIL(R.string.l8m);
        liveEffect.isDownloaded = true;
        liveEffect.setUnzipPath("");
        return liveEffect;
    }

    @Override // X.InterfaceC46111I7v
    public void LIZ() {
        C3Z.LIZ.getClass();
        C3Z.LIZJ();
    }

    public static final InterfaceC75579TlP LJJIIJZLJL() {
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            return R6.LJJZZI();
        }
        return null;
    }

    public static void LJI(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ReadTextEffectBean LJIIIZ(Effect effect) {
        o.LJIIIZ(effect, "<this>");
        try {
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = (ReadTextEffectSpeakerExtra) C82891Wg3.LIZJ().LJI(effect.getExtra(), ReadTextEffectSpeakerExtra.class);
            if (readTextEffectSpeakerExtra == null) {
                long j = 0;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                readTextEffectSpeakerExtra = new ReadTextEffectSpeakerExtra(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr3, j, j, 8191, 0 == true ? 1 : 0);
            } else {
                String name = effect.getName();
                o.LJIIIZ(name, "<set-?>");
                readTextEffectSpeakerExtra.speakerName = name;
            }
            return new ReadTextEffectBean(effect, readTextEffectSpeakerExtra);
        } catch (Exception e) {
            C82891Wg3.LIZLLL().LIZIZ(e);
            return null;
        }
    }

    public static final String LJIILIIL(String filterDir) {
        File[] listFiles;
        o.LJIIIZ(filterDir, "filterDir");
        File file = new File(filterDir);
        String str = "";
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isDirectory()) {
                    String name = file2.getName();
                    File[] listFiles2 = file2.listFiles();
                    if (listFiles2 != null) {
                        int length = listFiles2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            File file3 = listFiles2[i];
                            if (file3 != null) {
                                if (file3.isFile()) {
                                    String name2 = file3.getName();
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(name);
                                    LIZ.append(".png");
                                    if (o.LJ(name2, X1D.LIZIZ(LIZ))) {
                                        str = file3.getAbsolutePath();
                                        o.LJIIIIZZ(str, "filterPathChild.absolutePath");
                                        break;
                                    }
                                }
                                if (file3.isDirectory()) {
                                    name = file3.getName();
                                    File[] listFiles3 = file3.listFiles();
                                    if (listFiles3 != null) {
                                        int length2 = listFiles3.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length2) {
                                                break;
                                            }
                                            File file4 = listFiles3[i2];
                                            if (file4 != null && file4.isFile()) {
                                                String name3 = file4.getName();
                                                StringBuilder LIZ2 = X1D.LIZ();
                                                LIZ2.append(name);
                                                LIZ2.append(".png");
                                                if (o.LJ(name3, X1D.LIZIZ(LIZ2))) {
                                                    str = file4.getAbsolutePath();
                                                    o.LJIIIIZZ(str, "pathChild.absolutePath");
                                                    break;
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return str;
    }

    public static String LJIILJJIL(long j) {
        if (j <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", calendar).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DraftDeleteResult LJIILL(AwemeDraft awemeDraft) {
        o.LJIIIZ(awemeDraft, "<this>");
        return new DraftDeleteResult(awemeDraft.LIZ(), C30591Hz.LJIIJ(awemeDraft), LJIILJJIL(awemeDraft.lastEditTime), awemeDraft.LJJJJI.saveDraftAppVersion, 0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, awemeDraft.LIZ.draftInfoModel.draftAwemeType, 496, 0 == true ? 1 : 0);
    }

    public static final NAF LJIJ(MusicDetail musicDetail) {
        List<Music> list;
        if (musicDetail == null) {
            return NAF.NOTHING;
        }
        if (!CommerceMediaServiceImpl.LIZJ().LJIILLIIL(musicDetail.music)) {
            return NAF.NOTHING;
        }
        int i = musicDetail.aiRecommendShowType;
        if (i == 1) {
            return NAF.NEW_AI_RECOMMENDED_MUSIC_SHEET_MUSIC_VIEW;
        }
        if (i == 2) {
            return NAF.NEW_AI_RECOMMENDED_MUSIC_SHEET_MV_VIEW;
        }
        if (!musicDetail.showRecommendMusic || (list = musicDetail.recommendMusicList) == null || list.isEmpty()) {
            return NAF.ONLY_COMMERCIAL_MUSIC_TEXT_VIEW;
        }
        return NAF.AI_RECOMMEND_MUSIC_CARD_LIST_VIEW;
    }

    public static final CreativeInfo LJIJI(Intent intent) {
        o.LJIIIZ(intent, "<this>");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "creation_id");
        if (LLJJIJIIJIL == null || LLJJIJIIJIL.length() == 0) {
            LLJJIJIIJIL = C44384HbQ.LJJJJIZL();
        }
        return new CreativeInfo(LLJJIJIIJIL, intent.getIntExtra("creative_version", 0), C16880lQ.LLJJIJIIJIL(intent, "session_id"));
    }

    public static final CreativeInfo LJIJJ(Bundle bundle) {
        o.LJIIIZ(bundle, "<this>");
        String string = bundle.getString("creation_id");
        if (string == null || string.length() == 0) {
            string = C44384HbQ.LJJJJIZL();
        }
        return new CreativeInfo(string, bundle.getInt("creative_version", 0), bundle.getString("session_id"));
    }

    public static String LJIJJLI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        C66960QPs.LIZ().getClass();
        return JBR.LJFF(LIZ, "api-va.tiktokv.com", str, LIZ);
    }

    public static final boolean LJIL(LiveEffect liveEffect) {
        Effect effect;
        if (liveEffect == null || (effect = liveEffect.getEffect()) == null || effect.getEffect_type() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJ(LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "<this>");
        if (liveEffect.parentEffectId != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJI(LiveEffect liveEffect) {
        LiveEffect.PlDataBean plDataBean;
        if (liveEffect != null) {
            LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
            if (stickerSDKExtra != null) {
                plDataBean = stickerSDKExtra.pl;
            } else {
                plDataBean = null;
            }
            if (plDataBean != null) {
                return true;
            }
            if (liveEffect != null && liveEffect.isGreenScreen) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIFFI(C7F9 c7f9) {
        boolean z;
        boolean z2;
        o.LJIIIZ(c7f9, "<this>");
        List<S1E> LIZJ = c7f9.LIZJ();
        ArrayList arrayList = new ArrayList();
        for (S1E s1e : LIZJ) {
            S1E s1e2 = s1e;
            if (s1e2.type() == EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE() || s1e2.type() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || s1e2.type() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                arrayList.add(s1e);
            }
        }
        if (arrayList.size() == c7f9.LIZJ().size()) {
            z = true;
        } else {
            z = false;
        }
        if (c7f9.LIZIZ() - c7f9.LIZJ().size() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }

    public static final boolean LJJII(LiveEffect liveEffect) {
        Boolean valueOf;
        if (liveEffect == null) {
            return false;
        }
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
            if (stickerSDKExtra == null) {
                return false;
            }
            valueOf = Boolean.valueOf(stickerSDKExtra.isAvatar);
        } else {
            valueOf = Boolean.valueOf(C0TZ.LIZ(liveEffect.sdkExtra, "is_avatar", false));
        }
        if (valueOf == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    public static final boolean LJJIII(LiveEffect liveEffect) {
        if (liveEffect == null || liveEffect.effectId <= 0 || liveEffect.localViewType == C6NP.NONE) {
            return true;
        }
        return false;
    }

    public static final void LJJIIZI(DraftRestoreResult draftRestoreResult) {
        o.LJIIIZ(draftRestoreResult, "<this>");
        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            C60903NvH.LJIIJJI().LJJJI().LJI().LIZLLL(draftRestoreResult);
            C60903NvH.LJIIJJI().LJJJI().LJI().LJFF(draftRestoreResult);
        }
    }

    public static final void LJJIJ(DraftSaveResult draftSaveResult) {
        o.LJIIIZ(draftSaveResult, "<this>");
        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
            C60903NvH.LJIIJJI().LJJJI().LJI().LJ(draftSaveResult);
            C60903NvH.LJIIJJI().LJJJI().LJI().LIZIZ(draftSaveResult);
        }
    }

    public static void LJJIJIIJI(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = LJLILLLLZI;
        if (jSONObject == null) {
            LJLILLLLZI = new JSONObject();
            LJLJJI = uptimeMillis;
        } else {
            try {
                jSONObject.put(str, uptimeMillis - LJLJI);
            } catch (JSONException unused) {
            }
        }
        LJLJI = uptimeMillis;
    }

    public static final Object LJJIJIIJIL(Stack stack) {
        int i;
        o.LJIIIZ(stack, "<this>");
        Object pop = stack.pop();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stack pop : element hashcode = ");
        if (pop != null) {
            i = pop.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(", size = ");
        LIZ.append(stack.size());
        N8M.LIZ(X1D.LIZIZ(LIZ));
        return pop;
    }

    public static final void LJJIL(List list) {
        o.LJIIIZ(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C56309M8b c56309M8b = (C56309M8b) it.next();
            c56309M8b.getClass();
            c56309M8b.LJLJJLL = C55360Lo4.LJLIL;
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        InterfaceC68901R2j it = (InterfaceC68901R2j) obj;
        o.LJIIJ(it, "it");
        return it.payload();
    }

    public static boolean LJFF(Context context, Intent intent) {
        PackageManager packageManager;
        List<ResolveInfo> queryBroadcastReceivers;
        if (context == null || (packageManager = context.getPackageManager()) == null || (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0)) == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:33554540), block:B:38:0x006c */
    public static void LJIIIIZZ(String str, String... strArr) {
        CheckedOutputStream checkedOutputStream;
        FileOutputStream fileOutputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(str));
                try {
                    checkedOutputStream = new CheckedOutputStream(fileOutputStream, new CRC32());
                } catch (Exception e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                    checkedOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            checkedOutputStream = null;
            fileOutputStream = null;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(checkedOutputStream);
            try {
                for (String str2 : strArr) {
                    File file = new File(str2);
                    if (file.exists()) {
                        LJII(file, "", zipOutputStream);
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str2);
                        LIZ.append(" does not exist!");
                        throw new RuntimeException(X1D.LIZIZ(LIZ));
                    }
                }
                LJI(zipOutputStream);
                LJI(checkedOutputStream);
                LJI(fileOutputStream);
            } catch (Exception e3) {
                e = e3;
                throw new RuntimeException(e);
            }
        } catch (Exception e4) {
            e = e4;
            throw new RuntimeException(e);
        } catch (Throwable th4) {
            th = th4;
            LJI(closeable2);
            LJI(checkedOutputStream);
            LJI(fileOutputStream);
            throw th;
        }
    }

    public static String LJIIJJI(String str, String str2) {
        try {
            if (str2 == null) {
                return URLEncoder.encode(str, "ISO-8859-1");
            }
            if (str2.equals("null_encoding")) {
                return str;
            }
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final void LJIIL(LiveEffect liveEffect, int i) {
        boolean z;
        String jSONObject;
        try {
            String str = liveEffect.extra;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                JSONObject jSONObject2 = new JSONObject(liveEffect.extra);
                if (!jSONObject2.has("effect_type")) {
                    jSONObject2.put("effect_type", i);
                }
                jSONObject = jSONObject2.toString();
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("effect_type", i);
                jSONObject = jSONObject3.toString();
            }
            liveEffect.extra = jSONObject;
        } catch (Exception unused) {
        }
    }

    public static final InterfaceC07790Sh LJJIIJ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88473Ynt measure) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(measure, "measure");
        return interfaceC07790Sh.LLLIIIL(new C537028w(measure));
    }

    public static final void LJJIIZ(BZI bzi, LiveEffect liveEffect) {
        String str;
        Integer num;
        Integer num2;
        o.LJIIIZ(liveEffect, "liveEffect");
        bzi.LJIJJ(liveEffect.effectPanelKey, "tab_name");
        bzi.LJIJJ(Long.valueOf(liveEffect.effectId), "effect_id");
        bzi.LJIJJ(liveEffect.getResourceId(), "resource_id");
        String str2 = liveEffect.parentResName;
        if (str2 == null) {
            str2 = liveEffect.getName();
        }
        bzi.LJIJJ(str2, "beauty_type");
        String str3 = liveEffect.parentResName;
        if (str3 == null) {
            str3 = liveEffect.getName();
        }
        bzi.LJIJJ(str3, "beauty_type_name");
        if (liveEffect.isSubItem()) {
            str = liveEffect.getName();
        } else {
            str = "";
        }
        bzi.LJIJJ(str, "beauty_type_name_tier2");
        if (liveEffect.isSubItem()) {
            num = liveEffect.parentImpressionPos;
        } else {
            num = liveEffect.impressionPos;
        }
        if (num != null) {
            num2 = C77339UWx.LIZIZ(num, 1);
        } else {
            num2 = null;
        }
        bzi.LJIJJ(num2, "impr_position");
    }

    public static final void LJJIJIL(Intent intent, CreativeInfo creativeInfo) {
        o.LJIIIZ(intent, "<this>");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        LJJIJL(intent, creativeInfo.getCreationId(), creativeInfo.getVersion(), creativeInfo.getSessionId());
    }

    public static final void LJJIJLIJ(Bundle bundle, CreativeInfo creativeInfo) {
        o.LJIIIZ(bundle, "<this>");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String creationId = creativeInfo.getCreationId();
        int version = creativeInfo.getVersion();
        String sessionId = creativeInfo.getSessionId();
        o.LJIIIZ(creationId, "creationId");
        if (creationId.length() <= 0) {
            creationId = C44384HbQ.LJJJJIZL();
        }
        bundle.putString("creation_id", creationId);
        bundle.putInt("creative_version", version);
        bundle.putString("session_id", sessionId);
    }

    public static AnonymousClass217 LIZLLL(String str, AssetManager assetManager, C13640gC weight) {
        C13610g9 LIZ = C13620gA.LIZ(weight, 0, new InterfaceC13600g8[0]);
        o.LJIIIZ(weight, "weight");
        return new AnonymousClass217(assetManager, str, weight, 0, LIZ);
    }

    public static AnonymousClass217 LJ(AssetManager assetManager, String str, C13640gC weight) {
        o.LJIIIZ(weight, "weight");
        return new AnonymousClass217(assetManager, str, weight, 0, C13620gA.LIZ(weight, 0, new InterfaceC13600g8[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(File file, String str, ZipOutputStream zipOutputStream) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        File[] listFiles;
        if (file.isDirectory()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(file.getName());
            LIZ.append(File.separator);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (!file.exists() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : listFiles) {
                LJII(file2, LIZIZ, zipOutputStream);
            }
            return;
        }
        if (!file.exists()) {
            return;
        }
        FileInputStream fileInputStream3 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(file.getName());
                    zipOutputStream.putNextEntry(new ZipEntry(X1D.LIZIZ(LIZ2)));
                    byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, FileUtils.BUFFER_SIZE);
                        if (read != -1) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            LJI(bufferedInputStream);
                            LJI(fileInputStream);
                            return;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    fileInputStream3 = bufferedInputStream;
                    fileInputStream2 = fileInputStream3;
                    fileInputStream3 = fileInputStream;
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream3;
                        fileInputStream3 = fileInputStream2;
                        LJI(fileInputStream3);
                        LJI(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream3 = bufferedInputStream;
                    LJI(fileInputStream3);
                    LJI(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DraftRestoreResult LJIILLIIL(AwemeDraft awemeDraft, String str, int i) {
        String fileTreeInfo = str;
        DraftCheckResult draftCheckResult = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if ((i & 2) != 0) {
            fileTreeInfo = "";
        }
        o.LJIIIZ(awemeDraft, "<this>");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        return new DraftRestoreResult(awemeDraft.LIZ(), C30591Hz.LJIIJ(awemeDraft), LJIILJJIL(awemeDraft.lastEditTime), awemeDraft.LJJJJI.saveDraftAppVersion, 1, fileTreeInfo, draftCheckResult, objArr3 == true ? 1 : 0, awemeDraft.LJJJ, objArr2 == true ? 1 : 0, awemeDraft.LIZ.draftInfoModel.draftAwemeType, awemeDraft.LIZIZ().getVersion(), 192, objArr == true ? 1 : 0);
    }

    public static final void LJJIZ(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC57357MfB data, EnumC84576XHg type) {
        boolean z;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(type, "type");
        if (type == EnumC84576XHg.Optimistic) {
            z = true;
        } else {
            z = false;
        }
        for (IMotaCache iMotaCache : (Iterable) interfaceC88471Ynr.invoke(data, Boolean.valueOf(z))) {
            C84578XHi.LIZJ(iMotaCache.getMotaCacheID(), iMotaCache, type);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DraftSaveResult LJIIZILJ(AwemeDraft awemeDraft, Throwable th, String str, int i) {
        boolean z;
        Throwable th2 = th;
        String fileTreeInfo = str;
        if ((i & 1) != 0) {
            th2 = null;
        }
        if ((i & 2) != 0) {
            fileTreeInfo = "";
        }
        o.LJIIIZ(awemeDraft, "<this>");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        String LIZ = awemeDraft.LIZ();
        int LJIIJ = C30591Hz.LJIIJ(awemeDraft);
        int i2 = awemeDraft.LIZIZ;
        String LJIILJJIL = LJIILJJIL(awemeDraft.lastEditTime);
        long updateVersionCode = C60903NvH.LJIIJJI().getUpdateVersionCode();
        int i3 = 1;
        DraftSavePreProcessResults draftSavePreProcessResults = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (awemeDraft.LJJJ || awemeDraft.LJJJJ) {
            z = true;
        } else {
            z = false;
        }
        DraftInfoModel draftInfoModel = awemeDraft.LIZ.draftInfoModel;
        return new DraftSaveResult(LIZ, LJIIJ, i2, LJIILJJIL, updateVersionCode, i3, fileTreeInfo, draftSavePreProcessResults, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, z, th2, draftInfoModel.saveDraftScene, draftInfoModel.draftAwemeType, awemeDraft.LIZIZ().getVersion(), 1920, objArr == true ? 1 : 0);
    }

    public static final void LJJIJL(Intent intent, String creationId, int i, String str) {
        o.LJIIIZ(intent, "<this>");
        o.LJIIIZ(creationId, "creationId");
        if (creationId.length() <= 0) {
            creationId = C44384HbQ.LJJJJIZL();
        }
        intent.putExtra("creation_id", creationId);
        intent.putExtra("creative_version", i);
        intent.putExtra("session_id", str);
    }
}
