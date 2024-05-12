package X;

import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;

/* renamed from: X.Y2i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86736Y2i implements InterfaceC29937Boz {
    public final /* synthetic */ TranslationStatusViewModel LIZ;
    public final /* synthetic */ InterfaceC86733Y2f LIZIZ;

    public C86736Y2i(InterfaceC86733Y2f interfaceC86733Y2f, TranslationStatusViewModel translationStatusViewModel) {
        this.LIZ = translationStatusViewModel;
        this.LIZIZ = interfaceC86733Y2f;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        ILV ilv = this.LIZ.LJZL;
        if (ilv != null) {
            this.LIZIZ.LIZ(ilv);
        }
    }
}
