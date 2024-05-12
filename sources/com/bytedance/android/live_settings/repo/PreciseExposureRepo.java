package com.bytedance.android.live_settings.repo;

import X.C221108m2;
import X.C5H3;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreciseExposureRepo extends BaseRepo {
    public static final Companion Companion = new Companion();
    public static final C5H3<PreciseExposureRepo> INATANCE$delegate = C221108m2.LIZIZ(PreciseExposureRepo$Companion$INATANCE$2.INSTANCE);

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PreciseExposureRepo getINATANCE() {
            return PreciseExposureRepo.INATANCE$delegate.getValue();
        }

        public Companion() {
        }
    }

    public /* synthetic */ PreciseExposureRepo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "PreciseExposureRepo";
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        Keva repo = Keva.getRepo("live_precise_exposure_repo");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        return repo;
    }

    public PreciseExposureRepo() {
    }
}
