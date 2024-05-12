package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4FD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FD implements C4FT {
    public static Boolean LJLILLLLZI;
    public static final C4FD LJLIL = new C4FD();
    public static final C64962gm LJLJI = C48841JEv.LIZ(C78613UtF.LIZJ);
    public static final java.util.Set<C4FT> LJLJJI = new LinkedHashSet();
    public static final HashSet<String> LJLJJL = new HashSet<>();

    public static void LIZ(Resources resources) {
        File file = new File(C78934UyQ.LJIIJJI(resources));
        if (file.exists() && file.isFile()) {
            C16880lQ.LLLZZIL(file);
        }
    }

    public static List LJI(Resources resources) {
        JSONObject jSONObject;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C78934UyQ.LJIIZILJ(resources.getId(), resources.getType(), resources.getVersion()));
        LIZ.append("/info.json");
        String LIZ2 = C64544PUu.LIZ(new File(X1D.LIZIZ(LIZ)));
        ArrayList arrayList = new ArrayList();
        if (C38354F3m.LJ(LIZ2)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(LIZ2), "stickers");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                if (jSONObject2 != null) {
                    Emoji emoji = new Emoji();
                    emoji.setAnimateType(JSONObjectProtectorUtils.getString(jSONObject2, "animate_type"));
                    emoji.setDisplayName(JSONObjectProtectorUtils.getString(jSONObject2, "display_name"));
                    emoji.setId(JSONObjectProtectorUtils.getLong(jSONObject2, "id"));
                    emoji.setWidth(JSONObjectProtectorUtils.getInt(jSONObject2, "width"));
                    emoji.setHeight(JSONObjectProtectorUtils.getInt(jSONObject2, "height"));
                    String string = JSONObjectProtectorUtils.getString(jSONObject2, "static_url");
                    String string2 = JSONObjectProtectorUtils.getString(jSONObject2, "animate_url");
                    emoji.setStaticUrl(C77357UXp.LJII(emoji.getWidth(), emoji.getHeight(), string));
                    emoji.setStaticType(JSONObjectProtectorUtils.getString(jSONObject2, "static_type"));
                    emoji.setAnimateUrl(C77357UXp.LJII(emoji.getWidth(), emoji.getHeight(), string2));
                    emoji.setVersion(resources.getVersion());
                    emoji.setResourcesId(resources.getId());
                    if (o.LJ(resources.getType(), "STICKER_NAVI")) {
                        emoji.setStickerType(4);
                    }
                    Iterator<String> it = null;
                    try {
                        jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "display_name_lang");
                    } catch (JSONException e) {
                        C34B.LJ("ResourcesManager", e);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        it = jSONObject.keys();
                    }
                    if (it != null) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String key = keys.next();
                            o.LJIIIIZZ(key, "key");
                            String string3 = JSONObjectProtectorUtils.getString(jSONObject, key);
                            o.LJIIIIZZ(string3, "displayNameLangsObj.getString(key)");
                            hashMap.put(key, string3);
                        }
                        emoji.setDisplayNameLangs(hashMap);
                    }
                    arrayList.add(emoji);
                }
            }
        } catch (JSONException e2) {
            C34B.LJ("ResourcesManager", e2);
        }
        return arrayList;
    }

    public static void LJII(boolean z) {
        C34B.LIZIZ("ResourcesManager", "loadAndFetchResources");
        XKX.LIZLLL(LJLJI, null, null, new C4FE("STICKER", "STICKER_NAVI", z, null), 3);
    }

    @Override // X.C4FT
    public final void LIZJ(C105734Cz emojiData) {
        o.LJIIIZ(emojiData, "emojiData");
        Iterator<C4FT> it = LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(emojiData);
        }
    }

    public final boolean LJ(final Resources resources) {
        File parentFile;
        o.LJIIIZ(resources, "resources");
        ServiceManager serviceManager = ServiceManager.get();
        o.LJIIIIZZ(serviceManager, "get()");
        IIMService iIMService = (IIMService) serviceManager.getService(IIMService.class);
        iIMService.getPerformanceService().LIZ();
        final C98313tT LIZ = C98333tV.LIZ();
        final C84683Ua LIZJ = iIMService.getPerformanceService().LIZJ();
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            HashSet<String> hashSet = LJLJJL;
            if (hashSet.contains(resources.getResourceUrl())) {
                return false;
            }
            File file = new File(C78934UyQ.LJIIJJI(resources));
            File parentFile2 = file.getParentFile();
            if (parentFile2 != null && !parentFile2.exists() && (parentFile = file.getParentFile()) != null && !parentFile.mkdirs()) {
                return false;
            }
            hashSet.add(resources.getResourceUrl());
            AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.4FJ
                public final /* synthetic */ boolean LJLJJI = false;

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onCanceled(DownloadInfo entity) {
                    o.LJIIIZ(entity, "entity");
                    C3VM.this.LIZ(new C91993jH(String.valueOf(resources.getId())), new C4G6(false, resources.getId(), LIZ.LIZ()));
                    C4FD.LJLJJL.remove(resources.getResourceUrl());
                    C4FD.LIZ(resources);
                    C4FD.LJIIIIZZ(resources, false);
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo entity) {
                    String[] list;
                    o.LJIIIZ(entity, "entity");
                    C3VM.this.LIZ(new C91993jH(String.valueOf(resources.getId())), new C4G6(true, resources.getId(), LIZ.LIZ()));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("download success url:");
                    LIZ2.append(resources.getResourceUrl());
                    C34B.LIZIZ("ResourcesManager", X1D.LIZIZ(LIZ2));
                    C4FD.LJLJJL.remove(resources.getResourceUrl());
                    C4FD.LIZ(resources);
                    Resources resources2 = resources;
                    boolean z = false;
                    if (resources2 != null) {
                        File file2 = new File(C78934UyQ.LJIIZILJ(resources2.getId(), resources2.getType(), resources2.getVersion()));
                        if (file2.exists() && file2.isDirectory() && (list = file2.list()) != null && list.length != 0) {
                            z = true;
                        }
                    }
                    C4FD.LJIIIIZZ(resources, z);
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo entity, BaseException e) {
                    o.LJIIIZ(entity, "entity");
                    o.LJIIIZ(e, "e");
                    C3VM.this.LIZ(new C91993jH(String.valueOf(resources.getId())), new C4G6(false, resources.getId(), LIZ.LIZ()));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("download error:");
                    LIZ2.append(e.getMessage());
                    LIZ2.append(", url:");
                    LIZ2.append(resources.getResourceUrl());
                    C34B.LIZIZ("ResourcesManager", X1D.LIZIZ(LIZ2));
                    C4FD.LJLJJL.remove(resources.getResourceUrl());
                    if (this.LJLJJI) {
                        C4FD.LJLIL.LJ(resources);
                    } else {
                        C4FD.LIZ(resources);
                        C4FD.LJIIIIZZ(resources, false);
                    }
                }
            };
            X5Z x5z = new X5Z() { // from class: X.3Ud
                @Override // X.X5Z
                public final void LIZIZ() {
                    InterfaceC84703Uc.this.stop();
                }

                @Override // X.X5Z
                public final void LIZJ() {
                    InterfaceC84703Uc.this.start();
                }

                @Override // X.X5Z
                public final void LIZ(String str) {
                    InterfaceC84703Uc.this.stop();
                }
            };
            LIZJ.LIZIZ(new C91993jH(String.valueOf(resources.getId())), true);
            X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(resources.getResourceUrl());
            with.LJ = C78934UyQ.LJIILLIIL(resources.getType());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C78934UyQ.LJIJ(resources.getId(), resources.getVersion()));
            LIZ2.append(".zip");
            with.LIZJ = X1D.LIZIZ(LIZ2);
            with.LJIIL = absDownloadListener;
            with.LJIIJ = "emoji_resources_manager";
            String type = resources.getType();
            long id = resources.getId();
            String version = resources.getVersion();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(C78934UyQ.LJIILLIIL(type));
            LIZ3.append(C78934UyQ.LJIJ(id, version));
            String LIZIZ = X1D.LIZIZ(LIZ3);
            with.LJIILLIIL = true;
            with.LJIJ = LIZIZ;
            with.LJIJI = x5z;
            with.LIZLLL(N33.ZIP);
            return true;
        }
        XKX.LIZLLL(LJLJI, null, null, new C4FP(resources, null), 3);
        return false;
    }

    public static void LIZLLL(String str, List list) {
        File[] listFiles;
        String replace;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Resources resources = (Resources) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(resources.getId());
            LIZ.append("_");
            if (resources.getVersion() == null) {
                replace = null;
            } else {
                replace = resources.getVersion().replace(".", "_");
            }
            LIZ.append(replace);
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIIZZ(LIZIZ, "getResourcesPathName(resources)");
            hashMap.put(LIZIZ, Boolean.TRUE);
        }
        File file = new File(C78934UyQ.LJIILLIIL(str));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        if (listFiles.length == 0) {
            return;
        }
        for (File file2 : listFiles) {
            if (hashMap.get(file2.getName()) == null) {
                try {
                    C36980EfI.LIZ(file2.getAbsolutePath());
                    C16880lQ.LLLZZIL(new File(file2.getAbsolutePath()));
                } catch (Exception e) {
                    C34B.LJ("ResourcesManager", e);
                }
            }
        }
    }

    public static void LJIIIIZZ(Resources resources, boolean z) {
        List list;
        o.LJIIIZ(resources, "resources");
        if (z) {
            list = LJI(resources);
        } else {
            list = null;
        }
        XKX.LIZLLL(LJLJI, C36636EZk.LIZ, null, new C4FN(resources, list, null), 2);
    }

    @Override // X.C4FT
    public final void LIZIZ(Resources resources, List<? extends Emoji> list) {
        o.LJIIIZ(resources, "resources");
        Iterator<C4FT> it = LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(resources, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r7, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C4FQ
            if (r0 == 0) goto L20
            r5 = r8
            X.4FQ r5 = (X.C4FQ) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            java.lang.String r2 = "ResourcesManager"
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.4FQ r5 = new X.4FQ
            r5.<init>(r6, r8)
            goto L12
        L26:
            X.C141335gf.LIZJ(r4)     // Catch: java.util.concurrent.ExecutionException -> L41 java.lang.InterruptedException -> L46
            goto L40
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r4)
            com.ss.android.ugc.aweme.emoji.utils.EmojiApi r0 = X.C74802we.LIZ     // Catch: java.util.concurrent.ExecutionException -> L41 java.lang.InterruptedException -> L46
            r5.LJLJI = r1     // Catch: java.util.concurrent.ExecutionException -> L41 java.lang.InterruptedException -> L46
            java.lang.Object r4 = r0.getResources(r7, r5)     // Catch: java.util.concurrent.ExecutionException -> L41 java.lang.InterruptedException -> L46
            if (r4 != r3) goto L40
            return r3
        L40:
            return r4
        L41:
            r0 = move-exception
            X.C34B.LJ(r2, r0)
            goto L4a
        L46:
            r0 = move-exception
            X.C34B.LJ(r2, r0)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4FD.LJFF(java.lang.String, X.2kd):java.lang.Object");
    }
}
