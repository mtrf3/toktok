package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JOZ implements InterfaceC46826IZi {
    public final /* synthetic */ SearchCLASubtitleVM LIZ;

    @Override // X.InterfaceC46826IZi
    public final void LJ(String sourceId, String response, Object extraInfo) {
        o.LJIIIZ(sourceId, "sourceId");
        o.LJIIIZ(response, "response");
        o.LJIIIZ(extraInfo, "extraInfo");
    }

    public JOZ(SearchCLASubtitleVM searchCLASubtitleVM) {
        this.LIZ = searchCLASubtitleVM;
    }

    @Override // X.InterfaceC46826IZi
    public final void LIZ(int i, String sourceId, String str) {
        int i2;
        o.LJIIIZ(sourceId, "sourceId");
        if (str != null) {
            try {
                i2 = JSONObjectProtectorUtils.getInt(new JSONObject(str), "sub_id");
            } catch (Exception unused) {
            }
            SearchCLASubtitleVM searchCLASubtitleVM = this.LIZ;
            JO3 jo3 = new JO3(sourceId, i, i2);
            searchCLASubtitleVM.getClass();
            searchCLASubtitleVM.setState(new AqS174S0100000_8(jo3, 252));
        }
        i2 = 0;
        SearchCLASubtitleVM searchCLASubtitleVM2 = this.LIZ;
        JO3 jo32 = new JO3(sourceId, i, i2);
        searchCLASubtitleVM2.getClass();
        searchCLASubtitleVM2.setState(new AqS174S0100000_8(jo32, 252));
    }

    @Override // X.InterfaceC46826IZi
    public final void LIZIZ(int i, int i2, String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        SearchCLASubtitleVM searchCLASubtitleVM = this.LIZ;
        JO3 jo3 = new JO3(sourceId, i, i2);
        searchCLASubtitleVM.getClass();
        searchCLASubtitleVM.setState(new AqS174S0100000_8(jo3, 252));
    }

    @Override // X.InterfaceC46826IZi
    public final void LJFF(int i, String sourceId, String info) {
        o.LJIIIZ(sourceId, "sourceId");
        o.LJIIIZ(info, "info");
        SearchCLASubtitleVM searchCLASubtitleVM = this.LIZ;
        C49086JOg c49086JOg = new C49086JOg(sourceId, i, info);
        searchCLASubtitleVM.getClass();
        searchCLASubtitleVM.setState(new AqS174S0100000_8(c49086JOg, 251));
    }

    public final int LJI(String str, int i, String str2) {
        C90U c90u = new C90V().LIZ;
        c90u.LIZ = str;
        c90u.LIZIZ = i;
        c90u.LIZLLL = str2;
        c90u.LIZJ = true;
        SearchCLASubtitleVM searchCLASubtitleVM = this.LIZ;
        searchCLASubtitleVM.getClass();
        searchCLASubtitleVM.setState(new AqS174S0100000_8(c90u, 253));
        return 0;
    }

    @Override // X.InterfaceC46826IZi
    public final int LIZJ(String sourceId, int i, int i2, int i3, int i4, String info, boolean z, boolean z2, long j, long j2, long j3) {
        o.LJIIIZ(sourceId, "sourceId");
        o.LJIIIZ(info, "info");
        LJI(sourceId, i4, info);
        return 0;
    }

    @Override // X.InterfaceC46826IZi
    public final void LIZLLL(String sourceId, int i, int i2, int i3, int i4, String info, boolean z, boolean z2, long j, long j2, long j3) {
        o.LJIIIZ(sourceId, "sourceId");
        o.LJIIIZ(info, "info");
        LJI(sourceId, i4, info);
    }
}
