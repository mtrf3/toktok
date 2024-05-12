package com.ss.android.ugc.aweme.shortvideo.cover;

import X.InterfaceC153045zY;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.vesdk.VEEditor;

/* loaded from: classes3.dex */
public class VEMultiEditVideoCoverGeneratorImpl extends VEVideoCoverGeneratorImpl {
    public final int LJLJLJ;

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl
    public final int[] LIZJ(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = (i3 * i4) + this.LJLJLJ;
        }
        return iArr;
    }

    public VEMultiEditVideoCoverGeneratorImpl(InterfaceC153045zY interfaceC153045zY, LifecycleOwner lifecycleOwner, int i, int i2, int i3, VEEditor.GET_FRAMES_FLAGS get_frames_flags) {
        super(interfaceC153045zY, lifecycleOwner, i, get_frames_flags, "choose_cover");
        this.LJLILLLLZI = i2;
        this.LJLJLJ = i3;
    }
}
