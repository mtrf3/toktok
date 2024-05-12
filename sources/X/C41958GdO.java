package X;

import Y.ARunnableS43S0100000_7;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GdO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41958GdO implements InterfaceC41365GLh {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C41966GdW.LJLIL);

    public static final void LJII() {
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        ((IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class)).setInterruptRecoverPath("");
    }

    public static final String LJIIIZ() {
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        return ((IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class)).getInterruptRecoverPath("");
    }

    public static final java.util.Set<String> LJIIL() {
        C43068GvI c43068GvI = new C43068GvI(C41407GMx.LJLIL);
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class);
        Object fromJson = GsonProtectorUtils.fromJson(new Gson(), iVideoRecordPreferences.getPublishParallelUploadRecoverPath(""), new C41960GdQ().getType());
        ArrayList arrayList = (ArrayList) fromJson;
        if (arrayList == null || arrayList.isEmpty()) {
            fromJson = null;
        }
        ArrayList arrayList2 = (ArrayList) fromJson;
        if (arrayList2 != null) {
            c43068GvI.addAll(arrayList2);
        }
        c43068GvI.add(iVideoRecordPreferences.getUploadRecoverPath(""));
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(c43068GvI, 10));
        Iterator<T> it = c43068GvI.iterator();
        while (it.hasNext()) {
            arrayList3.add(C62850Ola.LJ().LIZLLL(new CreativeInfo((String) it.next(), 0, null, 6, null)));
        }
        return ORZ.LLJJ(arrayList3);
    }

    @Override // X.InterfaceC41365GLh
    public final void LIZIZ() {
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        ((IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class)).setPublishParallelUploadRecoverPath("");
    }

    @Override // X.InterfaceC41365GLh
    public final List<String> LIZJ() {
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(new Gson(), ((IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class)).getPublishParallelUploadRecoverPath(""), new C41962GdS().getType());
        if (arrayList == null) {
            return C61878OQg.INSTANCE;
        }
        return arrayList;
    }

    public final java.util.Map<String, String> LJIIIIZZ() {
        C41970Gda c41970Gda = (C41970Gda) ((C41967GdX) this.LIZ.getValue()).LIZ.getValue();
        String string = ((Keva) c41970Gda.LIZ.getValue()).getString("key_creation_biz_metrics", "{}");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                o.LJIIIIZZ(key, "key");
                String optString = jSONObject.optString(key, "");
                o.LJIIIIZZ(optString, "json.optString(key, \"\")");
                linkedHashMap.put(key, optString);
            }
        } catch (JSONException unused) {
            ((Keva) c41970Gda.LIZ.getValue()).clear();
        }
        return linkedHashMap;
    }

    public final void LJI() {
        if (GA5.LIZ()) {
            C41967GdX c41967GdX = (C41967GdX) this.LIZ.getValue();
            ((ExecutorService) c41967GdX.LIZIZ.getValue()).execute(new ARunnableS43S0100000_7(c41967GdX, 103));
        }
    }

    public static final void LJ(String str) {
        if (str == null) {
            return;
        }
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        ((IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class)).setInterruptRecoverPath(str);
    }

    public static final void LJFF(String str) {
        if (str == null) {
            return;
        }
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class);
        String publishParallelUploadRecoverPath = iVideoRecordPreferences.getPublishParallelUploadRecoverPath("");
        Gson gson = new Gson();
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(gson, publishParallelUploadRecoverPath, new C41961GdR().getType());
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (GVX.LJI && (!arrayList.isEmpty())) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        String json = GsonProtectorUtils.toJson(gson, arrayList);
        o.LJIIIIZZ(json, "gson.toJson(list)");
        iVideoRecordPreferences.setPublishParallelUploadRecoverPath(json);
    }

    public static final boolean LJIIJ(String str) {
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class);
        List list = (ArrayList) GsonProtectorUtils.fromJson(new Gson(), iVideoRecordPreferences.getLastAutoRecoverPaths(""), new C41963GdT().getType());
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        if (!o.LJ(str, iVideoRecordPreferences.getInterruptRecoverPath("")) || list.contains(str)) {
            return false;
        }
        return true;
    }

    public static final void LJIILIIL(String str) {
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class);
        Gson gson = new Gson();
        Object fromJson = GsonProtectorUtils.fromJson(gson, iVideoRecordPreferences.getLastAutoRecoverPaths(""), new C41964GdU().getType());
        if (fromJson == null) {
            fromJson = new ArrayList();
        }
        C65777Prh.LIZ(fromJson).remove(str);
        String json = GsonProtectorUtils.toJson(gson, fromJson);
        o.LJIIIIZZ(json, "gson.toJson(lastAutoRetryList)");
        iVideoRecordPreferences.setLastAutoRecoverPaths(json);
    }

    public static final void LJIILJJIL(String str) {
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class);
        String publishParallelUploadRecoverPath = iVideoRecordPreferences.getPublishParallelUploadRecoverPath("");
        Gson gson = new Gson();
        Object fromJson = GsonProtectorUtils.fromJson(gson, publishParallelUploadRecoverPath, new C41965GdV().getType());
        if (fromJson == null) {
            fromJson = new ArrayList();
        }
        C65777Prh.LIZ(fromJson).remove(str);
        String json = GsonProtectorUtils.toJson(gson, fromJson);
        o.LJIIIIZZ(json, "gson.toJson(list)");
        iVideoRecordPreferences.setPublishParallelUploadRecoverPath(json);
    }

    public static final void LJIILL(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel;
        String str;
        o.LJIIIZ(publishModel, "publishModel");
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        String str2 = null;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            if (videoPublishEditModel != null) {
                if (videoPublishEditModel.isStoryEditMode) {
                    return;
                } else {
                    str2 = videoPublishEditModel.getDraftPrimaryKey();
                }
            }
        } else {
            videoPublishEditModel = null;
        }
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        if (str2 == null) {
            str = "null";
        } else {
            str = str2;
        }
        LIZIZ.LIZJ("setRecoverKey", str);
        if (!TextUtils.isEmpty(str2)) {
            C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
            LJFF(str2);
            o.LJI(videoPublishEditModel);
            if (videoPublishEditModel.mShoutOutsData == null && videoPublishEditModel.ttStoryUploadModel == null) {
                C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
                LJ(str2);
            }
        }
    }

    @Override // X.InterfaceC41365GLh
    public final void LIZ(List<String> primaryKeys) {
        o.LJIIIZ(primaryKeys, "primaryKeys");
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class);
        String json = GsonProtectorUtils.toJson(new Gson(), primaryKeys);
        o.LJIIIIZZ(json, "gson.toJson(primaryKeys)");
        iVideoRecordPreferences.setLastAutoRecoverPaths(json);
    }

    public final void LJIILLIIL(InterfaceC65784Pro<C140295ez> interfaceC65784Pro) {
        if (GA5.LIZ()) {
            C41967GdX c41967GdX = (C41967GdX) this.LIZ.getValue();
            c41967GdX.getClass();
            ((ExecutorService) c41967GdX.LIZIZ.getValue()).execute(new RunnableC41959GdP(interfaceC65784Pro, c41967GdX));
        }
    }

    @Override // X.InterfaceC41365GLh
    public final void LIZLLL(ActivityC45651qj activity, AwemeDraft draft, PublishFailureReason publishFailureReason) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(draft, "draft");
        GTM.LJI(activity, new C41474GPm(draft, publishFailureReason), true);
    }

    public final void LJIIJJI(ActivityC45651qj activity, AwemeDraft awemeDraft, PublishFailureReason publishFailureReason) {
        o.LJIIIZ(activity, "activity");
        GTM.LJI(activity, new C41474GPm(awemeDraft, publishFailureReason), false);
    }
}
