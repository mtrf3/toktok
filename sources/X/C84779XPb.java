package X;

import Y.ARunnableS9S1200000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import defpackage.e1;
import java.io.File;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.XPb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84779XPb implements InterfaceC72081SQr<String> {
    public static final int LJFF = C00F.LIZ(31744, 52428800, "disk_cache_size", true);
    public final XQ6 LIZ;
    public final XQ6 LIZIZ;
    public final C84382X9u LIZJ;
    public final java.util.Map<String, ? extends Object> LIZLLL;
    public final ExecutorService LJ;

    @Override // X.InterfaceC72081SQr
    public final Collection<Aweme> values() {
        return this.LIZ.LJLIL.values();
    }

    public C84779XPb() {
        boolean z;
        C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
        c38027EwB.LIZIZ = "AwemeLruMemoryAndDiskCache";
        this.LJ = C37191Eih.LIZ(c38027EwB);
        XQ5 xq5 = new XQ5();
        XQA xqa = XQ9.LJLILLLLZI;
        XQ9 xq9 = xq5.LJII;
        if (xq9 == null) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJIILJJIL("Value strength was already set to %s", z, xq9);
        xq5.LJII = xqa;
        xq5.LIZIZ(C00F.LIZ(31744, 200, "weak_memory_cache_size", true));
        xq5.LIZJ(new C84782XPe(this));
        this.LIZIZ = xq5.LIZ();
        XQ5 xq52 = new XQ5();
        xq52.LIZIZ(C00F.LIZ(31744, 100, "memory_cache_size", true));
        xq52.LIZJ(new C84780XPc(this));
        this.LIZ = xq52.LIZ();
        try {
            File LIZJ = LIZJ(EF7.LIZIZ());
            if (LIZJ.exists()) {
                C37246Eja c37246Eja = C37247Ejb.LIZIZ;
                String absolutePath = LIZJ.getAbsolutePath();
                o.LJIIIIZZ(absolutePath, "awemeCache.absolutePath");
                c37246Eja.getClass();
                C36871EdX.LJ(absolutePath);
            }
            C84382X9u LJI = C84382X9u.LJI(LIZJ, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppVersionCode(), LJFF);
            this.LIZJ = LJI;
            java.util.Map<String, ? extends Object> map = (java.util.Map) C36538EVq.LIZJ(LJI, "lruEntries");
            this.LIZLLL = map;
            if (map != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("entries: ");
                LIZ.append(Integer.valueOf(map.size()));
                X1D.LIZIZ(LIZ);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC72081SQr
    public final void clear() {
        try {
            File LIZJ = LIZJ(EF7.LIZIZ());
            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
            String absolutePath = LIZJ.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "awemeCache.absolutePath");
            c37246Eja.getClass();
            C36871EdX.LJ(absolutePath);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final boolean LIZIZ(String str) {
        Object obj;
        C84382X9u c84382X9u = this.LIZJ;
        if (c84382X9u == null || c84382X9u.LJLJLJ == null) {
            return false;
        }
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isContainsKeyWithLruEntries()) {
            java.util.Map<String, ? extends Object> map = this.LIZLLL;
            if (map == null || (obj = map.get(str)) == null) {
                return false;
            }
            Object LIZJ = C36538EVq.LIZJ(obj, "readable");
            o.LJIIIIZZ(LIZJ, "{\n            if (diskLr…ry, \"readable\")\n        }");
            return ((Boolean) LIZJ).booleanValue();
        }
        try {
            C84382X9u c84382X9u2 = this.LIZJ;
            if (c84382X9u2 == null) {
                return false;
            }
            C39717FiL LJ = c84382X9u2.LJ(str);
            if (LJ == null) {
                return false;
            }
            LJ.close();
            return true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public final File LIZJ(Context context) {
        String path = C16880lQ.LLIIIL(context).getPath();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(path);
        return new File(JBR.LJFF(LIZ, File.separator, "awemeCache", LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (LIZIZ(r2) != false) goto L9;
     */
    @Override // X.InterfaceC72081SQr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsKey(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r2 = (java.lang.String) r2
            X.XQ6 r0 = r1.LIZ     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = r0.LIZIZ(r2)     // Catch: java.lang.Exception -> L1a
            if (r0 != 0) goto L18
            X.XQ6 r0 = r1.LIZIZ     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = r0.LIZIZ(r2)     // Catch: java.lang.Exception -> L1a
            if (r0 != 0) goto L18
            boolean r0 = r1.LIZIZ(r2)     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1e
        L18:
            r0 = 1
            goto L1f
        L1a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L1e:
            r0 = 0
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84779XPb.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bb: MOVE (r2 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:16777403), block:B:44:0x00bb */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC72081SQr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.Aweme get(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r7 = (java.lang.String) r7
            X.XQ6 r0 = r6.LIZ
            java.lang.Object r4 = r0.LIZIZ(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            if (r4 != 0) goto L27
            X.XQ6 r0 = r6.LIZIZ
            java.lang.Object r4 = r0.LIZIZ(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            if (r4 == 0) goto L28
            X.XQ6 r0 = r6.LIZ
            X.XQ3<K, V> r0 = r0.LJLIL
            r0.put(r7, r4)
            X.XQ6 r0 = r6.LIZIZ
            r0.getClass()
            X.XQ3<K, V> r0 = r0.LJLIL
            r0.remove(r7)
        L27:
            return r4
        L28:
            r5 = 0
            if (r4 != 0) goto L27
            X.X9u r0 = r6.LIZJ
            r2 = 0
            if (r0 != 0) goto L4a
        L30:
            r4 = r2
        L31:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "get Aweme from diskCache， awemeId = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            r1 = 4
            java.lang.String r0 = "AwemeLruCache"
            X.C36922EeM.LIZLLL(r1, r0, r2)
            if (r4 != 0) goto L27
            goto L7d
        L4a:
            X.FiL r0 = r0.LJ(r7)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> Lb8
            if (r0 != 0) goto L51
            goto L30
        L51:
            java.io.InputStream[] r0 = r0.LJLIL     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> Lb8
            r0 = r0[r5]     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> Lb8
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> Lb8
            r1.<init>(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> Lb8
            java.lang.Object r4 = r1.readObject()     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> Lba
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme"
            kotlin.jvm.internal.o.LJII(r4, r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> Lba
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> Lba
            X.C38891fp.LJIIJJI(r1)
            if (r4 == 0) goto L31
            X.XQ6 r0 = r6.LIZ
            X.XQ3<K, V> r0 = r0.LJLIL
            r0.put(r7, r4)
            goto L31
        L72:
            r0 = move-exception
            goto L76
        L74:
            r0 = move-exception
            r1 = r2
        L76:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> Lba
            X.C38891fp.LJIIJJI(r1)
            goto L30
        L7d:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb2
            r3.<init>()     // Catch: java.lang.Exception -> Lb2
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Exception -> Lb2
            r0.<init>()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = android.util.Log.getStackTraceString(r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = "getStackTraceString(Throwable())"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> Lb2
            int r1 = r2.length()     // Catch: java.lang.Exception -> Lb2
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r0) goto La1
            java.lang.String r2 = r2.substring(r5, r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> Lb2
        La1:
            java.lang.String r0 = "error_stack"
            r3.put(r0, r2)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = "aid"
            r3.put(r0, r7)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = "aweme_manager_get_aweme_is_null"
            X.FUA.LIZJ(r0, r3)     // Catch: java.lang.Exception -> Lb2
            goto L27
        Lb2:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L27
        Lb8:
            r0 = move-exception
            goto Lbc
        Lba:
            r0 = move-exception
            r2 = r1
        Lbc:
            X.C38891fp.LJIIJJI(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84779XPb.get(java.lang.Object):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    @Override // X.InterfaceC72081SQr
    public final void LIZ(Aweme aweme, Object obj) {
        this.LIZ.LJLIL.put(obj, aweme);
    }

    public final void LIZLLL(Aweme aweme, String str) {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread() || e1.LIZ(31744, "enable_async_put_aweme_disk_cache", true, true)) {
            this.LJ.submit(new ARunnableS9S1200000_10(aweme, this, str, 2));
        } else {
            LJ(aweme, str);
        }
    }

    public final void LJ(Aweme aweme, String str) {
        ObjectOutputStream objectOutputStream;
        C84384X9w LIZLLL;
        C79564VKm c79564VKm;
        C84382X9u c84382X9u = this.LIZJ;
        if (c84382X9u == null) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                LIZLLL = c84382X9u.LIZLLL(str);
                if (LIZLLL != null) {
                    c79564VKm = LIZLLL.LIZJ();
                } else {
                    c79564VKm = null;
                }
                objectOutputStream = new ObjectOutputStream(c79564VKm);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            objectOutputStream.writeObject(aweme);
            if (LIZLLL != null) {
                LIZLLL.LIZIZ();
            }
            C38891fp.LJIIJJI(objectOutputStream);
        } catch (Exception e2) {
            e = e2;
            objectOutputStream2 = objectOutputStream;
            C16880lQ.LLLLIIL(e);
            C38891fp.LJIIJJI(objectOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            C38891fp.LJIIJJI(objectOutputStream);
            throw th;
        }
    }
}
