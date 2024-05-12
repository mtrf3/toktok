package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.NoSuchElementException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class I9E {
    public final InterfaceC82086WJm LIZ;
    public final I9X LIZIZ;
    public final CameraComponentModel LIZJ;
    public final C46144I9c LIZLLL;

    public static void LIZ(I9L i9l) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i9l.LIZ);
            jSONObject.put("error_message", i9l.LJFF);
            jSONObject.put("exception", android.util.Log.getStackTraceString(new Throwable("delete last segments")));
            C82891Wg3 c82891Wg3 = C82891Wg3.LJIIIZ;
            c82891Wg3.getClass();
            ((I9H) C82891Wg3.LJFF.LIZ(c82891Wg3, C82891Wg3.LIZ[4])).LIZ(EnumC35491DwN.SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void onEvent(I9L i9l) {
        boolean z;
        TimeSpeedModelExtension timeSpeedModelExtension;
        HCA LIZIZ = this.LIZJ.LIZIZ();
        C46144I9c c46144I9c = this.LIZLLL;
        if (c46144I9c != null) {
            z = c46144I9c.LIZLLL.invoke().booleanValue();
        } else {
            z = false;
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeleteLastFragmentEventHandlerFactory:onEvent,is segment empty");
        LIZ.append(LIZIZ.isEmpty());
        LIZ.append(",enableTitan:");
        LIZ.append(z);
        LIZLLL.d(X1D.LIZIZ(LIZ));
        if (!LIZIZ.isEmpty()) {
            this.LIZIZ.LJLIIL(I9G.LIZ);
            if (!LIZIZ.isEmpty()) {
                timeSpeedModelExtension = LIZIZ.remove(LIZIZ.size() - 1);
                ((C43786HGk) this.LIZIZ.LLLLJI()).LIZ.removeLastSegment();
                this.LIZJ.LJIIJ(TimeSpeedModelExtension.calculateRealTime(LIZIZ));
                this.LIZJ.recordContext.filterLabels.removeLastArray();
                this.LIZJ.recordContext.filterEnterMethod.removeLastArray();
                this.LIZJ.recordContext.filterIds.removeLastArray();
                this.LIZJ.recordContext.filterValues.removeLastArray();
                this.LIZJ.recordContext.smoothSkinLabels.removeLast();
                this.LIZJ.recordContext.reshapeLabels.removeLast();
                this.LIZJ.recordContext.tanningLabels.removeLast();
                this.LIZJ.recordContext.eyesLables.removeLast();
                CameraComponentModel cameraComponentModel = this.LIZJ;
                if (cameraComponentModel.duetContext.windowInfoList.size() > 0) {
                    ListProtector.remove(cameraComponentModel.duetContext.windowInfoList, r1.size() - 1);
                }
                this.LIZIZ.LJJLL(IAO.LLLLZ(this.LIZJ.LIZLLL(), LIZIZ, true));
                C05L.LIZJ(4, this.LIZ);
                this.LIZIZ.LJJZ(true);
                this.LIZIZ.LJJLIIIJJIZ(i9l);
                if (z) {
                    this.LIZIZ.LJJLIIIJLLLLLLLZ(timeSpeedModelExtension);
                }
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            try {
                C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("DeleteLastFragmentEventHandlerFactory:onEvent,deleteLastFrag when segments in business is empty.reason:");
                LIZ2.append(i9l.LJFF);
                LIZ2.append(",recordState:");
                LIZ2.append(i9l.LIZ);
                LIZLLL2.w(X1D.LIZIZ(LIZ2));
                this.LIZIZ.LJJLIIIJJIZ(i9l);
                LIZ(i9l);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            timeSpeedModelExtension = null;
        }
        if (LIZIZ.isEmpty()) {
            if (!this.LIZJ.LJIILIIL()) {
                this.LIZIZ.FV(this.LIZJ.mCurrentDurationMode, false);
            }
            this.LIZIZ.LJJZZIII();
        }
        this.LIZIZ.LJLLL();
        if (!z) {
            this.LIZIZ.LJJLIIIJLLLLLLLZ(timeSpeedModelExtension);
        }
    }

    public I9E(InterfaceC82086WJm interfaceC82086WJm, I9X i9x, CameraComponentModel cameraComponentModel, C46144I9c c46144I9c) {
        this.LIZ = interfaceC82086WJm;
        this.LIZIZ = i9x;
        this.LIZJ = cameraComponentModel;
        this.LIZLLL = c46144I9c;
    }
}
