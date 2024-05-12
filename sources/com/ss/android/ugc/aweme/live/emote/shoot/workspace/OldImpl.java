package com.ss.android.ugc.aweme.live.emote.shoot.workspace;

import X.C16880lQ;
import X.C43076GvQ;
import X.C43078GvS;
import X.C43079GvT;
import X.C44687HgJ;
import X.InterfaceC43082GvW;
import X.JBR;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class OldImpl implements WorkspaceImpl, InterfaceC43082GvW {
    public static final Parcelable.Creator<OldImpl> CREATOR = new IDCreatorS51S0000000_7(5);
    public final int LJLIL;
    public String LJLILLLLZI;
    public final String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public final String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public Uri localMusicUri;
    public Handler uiHandler;

    @Override // X.InterfaceC43082GvW
    public final void LIZ(Workspace workspace) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final /* synthetic */ void LLLJ() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void v() {
        this.LJLJL = null;
        this.localMusicUri = null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File E() {
        if (this.LJLJJI == null) {
            this.LJLJJI = C43076GvQ.LIZ("-concat-v");
        }
        return new File(this.LJLJJI);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LJJJJLI() {
        if (this.LJLJJL == null) {
            this.LJLJJL = C43076GvQ.LIZ("-concat-a");
        }
        return new File(this.LJLJJL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File[] LJJJLL() {
        String str;
        if (this.LJLIL == 0) {
            str = this.LJLILLLLZI;
        } else {
            str = this.LJLJI;
        }
        return new File(str).listFiles(new C43079GvT());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LJLLI() {
        String str = C43076GvQ.LIZJ;
        if (!C44687HgJ.LIZIZ(str)) {
            C44687HgJ.LJFF(str, false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(C43076GvQ.LIZIZ("-bgv-a"));
        this.LJLLL = X1D.LIZIZ(LIZ);
        return new File(this.LJLLL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void LLIIII() {
        if (this.LJLJLLL == null) {
            StringBuilder LIZ = X1D.LIZ();
            this.LJLJLLL = new File(JBR.LJFF(LIZ, this.LJLJL, ".wav", LIZ)).getPath();
        }
        File file = new File(this.LJLJLLL);
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        }
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new File(this.LJLILLLLZI, "mix.wav").getPath();
        }
        File file2 = new File(this.LJLJLJ);
        if (file2.exists()) {
            C16880lQ.LLLZZIL(file2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLJJJIL() {
        if (this.LJLLILLLL == null) {
            String concatVideoPath = E().getPath();
            o.LJIIIZ(concatVideoPath, "concatVideoPath");
            String path = new File(C43076GvQ.LJFF, new File(concatVideoPath).getName()).getPath();
            o.LJIIIIZZ(path, "synthetiseOutputFile.path");
            this.LJLLILLLL = path;
        }
        return new File(this.LJLLILLLL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void LLLFZ() {
        if (!TextUtils.isEmpty(this.LJLLLL)) {
            C44687HgJ.LJIILJJIL(this.LJLLLL);
            this.LJLLLL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLLII() {
        String str = C43076GvQ.LIZJ;
        if (!C44687HgJ.LIZIZ(str)) {
            C44687HgJ.LJFF(str, false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(C43076GvQ.LIZIZ("-bgv-v"));
        this.LJLLJ = X1D.LIZIZ(LIZ);
        return new File(this.LJLLJ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLLLII() {
        String str = C43076GvQ.LJ;
        if (!C44687HgJ.LIZIZ(str)) {
            C44687HgJ.LJFF(str, false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(C43076GvQ.LIZIZ("-diy.mp4"));
        this.LJLLLLLL = X1D.LIZIZ(LIZ);
        return new File(this.LJLLLLLL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLLLLLLLL() {
        if (this.LJLLI == null) {
            String concatAudioPath = LJJJJLI().getPath();
            o.LJIIIZ(concatAudioPath, "concatAudioPath");
            String path = new File(C43076GvQ.LIZLLL, new File(concatAudioPath).getName()).getPath();
            o.LJIIIIZZ(path, "originalSoundFile.path");
            this.LJLLI = path;
        }
        return new File(this.LJLLI);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLLLLLLLLL() {
        if (this.LJLL == null) {
            String concatVideoPath = E().getPath();
            o.LJIIIZ(concatVideoPath, "concatVideoPath");
            File file = new File(concatVideoPath);
            String parent = file.getParent();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("synthetise_");
            LIZ.append(file.getName());
            String path = new File(parent, X1D.LIZIZ(LIZ)).getPath();
            o.LJIIIIZZ(path, "synthetiseOutputFile.path");
            this.LJLL = path;
        }
        return new File(this.LJLL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File[] LLLZZIL() {
        String str;
        if (this.LJLIL == 0) {
            str = this.LJLILLLLZI;
        } else {
            str = this.LJLJI;
        }
        return new File(str).listFiles(new C43078GvS());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File LLZZJLIL() {
        if (TextUtils.isEmpty(this.LJLLLL)) {
            this.LJLLLL = C43076GvQ.LIZ("-dynamic.mp4");
        }
        return new File(this.LJLLLL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File y() {
        return new File(this.LJLILLLLZI);
    }

    public OldImpl() {
        this.LJLILLLLZI = C43076GvQ.LIZIZ;
        this.uiHandler = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final String getMusicPath() {
        return this.LJLJL;
    }

    public OldImpl(Parcel parcel) {
        this.LJLILLLLZI = C43076GvQ.LIZIZ;
        this.uiHandler = new Handler(C16880lQ.LLJJJJ());
        this.LJLIL = parcel.readInt();
        this.LJLILLLLZI = parcel.readString();
        this.LJLJI = parcel.readString();
        this.LJLJJI = parcel.readString();
        this.LJLJJL = parcel.readString();
        this.LJLJJLL = parcel.readString();
        this.LJLJL = parcel.readString();
        this.LJLJLLL = parcel.readString();
        this.LJLJLJ = parcel.readString();
        this.LJLL = parcel.readString();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void LLILLL(String str) {
        v();
        this.LJLJL = str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void s(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LJLIL);
        parcel.writeString(this.LJLILLLLZI);
        parcel.writeString(this.LJLJI);
        parcel.writeString(this.LJLJJI);
        parcel.writeString(this.LJLJJL);
        parcel.writeString(this.LJLJJLL);
        parcel.writeString(this.LJLJL);
        parcel.writeString(this.LJLJLLL);
        parcel.writeString(this.LJLJLJ);
        parcel.writeString(this.LJLL);
    }
}
