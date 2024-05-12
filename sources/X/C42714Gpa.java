package X;

import com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl;

/* renamed from: X.Gpa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42714Gpa extends AbstractC65781Prl implements InterfaceC65784Pro<C42711GpX> {
    public static final C42714Gpa LJLIL = new C42714Gpa();

    public C42714Gpa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C42711GpX invoke() {
        C42711GpX c42711GpX = new C42711GpX();
        c42711GpX.LIZ(new AVStorageManagerImpl());
        return c42711GpX;
    }
}
