package com.ss.android.ugc.aweme.creative.file;

import X.C16880lQ;
import X.C221108m2;
import X.C34284Dcu;
import X.C43073GvN;
import X.C43075GvP;
import X.C5H3;
import X.C62850Ola;
import X.C78966Uyw;
import X.EnumC43649HBd;
import X.HU6;
import X.HU7;
import X.HU8;
import X.HU9;
import X.HUA;
import X.HUB;
import X.InterfaceC43082GvW;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl;
import java.io.File;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativePathWorkspaceImpl implements WorkspaceImpl, InterfaceC43082GvW {
    public static final HUB CREATOR = new HUB();
    public static int concatAudioIndex;
    public static int concatVideoIndex;
    public static int recordMP4Index;
    public String backgroundAudioFile;
    public final C5H3 backgroundVideoDir$delegate;
    public String backgroundVideoFile;
    public final C5H3 concatAudioName$delegate;
    public String concatAudioPath;
    public final C5H3 concatDir$delegate;
    public final C5H3 concatVideoName$delegate;
    public String concatVideoPath;
    public final CreativeInfo creativeInfo;
    public final C5H3 diyPropVideoDir$delegate;
    public String diyPropVideoFile;
    public final C5H3 encodedAudioOutputFile$delegate;
    public String localMusicUri;
    public String mMusicPath;
    public final C5H3 mixDir$delegate;
    public final C5H3 originSoundDir$delegate;
    public final C5H3 parallelUploadDir$delegate;
    public final C5H3 parallelUploadOutputFile$delegate;
    public final C5H3 recordCacheMp4Dir$delegate;
    public String recordDir;
    public final C5H3 recordMP4Dir$delegate;
    public final C5H3 recordMP4Name$delegate;
    public String recordMP4Path;
    public String recordMp4Mode;
    public final C5H3 recordingMp4File$delegate;
    public final C5H3 reverseDir$delegate;
    public final C5H3 reversePath$delegate;
    public final C5H3 synthesisDir$delegate;
    public String synthesiseOutputFile;
    public String tempMixMusicFile;
    public final C5H3 tempMixOutputFile$delegate;

    @Override // X.InterfaceC43082GvW
    public final void LIZ(Workspace outRef) {
        o.LJIIIZ(outRef, "outRef");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void v() {
        this.mMusicPath = null;
        this.localMusicUri = null;
    }

    public final String LIZIZ() {
        return (String) this.concatAudioName$delegate.getValue();
    }

    public final String LIZLLL() {
        return (String) this.concatDir$delegate.getValue();
    }

    public final String LJ() {
        return (String) this.concatVideoName$delegate.getValue();
    }

    public final String LJI() {
        return (String) this.mixDir$delegate.getValue();
    }

    public final String LJII() {
        return (String) this.originSoundDir$delegate.getValue();
    }

    public final String LJIIIIZZ() {
        return (String) this.parallelUploadDir$delegate.getValue();
    }

    public final String LJIIIZ() {
        return (String) this.recordCacheMp4Dir$delegate.getValue();
    }

    public final String LJIIJJI() {
        return (String) this.reverseDir$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File[] LJJJLL() {
        return new File(this.recordDir).listFiles(HU9.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void LLIIII() {
        if (this.tempMixMusicFile == null) {
            StringBuilder LIZ = X1D.LIZ();
            this.tempMixMusicFile = new File(JBR.LJFF(LIZ, this.mMusicPath, ".wav", LIZ)).getPath();
        }
        String str = this.tempMixMusicFile;
        o.LJI(str);
        File file = new File(str);
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        }
        File file2 = new File((String) this.tempMixOutputFile$delegate.getValue());
        if (file2.exists()) {
            C16880lQ.LLLZZIL(file2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLJJJIL() {
        return new File((String) this.parallelUploadOutputFile$delegate.getValue());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void LLLFZ() {
        if (o.LJ(this.recordMp4Mode, "ecommerce_comment")) {
            File LLZZJLIL = LLZZJLIL();
            if (LLZZJLIL.exists()) {
                C16880lQ.LLLZZIL(LLZZJLIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void LLLJ() {
        this.recordMp4Mode = "ecommerce_comment";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLLLLLLLL() {
        return new File((String) this.encodedAudioOutputFile$delegate.getValue());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLLLLLLLLL() {
        String str = this.synthesiseOutputFile;
        if (str == null || str.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) this.synthesisDir$delegate.getValue());
            LIZ.append(LJ());
            this.synthesiseOutputFile = X1D.LIZIZ(LIZ);
        }
        return new File(this.synthesiseOutputFile);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File[] LLLZZIL() {
        return new File(this.recordDir).listFiles(HUA.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLZZJLIL() {
        if (o.LJ(this.recordMp4Mode, "ecommerce_comment")) {
            return new File((String) this.recordingMp4File$delegate.getValue());
        }
        String LJIIJ = LJIIJ();
        if (LJIIJ == null || LJIIJ.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) this.recordMP4Dir$delegate.getValue());
            LIZ.append((String) this.recordMP4Name$delegate.getValue());
            this.recordMP4Path = X1D.LIZIZ(LIZ);
        }
        File file = new File(LJIIJ());
        C78966Uyw.LJJJJLL(file.getParentFile());
        return file;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File y() {
        if (this.recordDir.length() == 0) {
            return null;
        }
        return new File(this.recordDir);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File E() {
        String concatVideoPath = getConcatVideoPath();
        if (concatVideoPath == null || concatVideoPath.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZLLL());
            LIZ.append(LJ());
            this.concatVideoPath = X1D.LIZIZ(LIZ);
        }
        File file = new File(getConcatVideoPath());
        C78966Uyw.LJJJJLL(file.getParentFile());
        return file;
    }

    public final String LJIIJ() {
        if (C34284Dcu.LIZ() && this.recordMP4Path == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) this.recordMP4Dir$delegate.getValue());
            LIZ.append((String) this.recordMP4Name$delegate.getValue());
            this.recordMP4Path = X1D.LIZIZ(LIZ);
        }
        return this.recordMP4Path;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LJJJJLI() {
        String concatAudioPath = getConcatAudioPath();
        if (concatAudioPath == null || concatAudioPath.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZLLL());
            LIZ.append(LIZIZ());
            this.concatAudioPath = X1D.LIZIZ(LIZ);
        }
        File file = new File(getConcatAudioPath());
        C78966Uyw.LJJJJLL(file.getParentFile());
        return file;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LJLLI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) this.backgroundVideoDir$delegate.getValue());
        LIZ.append(C43075GvP.LIZ("-bgv-a"));
        this.backgroundAudioFile = X1D.LIZIZ(LIZ);
        File file = new File(this.backgroundAudioFile);
        C78966Uyw.LJJJJLL(file.getParentFile());
        return file;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLLII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) this.backgroundVideoDir$delegate.getValue());
        LIZ.append(C43075GvP.LIZ("-bgv-v"));
        this.backgroundVideoFile = X1D.LIZIZ(LIZ);
        File file = new File(this.backgroundVideoFile);
        C78966Uyw.LJJJJLL(file.getParentFile());
        return file;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLLLII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) this.diyPropVideoDir$delegate.getValue());
        LIZ.append(C43075GvP.LIZ(".mp4"));
        this.diyPropVideoFile = X1D.LIZIZ(LIZ);
        File file = new File(this.diyPropVideoFile);
        C78966Uyw.LJJJJLL(file.getParentFile());
        return file;
    }

    public final String getConcatAudioPath() {
        if (C34284Dcu.LIZ() && this.concatAudioPath == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZLLL());
            LIZ.append(LIZIZ());
            this.concatAudioPath = X1D.LIZIZ(LIZ);
        }
        return this.concatAudioPath;
    }

    public final String getConcatVideoPath() {
        if (C34284Dcu.LIZ() && this.concatVideoPath == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZLLL());
            LIZ.append(LJ());
            this.concatVideoPath = X1D.LIZIZ(LIZ);
        }
        return this.concatVideoPath;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final String getMusicPath() {
        return this.mMusicPath;
    }

    public CreativePathWorkspaceImpl(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.creativeInfo = creativeInfo;
        this.recordDir = C43073GvN.LIZLLL(C62850Ola.LJ(), creativeInfo, EnumC43649HBd.RECORD, null, false, 12);
        this.concatDir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 97));
        this.recordMP4Dir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 105));
        this.reverseDir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 107));
        this.mixDir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 100));
        this.synthesisDir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 109));
        this.originSoundDir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 101));
        this.parallelUploadDir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 102));
        this.backgroundVideoDir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 96));
        this.diyPropVideoDir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 98));
        this.recordCacheMp4Dir$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 104));
        this.concatVideoName$delegate = C221108m2.LIZIZ(HU7.LJLIL);
        this.concatAudioName$delegate = C221108m2.LIZIZ(HU6.LJLIL);
        this.recordMP4Name$delegate = C221108m2.LIZIZ(HU8.LJLIL);
        this.reversePath$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 108));
        this.tempMixOutputFile$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 110));
        this.encodedAudioOutputFile$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 99));
        this.parallelUploadOutputFile$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 103));
        this.recordingMp4File$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 106));
        this.backgroundVideoFile = "";
        this.backgroundAudioFile = "";
        this.diyPropVideoFile = "";
        this.recordMp4Mode = "";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void LLILLL(String str) {
        v();
        this.mMusicPath = str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void s(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.recordDir = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreativePathWorkspaceImpl(android.os.Parcel r7) {
        /*
            r6 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Class<com.ss.android.ugc.aweme.creative.CreativeInfo> r0 = com.ss.android.ugc.aweme.creative.CreativeInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r7.readParcelable(r0)
            com.ss.android.ugc.aweme.creative.CreativeInfo r0 = (com.ss.android.ugc.aweme.creative.CreativeInfo) r0
            if (r0 != 0) goto L1d
            com.ss.android.ugc.aweme.creative.CreativeInfo r0 = new com.ss.android.ugc.aweme.creative.CreativeInfo
            r1 = 0
            r2 = 0
            r4 = 7
            r3 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
        L1d:
            r6.<init>(r0)
            boolean r0 = X.C34284Dcu.LIZ()
            if (r0 == 0) goto L4b
            java.lang.String r0 = r7.readString()
            r6.concatVideoPath = r0
            java.lang.String r0 = r7.readString()
            r6.concatAudioPath = r0
            java.lang.String r0 = r7.readString()
            r6.tempMixMusicFile = r0
            java.lang.String r0 = r7.readString()
            r6.synthesiseOutputFile = r0
            java.lang.String r0 = r7.readString()
            r6.mMusicPath = r0
            java.lang.String r0 = r7.readString()
            r6.localMusicUri = r0
        L4a:
            return
        L4b:
            java.lang.String r0 = r7.readString()
            if (r0 != 0) goto L67
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r6.LIZLLL()
            r1.append(r0)
            java.lang.String r0 = r6.LJ()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
        L67:
            r6.concatVideoPath = r0
            java.lang.String r0 = r7.readString()
            if (r0 != 0) goto L85
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r6.LIZLLL()
            r1.append(r0)
            java.lang.String r0 = r6.LIZIZ()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
        L85:
            r6.concatAudioPath = r0
            java.lang.String r0 = r7.readString()
            r6.tempMixMusicFile = r0
            java.lang.String r0 = r7.readString()
            if (r0 != 0) goto Lad
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            X.5H3 r0 = r6.synthesisDir$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = r6.LJ()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
        Lad:
            r6.synthesiseOutputFile = r0
            java.lang.String r0 = r7.readString()
            r6.mMusicPath = r0
            java.lang.String r0 = r7.readString()
            r6.localMusicUri = r0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeParcelable(this.creativeInfo, i);
        dest.writeString(getConcatVideoPath());
        dest.writeString(getConcatAudioPath());
        dest.writeString(this.tempMixMusicFile);
        dest.writeString(this.synthesiseOutputFile);
        dest.writeString(this.mMusicPath);
        dest.writeString(this.localMusicUri);
    }
}
