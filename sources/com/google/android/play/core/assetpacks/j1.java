package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C16880lQ;
import X.C40561Fvx;
import X.C40579FwF;
import X.C40614Fwo;
import X.C40631Fx5;
import X.C64075PCt;
import X.InterfaceC38408F5o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class j1 implements s2 {
    public static final C13T LJI = new C13T("FakeAssetPackService");
    public final String LIZ;
    public final t LIZIZ;
    public final Context LIZJ;
    public final v1 LIZLLL;
    public final InterfaceC38408F5o<Executor> LJ;
    public final Handler LJFF = new Handler(C16880lQ.LLJJJJ());

    static {
        new AtomicInteger(1);
    }

    public j1(File file, t tVar, Context context, v1 v1Var, InterfaceC38408F5o interfaceC38408F5o) {
        this.LIZ = file.getAbsolutePath();
        this.LIZIZ = tVar;
        this.LIZJ = context;
        this.LIZLLL = v1Var;
        this.LJ = interfaceC38408F5o;
    }

    public final File[] LJII(final String str) {
        File file = new File(this.LIZ);
        if (!file.isDirectory()) {
            throw new C40614Fwo(C16880lQ.LLLZ("Local testing directory '%s' not found.", new Object[]{file}));
        }
        File[] listFiles = file.listFiles(new FilenameFilter(str) { // from class: com.google.android.play.core.assetpacks.h1
            public final String LIZ;

            {
                this.LIZ = str;
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(this.LIZ).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (listFiles == null) {
            throw new C40614Fwo(C16880lQ.LLLZ("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        int length = listFiles.length;
        if (length == 0) {
            throw new C40614Fwo(C16880lQ.LLLZ("No APKs available for pack '%s'.", new Object[]{str}));
        }
        int i = 0;
        while (!C40631Fx5.LIZIZ(listFiles[i]).equals(str)) {
            i++;
            if (i >= length) {
                throw new C40614Fwo(C16880lQ.LLLZ("No master slice available for pack '%s'.", new Object[]{str}));
            }
        }
        return listFiles;
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LIZ() {
        LJI.LIZJ("keepAlive", 4, new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LIZIZ(int i) {
        LJI.LIZJ("notifySessionFailed", 4, new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LJFF(List<String> list) {
        LJI.LIZJ("cancelDownload(%s)", 4, new Object[]{list});
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ResultT, java.util.ArrayList] */
    @Override // com.google.android.play.core.assetpacks.s2
    public final C40561Fvx LJI(Map<String, Long> map) {
        LJI.LIZJ("syncPacks()", 4, new Object[0]);
        ?? arrayList = new ArrayList();
        C40561Fvx c40561Fvx = new C40561Fvx();
        synchronized (c40561Fvx.LIZ) {
            if (!c40561Fvx.LIZJ) {
                c40561Fvx.LIZJ = true;
                c40561Fvx.LIZLLL = arrayList;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        c40561Fvx.LIZIZ.LIZ(c40561Fvx);
        return c40561Fvx;
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LIZJ(final int i, final String str) {
        LJI.LIZJ("notifyModuleCompleted", 4, new Object[0]);
        this.LJ.a().execute(new Runnable(this, i, str) { // from class: com.google.android.play.core.assetpacks.g1
            public final j1 LJLIL;
            public final int LJLILLLLZI;
            public final String LJLJI;

            {
                this.LJLIL = this;
                this.LJLILLLLZI = i;
                this.LJLJI = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    j1 j1Var = this.LJLIL;
                    int i2 = this.LJLILLLLZI;
                    String str2 = this.LJLJI;
                    j1Var.getClass();
                    try {
                        j1Var.LJIIIIZZ(i2, str2);
                    } catch (C40614Fwo e) {
                        j1.LJI.LIZJ("notifyModuleCompleted failed", 5, new Object[]{e});
                    }
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public final void LJIIIIZZ(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.LIZLLL.LIZ());
        bundle.putInt("session_id", i);
        File[] LJII = LJII(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : LJII) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(null);
            String LIZIZ = C40631Fx5.LIZIZ(file);
            bundle.putParcelableArrayList(C64075PCt.LIZIZ("chunk_intents", str, LIZIZ), arrayList2);
            try {
                bundle.putString(C64075PCt.LIZIZ("uncompressed_hash_sha256", str, LIZIZ), l1.LIZ(Arrays.asList(file)));
                bundle.putLong(C64075PCt.LIZIZ("uncompressed_size", str, LIZIZ), file.length());
                arrayList.add(LIZIZ);
            } catch (IOException e) {
                throw new C40614Fwo(C16880lQ.LLLZ("Could not digest file: %s.", new Object[]{file}), e);
            } catch (NoSuchAlgorithmException e2) {
                throw new C40614Fwo("SHA256 algorithm not supported.", e2);
            }
        }
        bundle.putStringArrayList(C64075PCt.LIZ("slice_ids", str), arrayList);
        bundle.putLong(C64075PCt.LIZ("pack_version", str), this.LIZLLL.LIZ());
        bundle.putInt(C64075PCt.LIZ("status", str), 4);
        bundle.putInt(C64075PCt.LIZ("error_code", str), 0);
        bundle.putLong(C64075PCt.LIZ("bytes_downloaded", str), j);
        bundle.putLong(C64075PCt.LIZ("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", j);
        bundle.putLong("total_bytes_to_download", j);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.LJFF.post(new Runnable(this, putExtra) { // from class: com.google.android.play.core.assetpacks.i1
            public final j1 LJLIL;
            public final Intent LJLILLLLZI;

            {
                this.LJLIL = this;
                this.LJLILLLLZI = putExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    j1 j1Var = this.LJLIL;
                    j1Var.LIZIZ.LIZ(j1Var.LIZJ, this.LJLILLLLZI);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LIZLLL(int i, int i2, String str, String str2) {
        LJI.LIZJ("notifyChunkTransferred", 4, new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final C40561Fvx LJ(int i, int i2, String str, String str2) {
        int i3;
        LJI.LIZJ("getChunkFileDescriptor(session=%d, %s, %s, %d)", 4, new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)});
        C40579FwF c40579FwF = new C40579FwF(1);
        try {
        } catch (C40614Fwo e) {
            LJI.LIZJ("getChunkFileDescriptor failed", 5, new Object[]{e});
            c40579FwF.LIZ(e);
        } catch (FileNotFoundException e2) {
            LJI.LIZJ("getChunkFileDescriptor failed", 5, new Object[]{e2});
            C40614Fwo c40614Fwo = new C40614Fwo("Asset Slice file not found.", e2);
            C40561Fvx c40561Fvx = (C40561Fvx) c40579FwF.LIZ;
            synchronized (c40561Fvx.LIZ) {
                if (!c40561Fvx.LIZJ) {
                    c40561Fvx.LIZJ = true;
                    c40561Fvx.LJ = c40614Fwo;
                    c40561Fvx.LIZIZ.LIZ(c40561Fvx);
                } else {
                    throw new IllegalStateException("Task is already complete");
                }
            }
        }
        for (File file : LJII(str)) {
            if (C40631Fx5.LIZIZ(file).equals(str2)) {
                ((C40561Fvx) c40579FwF.LIZ).LIZ(ParcelFileDescriptor.open(file, 268435456));
                return (C40561Fvx) c40579FwF.LIZ;
            }
        }
        throw new C40614Fwo(C16880lQ.LLLZ("Local testing slice for '%s' not found.", new Object[]{str2}));
    }
}
