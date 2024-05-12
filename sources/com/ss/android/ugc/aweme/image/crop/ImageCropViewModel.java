package com.ss.android.ugc.aweme.image.crop;

import X.C151825xa;
import X.C81667W3j;
import X.InterfaceC148975sz;
import com.bytedance.ui_component.LifecycleAwareViewModel;

/* loaded from: classes3.dex */
public final class ImageCropViewModel extends LifecycleAwareViewModel<ImageCropState> implements InterfaceC148975sz {
    public boolean LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public ImageCropState kv0() {
        return new ImageCropState(new C81667W3j(), null, 2, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC148975sz
    public void show() {
        setState(C151825xa.LJLIL);
    }

    @Override // X.InterfaceC148975sz
    public boolean LLIIIJ() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC148975sz
    public void st0(boolean z) {
        this.LJLJL = z;
    }
}
