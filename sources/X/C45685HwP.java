package X;

import Y.AfS32S0201000_11;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.HwP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45685HwP {
    public static C45685HwP LJFF;
    public final Context LIZ;
    public final HashMap<String, MediaModel> LIZIZ = new HashMap<>();
    public final HashMap<Integer, List<MediaModel>> LIZJ = new HashMap<>();
    public final List<MediaModel> LIZLLL = new ArrayList();
    public final java.util.Set<InterfaceC45690HwU> LJ = new HashSet();

    public final void LIZ() {
        ((ArrayList) this.LIZLLL).clear();
    }

    public C45685HwP(Context context) {
        this.LIZ = context;
    }

    public static synchronized void LIZIZ(Context context) {
        synchronized (C45685HwP.class) {
            if (LJFF == null) {
                LJFF = new C45685HwP(context);
            }
        }
    }

    public final List<MediaModel> LJ(int i, int i2) {
        List<MediaModel> LJI;
        Context context = this.LIZ;
        o.LJIIIZ(context, "context");
        String[] strArr = null;
        C45687HwR LJ = C45697Hwb.LJ(null, i2, i);
        if (LJ.LIZLLL.size() > 0) {
            Object[] array = LJ.LIZLLL.toArray(new String[0]);
            if (array != null) {
                strArr = (String[]) array;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        if (i == -1) {
            if (C44694HgQ.LJJ()) {
                LJI = C45697Hwb.LJFF(context, LJ.LIZJ, strArr, LJ.LIZ, -1, -1);
            } else {
                LJI = C45697Hwb.LJI(context, LJ.LIZJ, LJ.LIZ, strArr);
            }
        } else if (C44694HgQ.LJJ()) {
            LJI = C45697Hwb.LJFF(context, LJ.LIZJ, strArr, LJ.LIZ, i, i2 * i);
        } else {
            String str = LJ.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJ.LIZ);
            LIZ.append(LJ.LIZIZ);
            LJI = C45697Hwb.LJI(context, str, X1D.LIZIZ(LIZ), strArr);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("FileAdapterAndroidR video media list:");
        LIZ2.append(LJI.size());
        LIZ2.append(",");
        LIZ2.append(C44694HgQ.LJJ());
        LIZ2.append(", trace:");
        LIZ2.append(android.util.Log.getStackTraceString(new Throwable()));
        String LIZIZ = X1D.LIZIZ(LIZ2);
        InterfaceC44698HgU interfaceC44698HgU = C44694HgQ.LIZJ;
        if (interfaceC44698HgU != null) {
            interfaceC44698HgU.LIZIZ(-2, LIZIZ);
        }
        if (HOF.LIZ()) {
            return LJI;
        }
        System.currentTimeMillis();
        for (MediaModel mediaModel : LJI) {
            MediaMetadataRetriever LJIILLIIL = C44694HgQ.LJIILLIIL(mediaModel.fileLocalUriPath);
            try {
                try {
                    int parseInt = Integer.parseInt(LJIILLIIL.extractMetadata(24));
                    if (parseInt == 90 || parseInt == 270) {
                        int i3 = mediaModel.width;
                        mediaModel.width = mediaModel.height;
                        mediaModel.height = i3;
                    }
                    try {
                        LJIILLIIL.release();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Exception unused) {
                LJIILLIIL.release();
            } catch (Throwable th) {
                try {
                    LJIILLIIL.release();
                    throw th;
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        return LJI;
    }

    public final void LIZJ(final int i, final int i2, final int i3, final InterfaceC44146HUg interfaceC44146HUg) {
        C10K.LIZJ(new Callable() { // from class: X.HwQ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List LIZJ;
                C45685HwP c45685HwP = C45685HwP.this;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                c45685HwP.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start load media ");
                LIZ.append(currentTimeMillis);
                H78.LIZIZ("MediaManager", X1D.LIZIZ(LIZ));
                ArrayList arrayList = new ArrayList();
                String[] strArr = null;
                boolean z = true;
                if (1 == i4) {
                    arrayList.addAll(C45697Hwb.LIZIZ(c45685HwP.LIZ, true, i5, i6, null));
                } else if (4 == i4) {
                    arrayList.addAll(c45685HwP.LJ(i5, i6));
                } else if (3 == i4) {
                    arrayList.addAll(C45697Hwb.LIZIZ(c45685HwP.LIZ, false, i5, i6, null));
                } else if (2 == i4) {
                    Context context = c45685HwP.LIZ;
                    o.LJIIIZ(context, "context");
                    new ArrayList();
                    C45687HwR LJ = C45697Hwb.LJ(null, i6, i5);
                    String str = LJ.LIZJ;
                    if (str != null && str.length() != 0) {
                        z = false;
                    }
                    String str2 = "mime_type like ?";
                    if (!z) {
                        String str3 = LJ.LIZJ;
                        if (str3 != null) {
                            str2 = C78866UxK.LJIILJJIL(str3, "mime_type like ?");
                        } else {
                            str2 = null;
                        }
                    }
                    LJ.LIZJ = str2;
                    LJ.LIZLLL.add("%gif%");
                    if (LJ.LIZLLL.size() > 0) {
                        Object[] array = LJ.LIZLLL.toArray(new String[0]);
                        if (array != null) {
                            strArr = (String[]) array;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    if (i5 == -1) {
                        if (C44694HgQ.LJJ()) {
                            LIZJ = C45697Hwb.LIZLLL(context, LJ.LIZJ, strArr, LJ.LIZ, -1, -1);
                        } else {
                            LIZJ = C45697Hwb.LIZJ(context, LJ.LIZJ, LJ.LIZ, strArr);
                        }
                    } else if (C44694HgQ.LJJ()) {
                        LIZJ = C45697Hwb.LIZLLL(context, LJ.LIZJ, strArr, LJ.LIZ, i5, i6 * i5);
                    } else {
                        LIZJ = C45697Hwb.LIZJ(context, LJ.LIZJ, LJ.LIZ + LJ.LIZIZ, strArr);
                    }
                    arrayList.addAll(LIZJ);
                } else if (i4 == 0) {
                    arrayList.addAll(c45685HwP.LJ(i5, i6));
                    arrayList.addAll(C45697Hwb.LIZIZ(c45685HwP.LIZ, true, i5, i6, null));
                    Collections.sort(arrayList);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("end load media ");
                LIZ2.append(System.currentTimeMillis());
                H78.LIZIZ("MediaManager", X1D.LIZIZ(LIZ2));
                return arrayList;
            }
        }).LJ(new C10I() { // from class: X.HwH
            /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
            
                if (r5 != null) goto L45;
             */
            @Override // X.C10I
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object then(X.C10K r11) {
                /*
                    r10 = this;
                    X.HwP r4 = X.C45685HwP.this
                    int r6 = r2
                    X.HUg r5 = r3
                    int r3 = r4
                    r4.getClass()
                    java.lang.String r1 = "MediaManager"
                    java.lang.String r0 = "load media continue"
                    X.H78.LIZIZ(r1, r0)
                    boolean r0 = r11.LJIIL()
                    if (r0 != 0) goto L1e
                    boolean r0 = r11.LJIILJJIL()
                    if (r0 == 0) goto Ld3
                L1e:
                    r9 = 1
                L1f:
                    r8 = 0
                    if (r9 == 0) goto Lcb
                    r2 = r8
                L23:
                    r0 = -1
                    if (r6 != r0) goto Ld6
                    if (r5 != 0) goto Ld8
                    if (r9 != 0) goto L32
                    java.lang.Object r7 = r11.LJIIJJI()
                    java.util.Collection r7 = (java.util.Collection) r7
                    if (r7 != 0) goto L4c
                L32:
                    java.util.Set<X.HwU> r0 = r4.LJ
                    java.util.HashSet r0 = (java.util.HashSet) r0
                    java.util.Iterator r3 = r0.iterator()
                L3a:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto Ldf
                    java.lang.Object r1 = r3.next()
                    X.HwU r1 = (X.InterfaceC45690HwU) r1
                    r0 = r9 ^ 1
                    r1.LIZ(r0, r2)
                    goto L3a
                L4c:
                    java.util.HashMap<java.lang.Integer, java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>> r1 = r4.LIZJ
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                    java.lang.Object r6 = r1.get(r0)
                    java.util.List r6 = (java.util.List) r6
                    if (r6 != 0) goto L68
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    java.util.HashMap<java.lang.Integer, java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>> r1 = r4.LIZJ
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                    r1.put(r0, r6)
                L68:
                    java.util.Iterator r3 = r6.iterator()
                L6c:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L80
                    java.lang.Object r0 = r3.next()
                    com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
                    java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r1 = r4.LIZIZ
                    java.lang.String r0 = r0.fileLocalUriPath
                    r1.remove(r0)
                    goto L6c
                L80:
                    r6.clear()
                    java.util.Iterator r5 = r7.iterator()
                L87:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto La6
                    java.lang.Object r3 = r5.next()
                    com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r3 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r3
                    if (r3 != 0) goto L96
                    goto L87
                L96:
                    java.lang.String r1 = r3.fileLocalUriPath
                    java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r4.LIZIZ
                    boolean r0 = r0.containsKey(r1)
                    if (r0 != 0) goto L87
                    java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r4.LIZIZ
                    r0.put(r1, r3)
                    goto L87
                La6:
                    r6.addAll(r7)
                    java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r4.LIZLLL
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    java.util.Iterator r3 = r0.iterator()
                Lb1:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L32
                    java.lang.Object r0 = r3.next()
                    com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
                    java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r1 = r4.LIZIZ
                    java.lang.String r0 = r0.fileLocalUriPath
                    boolean r0 = r1.containsKey(r0)
                    if (r0 != 0) goto Lb1
                    r3.remove()
                    goto Lb1
                Lcb:
                    java.lang.Object r2 = r11.LJIIJJI()
                    java.util.List r2 = (java.util.List) r2
                    goto L23
                Ld3:
                    r9 = 0
                    goto L1f
                Ld6:
                    if (r5 == 0) goto Ldf
                Ld8:
                    r1 = r9 ^ 1
                    X.HwY r0 = X.C45694HwY.LIZ
                    r5.LIZ(r1, r3, r2, r0)
                Ldf:
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C45677HwH.then(X.10K):java.lang.Object");
            }
        }, C10K.LJIIIIZZ, null);
    }

    public static void LIZLLL(final int i, int i2, int i3, final C45675HwF c45675HwF, final AbstractC45692HwW abstractC45692HwW) {
        C45688HwS.LIZ().LLLLZ(new C45744HxM(i, i2, i3), abstractC45692HwW).LJJJLIIL(new AfS32S0201000_11(1, c45675HwF, abstractC45692HwW, 0), new InterfaceC64592gB() { // from class: X.HwO
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                c45675HwF.LIZ(false, i, null, abstractC45692HwW);
            }
        });
    }
}
