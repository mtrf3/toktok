package X;

import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.F0w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38286F0w extends C61491OBj {
    @Override // X.InterfaceC60252Nkm
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC60252Nkm
    public final List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("config");
        arrayList.add("appInfo");
        arrayList.add("login");
        arrayList.add("close");
        arrayList.add("gallery");
        C29822Bn8.LIZJ(arrayList, "toggleGalleryBars", "slideShow", "relatedShow", "toast");
        arrayList.add("slideDownload");
        arrayList.add("requestChangeOrientation");
        arrayList.add("adInfo");
        C29822Bn8.LIZJ(arrayList, "sendLog", "openSchoolEdit", "formDialogClose", "openSchoolEdit");
        arrayList.add("orderResult");
        return arrayList;
    }

    @Override // X.InterfaceC60252Nkm
    public final List<String> LJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("isAppInstalled");
        arrayList.add("share");
        arrayList.add("open");
        arrayList.add("openThirdApp");
        arrayList.add("copyToClipboard");
        C29822Bn8.LIZJ(arrayList, "userInfo", "apiParam", "openAweme", "openSchema");
        C29822Bn8.LIZJ(arrayList, "openRecord", "publishVideo", "openBrowser", "bindPhone");
        arrayList.add("fetch");
        arrayList.add("nativeStorage");
        arrayList.add("fetchTaoCommand");
        return arrayList;
    }

    @Override // X.InterfaceC60252Nkm
    public final List<String> LJIILJJIL() {
        return C38083Ex5.LIZIZ(C47261Igj.LJJIJ("host"), true);
    }

    @Override // X.InterfaceC60252Nkm
    public final Boolean LJIILL() {
        LocalTestApi localTestApi;
        C37091Eh5 c37091Eh5 = C37090Eh4.LIZ;
        LocalTestApi localTestApi2 = c37091Eh5.LIZ;
        boolean z = false;
        if (localTestApi2 != null && localTestApi2.enableBoe() && (localTestApi = c37091Eh5.LIZ) != null && localTestApi.enableBoeJsbBypass()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC60252Nkm
    public final List<String> LJJIIJZLJL() {
        return C38083Ex5.LIZIZ(C47261Igj.LJJIJ("host"), false);
    }

    @Override // X.InterfaceC60252Nkm
    public final Boolean LJJIIZI() {
        return Boolean.FALSE;
    }
}
