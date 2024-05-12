package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.brand.TranssonicServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.brand.ITranssonicService;
import com.ss.android.ugc.aweme.ug.brand.TranssonicFakeService;
import kotlin.jvm.internal.o;

/* renamed from: X.MzI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58604MzI implements ITranssonicService {
    public static final C58604MzI LIZIZ = new C58604MzI();
    public final /* synthetic */ ITranssonicService LIZ;

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final void applicationOnCreate(Context context, String str) {
        o.LJIIIZ(context, "context");
        this.LIZ.applicationOnCreate(context, "582cd4dee70cea81c5edcdbf8eb674a5");
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final InterfaceC58304MuS getSmartNetworkService() {
        return this.LIZ.getSmartNetworkService();
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final void mainOnCreate(Activity mainActivity) {
        o.LJIIIZ(mainActivity, "mainActivity");
        this.LIZ.mainOnCreate(mainActivity);
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final void onVideoPlayBlock() {
        this.LIZ.onVideoPlayBlock();
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final void openCamera() {
        this.LIZ.openCamera();
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final void startNewPage(String str) {
        this.LIZ.startNewPage(str);
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final void videoPlayStart() {
        this.LIZ.videoPlayStart();
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final void waterMarkEnd() {
        this.LIZ.waterMarkEnd();
    }

    @Override // com.ss.android.ugc.aweme.ug.brand.ITranssonicService
    public final void waterMarkStart() {
        this.LIZ.waterMarkStart();
    }

    public C58604MzI() {
        Object LIZ;
        ITranssonicService transsonicFakeService;
        try {
            LIZ = Class.forName("com.ss.android.ugc.aweme.brand.TranssonicServiceImpl");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Class cls = (Class) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (cls != null) {
            ServiceManager.get().bind(ITranssonicService.class, new C58603MzH(cls)).asSingleton();
            transsonicFakeService = TranssonicServiceImpl.LIZ();
        } else {
            transsonicFakeService = new TranssonicFakeService();
        }
        this.LIZ = transsonicFakeService;
    }
}
