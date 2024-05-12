package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import jp3.c;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class I3G implements HXQ {
    public final /* synthetic */ I3F LIZ;

    public I3G(I3F i3f) {
        this.LIZ = i3f;
    }

    @Override // X.HXQ
    public final void LIZ(Bundle bundle) {
        VERecorder vERecorder;
        InterfaceC82086WJm LIZ;
        String str;
        InterfaceC83867Wvn rX;
        o.LJIIIZ(bundle, "bundle");
        I3F i3f = this.LIZ;
        if (i3f.LIZ() == null) {
            return;
        }
        InterfaceC82086WJm LIZ2 = i3f.LIZ();
        if (LIZ2 != null && (rX = LIZ2.rX()) != null) {
            vERecorder = rX.LJ();
        } else {
            vERecorder = null;
        }
        String string = bundle.getString("duet_video_path");
        String string2 = bundle.getString("duet_audio_path");
        if (string == null || vERecorder == null) {
            return;
        }
        Effect effect = (Effect) bundle.getParcelable("duet_layout_effect");
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) i3f.LJLJL.LIZ(i3f, I3F.LJLZ[1]);
        if (interfaceC45999I3n != null) {
            interfaceC45999I3n.Hh0(effect);
        }
        if (string2 == null) {
            string2 = string;
        }
        VEDuetSettings vEDuetSettings = new VEDuetSettings(string, string2, 0.0f, 0.0f, 0.0f, true);
        vEDuetSettings.setEnableV2(true);
        vERecorder.LIZIZ.initDuet(vEDuetSettings);
        try {
            c.LIZ("vesdk_event_recorder_init_duet", "business", new JSONObject(vEDuetSettings.toString()));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        vERecorder.LIZIZ.changeRecordMode(VERecordMode.DUET);
        C82631Wbr c82631Wbr = i3f.LJLJLLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = I3F.LJLZ;
        InterfaceC45979I2t interfaceC45979I2t = (InterfaceC45979I2t) c82631Wbr.LIZ(i3f, interfaceC74236TBoArr[3]);
        if (interfaceC45979I2t != null) {
            InterfaceC45979I2t interfaceC45979I2t2 = (InterfaceC45979I2t) i3f.LJLJLLL.LIZ(i3f, interfaceC74236TBoArr[3]);
            if (interfaceC45979I2t2 == null || (str = interfaceC45979I2t2.getAvailableRecordCombineTag()) == null) {
                str = "";
            }
            interfaceC45979I2t.setCurrentTab(str, true, 5);
        }
        InterfaceC45979I2t interfaceC45979I2t3 = (InterfaceC45979I2t) i3f.LJLJLLL.LIZ(i3f, interfaceC74236TBoArr[3]);
        if (interfaceC45979I2t3 != null) {
            interfaceC45979I2t3.showOnlyVideosTab();
        }
        I3K i3k = (I3K) i3f.LJLJLJ.LIZ(i3f, interfaceC74236TBoArr[2]);
        if (i3k != null) {
            i3k.gd0(false);
        }
        InterfaceC45999I3n interfaceC45999I3n2 = (InterfaceC45999I3n) i3f.LJLJL.LIZ(i3f, interfaceC74236TBoArr[1]);
        if (interfaceC45999I3n2 != null) {
            interfaceC45999I3n2.kY(true, false);
        }
        WRP wrp = (WRP) i3f.LJLL.LIZ(i3f, interfaceC74236TBoArr[4]);
        if (wrp != null) {
            wrp.setFilterDisable(true, "build_in");
        }
        I37 i37 = (I37) i3f.LJLLI.LIZ(i3f, interfaceC74236TBoArr[5]);
        if (i37 != null) {
            i37.Ku(false);
        }
        InterfaceC82086WJm LIZ3 = i3f.LIZ();
        if (LIZ3 != null) {
            LIZ3.T6();
        }
        InterfaceC82086WJm LIZ4 = i3f.LIZ();
        if (LIZ4 != null) {
            LIZ4.y90(EnumC82528WaC.NORMAL);
        }
        ShortVideoContextViewModel shortVideoContextViewModel = i3f.LJLLL;
        if (shortVideoContextViewModel != null) {
            if (shortVideoContextViewModel.LJLIL.LJIIIIZZ() == 0 && (LIZ = i3f.LIZ()) != null) {
                C05L.LIZJ(2, LIZ);
            }
            InterfaceC82400WVo interfaceC82400WVo = (InterfaceC82400WVo) i3f.LJLLJ.LIZ(i3f, interfaceC74236TBoArr[7]);
            if (interfaceC82400WVo != null) {
                C82398WVm.LJI(interfaceC82400WVo, null);
            }
            ShortVideoContextViewModel shortVideoContextViewModel2 = i3f.LJLLL;
            if (shortVideoContextViewModel2 != null) {
                shortVideoContextViewModel2.LJLILLLLZI.put("photo_mode", Boolean.FALSE);
                C45850Hz4 c45850Hz4 = i3f.LJLLLL;
                if (c45850Hz4 != null) {
                    if (c45850Hz4.LIZLLL().mIsFromDraft) {
                        return;
                    }
                    C45850Hz4 c45850Hz42 = i3f.LJLLLL;
                    if (c45850Hz42 != null) {
                        c45850Hz42.LIZLLL().mIsPhotoMvModeMusic = false;
                        return;
                    } else {
                        o.LJIJI("tabEnv");
                        throw null;
                    }
                }
                o.LJIJI("tabEnv");
                throw null;
            }
            o.LJIJI("shortVideoContextViewModel");
            throw null;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }
}
