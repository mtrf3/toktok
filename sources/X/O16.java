package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.ValueCallback;

/* loaded from: classes11.dex */
public final class O16 implements InterfaceC78910Uy2 {
    public final /* synthetic */ ValueCallback LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ O17 LIZJ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        this.LIZ.onReceiveValue(null);
        this.LIZJ.LIZ = null;
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        O17 o17 = this.LIZJ;
        o17.LIZ = this.LIZ;
        String str = this.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        try {
            String str3 = str.split(";")[0];
            if (TextUtils.isEmpty("")) {
                str2 = "filesystem";
            }
            o17.LIZLLL = null;
            if (str3.equals("image/*")) {
                if (str2.equals("camera")) {
                    Intent LIZ = o17.LIZ();
                    LIZ.putExtra("pns.sandbox.dataflow_id", 1207965441);
                    o17.LJFF(LIZ);
                } else {
                    Intent LIZIZ = O17.LIZIZ(o17.LIZ());
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("image/*");
                    LIZIZ.putExtra("android.intent.extra.INTENT", intent);
                    LIZIZ.putExtra("pns.sandbox.dataflow_id", 1207965185);
                    o17.LJFF(LIZIZ);
                }
            } else if (str3.equals("video/*")) {
                if (str2.equals("camcorder")) {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent2.putExtra("pns.sandbox.dataflow_id", 1207965442);
                    o17.LJFF(intent2);
                } else {
                    Intent LIZIZ2 = O17.LIZIZ(new Intent("android.media.action.VIDEO_CAPTURE"));
                    Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                    intent3.addCategory("android.intent.category.OPENABLE");
                    intent3.setType("video/*");
                    LIZIZ2.putExtra("android.intent.extra.INTENT", intent3);
                    LIZIZ2.putExtra("pns.sandbox.dataflow_id", 1207965185);
                    o17.LJFF(LIZIZ2);
                }
            } else if (str3.equals("audio/*")) {
                if (str2.equals("microphone")) {
                    Intent intent4 = new Intent("android.provider.MediaStore.RECORD_SOUND");
                    intent4.putExtra("pns.sandbox.dataflow_id", 1207964417);
                    o17.LJFF(intent4);
                } else {
                    Intent LIZIZ3 = O17.LIZIZ(new Intent("android.provider.MediaStore.RECORD_SOUND"));
                    Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                    intent5.addCategory("android.intent.category.OPENABLE");
                    intent5.setType("audio/*");
                    LIZIZ3.putExtra("android.intent.extra.INTENT", intent5);
                    LIZIZ3.putExtra("pns.sandbox.dataflow_id", 1207965185);
                    o17.LJFF(LIZIZ3);
                }
            } else {
                o17.LJFF(o17.LIZJ());
            }
        } catch (ActivityNotFoundException unused) {
            o17.LJ = true;
            o17.LJFF(o17.LIZJ());
        } catch (ActivityNotFoundException | Exception unused2) {
        }
    }

    public O16(O17 o17, ValueCallback valueCallback, String str) {
        this.LIZJ = o17;
        this.LIZ = valueCallback;
        this.LIZIZ = str;
    }
}
