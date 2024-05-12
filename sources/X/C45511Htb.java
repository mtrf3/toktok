package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;

/* renamed from: X.Htb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45511Htb implements InterfaceC44688HgK {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZIZ;

    @Override // X.InterfaceC44688HgK
    public final void LIZ(Object obj) {
        boolean z;
        Boolean bool;
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        MvChoosePhotoScene.u.put(this.LIZ, Boolean.valueOf(z));
        this.LIZIZ.invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45511Htb(String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = str;
        this.LIZIZ = interfaceC88472Yns;
    }
}
