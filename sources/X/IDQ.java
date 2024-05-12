package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IDQ implements InterfaceC46826IZi {
    public final WeakReference<IDP> LIZ;

    @Override // X.InterfaceC46826IZi
    public final void LJ(String str, String str2, Object obj) {
    }

    public IDQ(IDP idp) {
        this.LIZ = new WeakReference<>(idp);
    }

    @Override // X.InterfaceC46826IZi
    public final void LIZ(int i, String str, String str2) {
        LJII(i, str, str2);
    }

    @Override // X.InterfaceC46826IZi
    public final void LIZIZ(int i, int i2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sub_id", i2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        LJII(i, str, jSONObject.toString());
    }

    @Override // X.InterfaceC46826IZi
    public final void LJFF(int i, String str, String str2) {
        C2MA viewHolderByAwemeId;
        StringBuilder LJ = AnonymousClass028.LJ("onSubLoadFinished2 sourceId=", str, " success=", i, " info=");
        C1FJ.LJFF(LJ, str2, LJ, 4, "CaptionCallbackLog");
        IDP idp = this.LIZ.get();
        if (idp != null && (viewHolderByAwemeId = idp.getViewHolderByAwemeId(str)) != null) {
            IDP.LJLZ(i, str2);
            if (1 == i) {
                viewHolderByAwemeId.e8(i, str);
            } else {
                idp.LJJJJL(str);
                viewHolderByAwemeId.y8(i, str, str2);
            }
        }
    }

    public final void LJII(int i, String str, String str2) {
        StringBuilder LJ = AnonymousClass028.LJ("onSubSwitchCompleted sourceId=", str, " success=", i, " info=");
        C1FJ.LJFF(LJ, str2, LJ, 4, "CaptionCallbackLog");
        IDP idp = this.LIZ.get();
        if (idp == null) {
            return;
        }
        IDP.LJLZ(i, null);
        if (!TextUtils.isEmpty(str) && 1 == i) {
            idp.LLIIIILZ.put(str, Integer.valueOf(i));
        }
        C2MA viewHolderByAwemeId = idp.getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId != null) {
            viewHolderByAwemeId.P8(i, str2);
        }
    }

    public final int LJI(String str, int i, int i2, int i3, String str2, boolean z, boolean z2, long j, long j2, long j3) {
        int i4;
        List<CaptionItemModel> captionList;
        long j4 = j2;
        IDP idp = this.LIZ.get();
        if (idp == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSubInfoCallback: player controller is null!! sourceId=");
            LIZ.append(str);
            C36922EeM.LIZLLL(6, "CaptionCallbackLog", X1D.LIZIZ(LIZ));
            return -1;
        }
        C2MA viewHolderByAwemeId = idp.getViewHolderByAwemeId(str);
        if (viewHolderByAwemeId == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSubInfoCallback: viewholder is null!! sourceId=");
            LIZ2.append(str);
            C36922EeM.LIZLLL(6, "CaptionCallbackLog", X1D.LIZIZ(LIZ2));
            return -2;
        }
        Aweme LJJIIJZLJL = IDP.LJJIIJZLJL(viewHolderByAwemeId);
        viewHolderByAwemeId.f7(i3, i2, str, str2);
        if (!TextUtils.isEmpty(str) && idp.LLIIIILZ.containsKey(str)) {
            idp.LLIIIILZ.get(str).intValue();
        }
        if (z || z2) {
            long currentPosition = idp.LJJJJIZL().getCurrentPosition();
            if (currentPosition > j3) {
                i4 = 0;
            } else if (currentPosition == j3) {
                i4 = 1;
            } else if (LJJIIJZLJL != null && !str.equals(LJJIIJZLJL.getAid())) {
                i4 = 2;
            } else {
                i4 = 3;
            }
            long j5 = currentPosition - j3;
            if (i == -1) {
                j4 = -1;
            }
            if (z) {
                idp.LJJJJL(str);
                viewHolderByAwemeId.D7(j, j4, currentPosition, j3, i4, j5, idp.LLJLIL);
            } else {
                if (!z2) {
                    return 0;
                }
                if (viewHolderByAwemeId.getCurrentAweme().getVideo().getCaptionModel() != null && viewHolderByAwemeId.getCurrentAweme().getVideo().getCaptionModel().getCaptionList() != null && !viewHolderByAwemeId.getCurrentAweme().getVideo().getCaptionModel().getCaptionList().isEmpty() && (captionList = viewHolderByAwemeId.getCurrentAweme().getVideo().getCaptionModel().getCaptionList()) != null && !captionList.isEmpty()) {
                    for (CaptionItemModel captionItemModel : captionList) {
                        if (i2 == captionItemModel.getSubId()) {
                            VideoUrlModel LJJJJLI = C51029K0z.LJJJJLI(captionItemModel);
                            int LJIIL = IDP.LJIIL(LJJJJLI, LJJJJLI.getSourceId());
                            idp.LLJLIL = LJIIL;
                            if (LJIIL < 0) {
                                idp.LLJLIL = 0;
                            }
                        }
                    }
                }
                viewHolderByAwemeId.N8(j, j4, i4, currentPosition, j3, j5, idp.LLJLIL);
                return 0;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC46826IZi
    public final int LIZJ(String str, int i, int i2, int i3, int i4, String str2, boolean z, boolean z2, long j, long j2, long j3) {
        return LJI(str, i, i2, i4, str2, z, z2, j, j2, j3);
    }

    @Override // X.InterfaceC46826IZi
    public final void LIZLLL(String str, int i, int i2, int i3, int i4, String str2, boolean z, boolean z2, long j, long j2, long j3) {
        LJI(str, i, i2, i4, str2, z, z2, j, j2, j3);
    }
}
