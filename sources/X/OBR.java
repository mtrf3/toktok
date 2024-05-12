package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.easteregg.core.config.Settings;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OBR implements InterfaceC50639Ju7<C50277JoH> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C50644JuC.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(OBU.LJLIL);
    public final int LIZJ = 3;

    @Override // X.InterfaceC50639Ju7
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LIZJ);
    }

    @Override // X.InterfaceC50639Ju7
    public final C50277JoH getData() {
        return new C50277JoH(LIZJ());
    }

    public final boolean LIZJ() {
        long j;
        boolean z;
        boolean z2;
        Long l;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Settings LIZ = E8R.LIZ();
        if (LIZ != null && (l = LIZ.preloadIntervalMillis) != null) {
            j = l.longValue();
        } else {
            j = E8R.LIZ;
        }
        long j2 = ((Keva) this.LIZ.getValue()).getLong("easter_egg_lynx_timestamp", -1L);
        long j3 = ((Keva) this.LIZ.getValue()).getLong("easter_egg_video_timestamp", -1L);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Validity result, Lynx(");
        long j4 = elapsedRealtime - j2;
        if (j4 < j) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(z);
        LIZ2.append("), Video(");
        long j5 = elapsedRealtime - j3;
        if (j5 < j) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ2.append(z2);
        LIZ2.append(')');
        X1D.LIZIZ(LIZ2);
        if (j2 >= 0 && j3 >= 0 && elapsedRealtime >= j2 && elapsedRealtime >= j3 && j4 < j && j5 < j) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        Integer num;
        String str;
        String str2;
        Settings LIZ = E8R.LIZ();
        if (LIZ == null || (num = LIZ.enabled) == null || num.intValue() != 1) {
            return;
        }
        C61484OBc c61484OBc = C61483OBb.LIZJ;
        c61484OBc.getClass();
        if (C61484OBc.LIZIZ().LIZIZ(IResourceService.class, "hybridkit_default_bid") == null) {
            return;
        }
        String LIZ2 = C38943FQd.LIZ();
        Settings LIZ3 = E8R.LIZ();
        if (LIZ3 == null || (str = LIZ3.resourceChannel) == null) {
            str = "";
        }
        Settings LIZ4 = E8R.LIZ();
        if (LIZ4 == null || (str2 = LIZ4.lynxTemplateChannel) == null) {
            str2 = "";
        }
        if (LIZ2.length() == 0 || str.length() == 0 || str2.length() == 0 || LIZJ() || ((OBT) this.LIZIZ.getValue()).LIZ()) {
            return;
        }
        c61484OBc.getClass();
        IResourceService iResourceService = (IResourceService) C61484OBc.LIZIZ().LIZIZ(IResourceService.class, "hybridkit_default_bid");
        if (iResourceService != null) {
            O1M o1m = new O1M(LIZ2);
            C61091NyJ c61091NyJ = new C61091NyJ(true);
            c61091NyJ.LIZ = C47261Igj.LJJIJIL(EnumC61089NyH.GECKO);
            o1m.LIZ = c61091NyJ;
            o1m.LIZLLL = 1;
            o1m.LJFF = str2;
            iResourceService.loadAsync("", o1m, new AqS176S0100000_10(this, 209), OBX.LJLIL);
        }
        c61484OBc.getClass();
        IResourceService iResourceService2 = (IResourceService) C61484OBc.LIZIZ().LIZIZ(IResourceService.class, "hybridkit_default_bid");
        if (iResourceService2 == null) {
            return;
        }
        O1M o1m2 = new O1M(LIZ2);
        C61091NyJ c61091NyJ2 = new C61091NyJ(true);
        c61091NyJ2.LIZ = C47261Igj.LJJIJIL(EnumC61089NyH.GECKO);
        o1m2.LIZ = c61091NyJ2;
        o1m2.LIZLLL = 1;
        o1m2.LJFF = str;
        iResourceService2.loadAsync("", o1m2, new AqS176S0100000_10(this, 210), OBY.LJLIL);
    }

    @Override // X.InterfaceC50639Ju7
    public final void LIZ(Context context, SearchResultParam searchResultParam, Long l) {
        o.LJIIIZ(context, "context");
        if (C34057DYf.LJLILLLLZI.LJJII() && !C78840Uwu.LJJI(searchResultParam)) {
            C38995FSd.LIZJ().execute(new ARunnableS46S0100000_10(this, context, searchResultParam, l, 166));
        } else {
            LIZLLL();
        }
    }
}
