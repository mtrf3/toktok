package com.ss.android.ugc.aweme.shortvideo.WorkSpace;

import X.C82891Wg3;
import X.InterfaceC43082GvW;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.file.CreativePathWorkspaceImpl;
import java.io.File;

/* loaded from: classes8.dex */
public final class Workspace implements Parcelable {
    public static final Parcelable.Creator<Workspace> CREATOR = new IDCreatorS51S0000000_7(12);
    public final WorkspaceImpl LJLIL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final File E() {
        return this.LJLIL.E();
    }

    public final File LJJJJLI() {
        return this.LJLIL.LJJJJLI();
    }

    public final File LLJJJIL() {
        return this.LJLIL.LLJJJIL();
    }

    public final File LLLLLLLLL() {
        return this.LJLIL.LLLLLLLLL();
    }

    public final File LLLLLLLLLL() {
        return this.LJLIL.LLLLLLLLLL();
    }

    public final String getMusicPath() {
        return this.LJLIL.getMusicPath();
    }

    public final void v() {
        this.LJLIL.v();
    }

    public final File y() {
        return this.LJLIL.y();
    }

    public Workspace(Parcel parcel) {
        WorkspaceImpl workspaceImpl = (WorkspaceImpl) parcel.readParcelable(C82891Wg3.LIZ().getClassLoader());
        this.LJLIL = workspaceImpl;
        if (workspaceImpl instanceof InterfaceC43082GvW) {
            ((InterfaceC43082GvW) workspaceImpl).LIZ(this);
        }
    }

    public final void LLILLL(String str) {
        this.LJLIL.LLILLL(str);
    }

    public Workspace(CreativePathWorkspaceImpl creativePathWorkspaceImpl) {
        this.LJLIL = creativePathWorkspaceImpl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.LJLIL, i);
    }
}
