package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Iwb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC48245Iwb<V> implements Callable {
    public final /* synthetic */ String LJLIL;

    public CallableC48245Iwb(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String queryParameter;
        boolean LJFF;
        int i;
        String LIZIZ;
        FileOutputStream fileOutputStream;
        String str = this.LJLIL;
        android.net.Uri parse = UriProtector.parse(str);
        FileOutputStream fileOutputStream2 = null;
        if (s.LJJJLZIJ(str, "aweme/detail/", false)) {
            queryParameter = parse.getLastPathSegment();
        } else {
            if (s.LJJJLZIJ(str, "aweme/push_detail", false)) {
                queryParameter = UriProtector.getQueryParameter(parse, "gids");
            }
            return C76800UCe.LIZ;
        }
        if (queryParameter != null) {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = C48247Iwd.LIZJ;
            if (!copyOnWriteArrayList.contains(queryParameter) && C48247Iwd.LIZ(queryParameter) == null) {
                copyOnWriteArrayList.add(queryParameter);
                Aweme LIZJ = DetailFeedServiceImpl.LJIIJ().LIZJ(queryParameter);
                String aid = LIZJ.getAid();
                if (aid != null && (LIZIZ = C48247Iwd.LIZIZ()) != null) {
                    File file = new File(LIZIZ);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LIZIZ);
                    File file2 = new File(JBR.LJFF(LIZ, File.separator, aid, LIZ));
                    if (!file2.exists()) {
                        try {
                            file2.createNewFile();
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    String value = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LIZJ);
                    try {
                        if (!TextUtils.isEmpty(value)) {
                            try {
                                fileOutputStream = new FileOutputStream(file2);
                            } catch (Exception unused) {
                            }
                            try {
                                o.LJIIIIZZ(value, "value");
                                byte[] bytes = value.getBytes(PVC.LIZ);
                                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                                fileOutputStream.write(bytes);
                                C37247Ejb.LIZ.getClass();
                                C36871EdX.LIZ(fileOutputStream);
                            } catch (Exception unused2) {
                                fileOutputStream2 = fileOutputStream;
                                C48247Iwd.LIZJ.remove(aid);
                                C16880lQ.LLLZZIL(file2);
                                C37247Ejb.LIZ.getClass();
                                C36871EdX.LIZ(fileOutputStream2);
                                LJFF = C48203Ivv.LJFF(EF7.LIZIZ());
                                Keva repo = Keva.getRepo("push_video_preload");
                                o.LJIIIIZZ(repo, "getRepo(\"push_video_preload\")");
                                i = repo.getInt("preload_video_count", 0);
                                if (LJFF) {
                                    Keva repo2 = Keva.getRepo("push_video_preload");
                                    o.LJIIIIZZ(repo2, "getRepo(\"push_video_preload\")");
                                    repo2.storeInt("preload_video_count", i + 1);
                                    C46728IVo.LJIIL(819200, LIZJ);
                                }
                                return C76800UCe.LIZ;
                            } catch (Throwable th) {
                                th = th;
                                C37247Ejb.LIZ.getClass();
                                C36871EdX.LIZ(fileOutputStream);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                    }
                }
                LJFF = C48203Ivv.LJFF(EF7.LIZIZ());
                Keva repo3 = Keva.getRepo("push_video_preload");
                o.LJIIIIZZ(repo3, "getRepo(\"push_video_preload\")");
                i = repo3.getInt("preload_video_count", 0);
                if (LJFF && i <= 3) {
                    Keva repo22 = Keva.getRepo("push_video_preload");
                    o.LJIIIIZZ(repo22, "getRepo(\"push_video_preload\")");
                    repo22.storeInt("preload_video_count", i + 1);
                    C46728IVo.LJIIL(819200, LIZJ);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
