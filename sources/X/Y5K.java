package X;

import Y.AObserverS83S0100000_15;
import Y.ARunnableS15S1100000_14;
import Y.IDeS405S0100000_15;
import android.R;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import ij2.a;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;
import wi2.d;

/* loaded from: classes16.dex */
public class Y5K extends C29S implements SensorEventListener {
    public OcrViewModel LJLIL;
    public SensorManager LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public boolean LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public Y5V LJLL;
    public Y5O LJLLI;
    public Sensor LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public long LJLLLLLL;
    public AbstractC156986Ec LJLJJL = Y6M.LIZIZ;
    public final long LJLZ = System.currentTimeMillis();

    public void LJII() {
    }

    public void LJIJ() {
    }

    public final void LLFII() {
        this.LJLJLJ = true;
        a.LJIIIIZZ(a.LJIJ, "payin_checkout_ocr", "back", null, null, null, 60);
    }

    public final void LLIZLLLIL() {
        if (isFinishing()) {
            return;
        }
        a aVar = a.LJIJ;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("go_setting", "cancel");
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIL(currentTimeMillis, "ocr_camera_access_fail", LJJIJIIJI);
        DialogC81623W1r.LIZ(this, C82951Wh1.LIZ("pipo_payin_instruction_OCR_refused_camera_title"), LLIIIJ("pipo_payin_instruction_OCR_refused_camera_content"), C82951Wh1.LIZ("pipo_payin_instruction_OCR_refused_setting"), C82951Wh1.LIZ("pipo_payin_instruction_OCR_refused_gotit"), new Y5S(this));
    }

    public final void LLJILLL() {
        if (isFinishing()) {
            return;
        }
        a aVar = a.LJIJ;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("go_setting", "cancel");
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIL(currentTimeMillis, "ocr_album_access_fail", LJJIJIIJI);
        DialogC81623W1r.LIZ(this, C82951Wh1.LIZ("pipo_payin_instruction_OCR_refused_album_title"), LLIIIJ("pipo_payin_instruction_OCR_refused_album_content"), C82951Wh1.LIZ("pipo_payin_instruction_OCR_refused_setting"), C82951Wh1.LIZ("pipo_payin_instruction_OCR_refused_gotit"), new Y5Q(this));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    public final void LLII() {
        OcrViewModel ocrViewModel = this.LJLIL;
        if (ocrViewModel != null) {
            ocrViewModel.LJLILLLLZI = System.currentTimeMillis();
            LLILIL();
            if (Build.VERSION.SDK_INT > 33) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                C78598Ut0.LJIJJ(intent, this);
                startActivityForResult(intent, 252);
                return;
            } else {
                Intent intent2 = new Intent();
                intent2.setType("image/*");
                intent2.setAction("android.intent.action.PICK");
                Intent createChooser = Intent.createChooser(intent2, "");
                C78598Ut0.LJIJJ(createChooser, this);
                startActivityForResult(createChooser, 252);
                return;
            }
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public final Y5V LLIIIZ() {
        Y5V y5v = this.LJLL;
        if (y5v != null) {
            return y5v;
        }
        o.LJIJI("mOcrCameraPreview");
        throw null;
    }

    public final void LLIILII() {
        OHI.LIZ.getClass();
        if (OHI.LJ(this, "android.permission.CAMERA")) {
            Y5V y5v = this.LJLL;
            if (y5v != null) {
                y5v.LIZJ();
                this.LJLLL = false;
                return;
            } else {
                o.LJIJI("mOcrCameraPreview");
                throw null;
            }
        }
        if (this.LJLJLLL) {
            return;
        }
        a aVar = a.LJIJ;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("always_allow", "forbid", "do_not_ask_again");
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIL(currentTimeMillis, "ocr_camera_request_permission", LJJIJIIJI);
        C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
        Cert cert = a.LIZJ().LJFF;
        o.LJIIIIZZ(cert, "PipoOcrService.getConfiguration().mCameraOpenCert");
        c61098NyQ.LIZIZ(this, cert).LIZ("android.permission.CAMERA").LIZJ(new IDeS405S0100000_15(this, 1));
        this.LJLJLLL = true;
    }

    public final void LLIL() {
        String str;
        OHI ohi = OHI.LIZ;
        int i = Build.VERSION.SDK_INT;
        String str2 = "android.permission.READ_MEDIA_IMAGES";
        if (i >= 33) {
            str = "android.permission.READ_MEDIA_IMAGES";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        ohi.getClass();
        if (OHI.LJ(this, str)) {
            LLII();
            return;
        }
        a aVar = a.LJIJ;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("always_allow", "forbid", "do_not_ask_again");
        long currentTimeMillis = System.currentTimeMillis();
        aVar.getClass();
        a.LJIIL(currentTimeMillis, "ocr_album_request_permission", LJJIJIIJI);
        C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
        Cert cert = a.LIZJ().LJII;
        o.LJIIIIZZ(cert, "PipoOcrService.getConfiguration().mStorageBpeaCert");
        C61099NyR LIZIZ = c61098NyQ.LIZIZ(this, cert);
        String[] strArr = new String[1];
        if (i < 33) {
            str2 = "android.permission.READ_EXTERNAL_STORAGE";
        }
        strArr[0] = str2;
        LIZIZ.LIZ(strArr).LIZJ(new IDeS405S0100000_15(this, 2));
    }

    public void LLILIL() {
        Y5V y5v = this.LJLL;
        if (y5v != null) {
            y5v.LIZ();
            Y5V y5v2 = this.LJLL;
            if (y5v2 != null) {
                Y5W y5w = y5v2.LLFII;
                if (y5w != null) {
                    C79043V0l.LJJIIJZLJL();
                    y5w.LJIIIZ = 0;
                    synchronized (y5w.LIZJ) {
                        y5w.LIZIZ = false;
                    }
                    y5v2.LLFII = null;
                    return;
                }
                return;
            }
            o.LJIJI("mOcrCameraPreview");
            throw null;
        }
        o.LJIJI("mOcrCameraPreview");
        throw null;
    }

    public final void LLILLIZIL() {
        Y5V y5v = this.LJLL;
        if (y5v != null) {
            Y60 y60 = y5v.LJLIL;
            if (y60 == null || y60.LJI || y60.LIZ == null || !y60.LJFF) {
                return;
            }
            y60.LIZ.LIZIZ(y60.LJIIL);
            return;
        }
        o.LJIJI("mOcrCameraPreview");
        throw null;
    }

    public void LLILLJJLI() {
        Y5V y5v = this.LJLL;
        if (y5v != null) {
            y5v.LIZJ();
            Y5V y5v2 = this.LJLL;
            if (y5v2 != null) {
                y5v2.LJI();
                return;
            } else {
                o.LJIJI("mOcrCameraPreview");
                throw null;
            }
        }
        o.LJIJI("mOcrCameraPreview");
        throw null;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        SensorManager sensorManager = this.LJLILLLLZI;
        if (sensorManager != null && !new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{this}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;)V", "8071451674755920392")).LIZ) {
            sensorManager.unregisterListener(this);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void finish() {
        int i;
        super.finish();
        if (!this.LJLJJLL) {
            if (this.LJLLL) {
                i = 104;
            } else {
                i = 105;
            }
            LLILZ(0, Integer.valueOf(i));
            a.LJIJ.LIZ(0, i, "user cancel", null, "unknown");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LLFII();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        String str;
        String str2;
        this.LJLJJI = System.currentTimeMillis();
        a aVar = a.LJIJ;
        if (!isFinishing()) {
            str = "kill";
        } else if (this.LJLJLJ) {
            str = "back";
        } else {
            str = "result";
        }
        long j = this.LJLLLLLL;
        long j2 = this.LJLJJI;
        long j3 = j2 - this.LJLZ;
        AbstractC156986Ec ocrSource = this.LJLJJL;
        long j4 = this.LJLJI;
        String str3 = this.LJLJL;
        if (str3 == null) {
            str3 = "undefined error";
        }
        aVar.getClass();
        o.LJIIIZ(ocrSource, "ocrSource");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", "payin_checkout_ocr");
        jSONObject.put("finish_type", str);
        jSONObject.put("timestamp", j2);
        jSONObject.put("stay_time", j3);
        a.LJIILJJIL("fp_sdk_checkout_page_finish", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_timestamp", j);
        jSONObject2.put("leave_timestamp", j2);
        jSONObject2.put("ocr_duration", j3);
        jSONObject2.put("ocr_type", a.LJ(a.LJIIJJI));
        jSONObject2.put("user_choose_type", ocrSource.LIZ);
        jSONObject2.put("ocr_result", str3);
        String str4 = CardStruct.IStatusCode.DEFAULT;
        jSONObject2.put("is_name_success", CardStruct.IStatusCode.DEFAULT);
        if (j4 != 0) {
            jSONObject2.put("card_first_recognize_timestamp", j4);
        }
        long j5 = a.LJIIIZ;
        if (j5 != 0) {
            jSONObject2.put("card_first_cut_timestamp", j5);
        }
        long j6 = a.LJIIIIZZ;
        if (j6 != 0) {
            jSONObject2.put("text_start_timestamp", j6);
        }
        long j7 = a.LJIIJ;
        if (j7 != 0) {
            jSONObject2.put("card_number_recognize_timestamp", j7);
            jSONObject2.put("expire_date_recognize_timestamp", a.LJIIJ);
        }
        if (a.LJIIL) {
            str4 = "1";
        }
        jSONObject2.put("is_expire_date_success", str4);
        d dVar = a.LJII;
        if (dVar != null) {
            str2 = dVar.LIZ;
        } else {
            str2 = null;
        }
        jSONObject2.put("ocr_scenario", str2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("enter_ocr_type", a.LJIILIIL);
        jSONObject3.put("first_use_ocr_type", a.LJIILJJIL);
        String str5 = a.LJIILL;
        if (str5 != null) {
            jSONObject3.put("actual_ocr_type", str5);
        }
        a.LJIILJJIL("rd_pipo_complete_ocr_scan", jSONObject3);
        a.LJIILJJIL("fp_sdk_ocr_card_info_recognize", jSONObject2);
        Y5O y5o = this.LJLLI;
        if (y5o != null) {
            if (y5o.LIZIZ()) {
                VKB LIZ = VKB.LIZ(y5o.LIZ);
                LIZ.getClass();
                LIZ.LIZJ.LJIJ(y5o);
            }
            super.onDestroy();
            return;
        }
        o.LJIJI("mCaptureExtender");
        throw null;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        super.onResume();
        a.LJIJ.getClass();
        a.LJIIZILJ = 0;
        SensorManager sensorManager = this.LJLILLLLZI;
        if (sensorManager != null) {
            Sensor sensor = this.LJLLILLLL;
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100700, "android/hardware/SensorManager", "registerListener", sensorManager, new Object[]{this, sensor, 3}, "boolean", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z", "8071451674755920392"));
            if (LIZJ.LIZ) {
                ((Boolean) LIZJ.LIZIZ).booleanValue();
            } else {
                sensorManager.registerListener(this, sensor, 3);
            }
        }
    }

    public final void LLFZ(int i) {
        Y5V y5v = this.LJLL;
        if (y5v != null) {
            Y60 y60 = y5v.LJLIL;
            if (y60 == null || y60.LJI || y60.LIZ == null || !y60.LJFF) {
                return;
            }
            RunnableC86812Y5g runnableC86812Y5g = y60.LJIILIIL;
            runnableC86812Y5g.LJLIL = i;
            y60.LIZ.LIZIZ(runnableC86812Y5g);
            return;
        }
        o.LJIJI("mOcrCameraPreview");
        throw null;
    }

    public final C66426Q5e LLIIIILZ(View view) {
        Resources resources = getResources();
        o.LJIIIIZZ(resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f = i;
            float f2 = i2;
            return new C66426Q5e(view.getLeft() / f, view.getTop() / f2, view.getWidth() / f, view.getHeight() / f2, i, i2);
        }
        return null;
    }

    public final String LLIIIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String LIZ = C82951Wh1.LIZ(str);
        if (s.LJJJLZIJ(LIZ, "{APPname}", false)) {
            try {
                Context applicationContext = getApplicationContext();
                if (C38891fp.LJLJI && applicationContext == null) {
                    applicationContext = C38891fp.LJLILLLLZI;
                }
                o.LJIIIIZZ(applicationContext, "applicationContext");
                PackageManager packageManager = applicationContext.getPackageManager();
                Context applicationContext2 = getApplicationContext();
                if (C38891fp.LJLJI && applicationContext2 == null) {
                    applicationContext2 = C38891fp.LJLILLLLZI;
                }
                o.LJIIIIZZ(applicationContext2, "applicationContext");
                LIZ = ujb.o.LJJJJZ(LIZ, "{APPname}", packageManager.getApplicationLabel(applicationContext2.getApplicationInfo()).toString(), false);
                return LIZ;
            } catch (Exception unused) {
                return ujb.o.LJJJJZ(LIZ, ">\"{APPname}\"", "", false);
            }
        }
        return LIZ;
    }

    public void LLJILJILJ(String str) {
        runOnUiThread(new ARunnableS15S1100000_14(this, str, 15));
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        Sensor sensor;
        super.onCreate(bundle);
        Application application = getApplication();
        o.LJIIIIZZ(application, "this.application");
        ViewModel viewModel = new ViewModelProvider(this, new C72328Sa4(application)).get(OcrViewModel.class);
        o.LJIIIIZZ(viewModel, "ViewModelProvider(\n     …OcrViewModel::class.java)");
        this.LJLIL = (OcrViewModel) viewModel;
        Y5O y5o = new Y5O(this);
        this.LJLLI = y5o;
        if (y5o.LIZIZ()) {
            Y5N y5n = new Y5N(this);
            y5o.LIZIZ = y5n;
            y5n.LJLJLJ = new Y6K(y5o);
            VKB LIZ = VKB.LIZ(this);
            LIZ.getClass();
            LIZ.LIZJ.LJIIZILJ(y5o);
        }
        Window window = getWindow();
        window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        o.LJIIIIZZ(decorView, "window.decorView");
        View decorView2 = window.getDecorView();
        o.LJIIIIZZ(decorView2, "window.decorView");
        decorView.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 256 | 1024);
        View childAt = ((ViewGroup) window.findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            C16340kY.LIZJ(childAt);
        }
        Resources resources = getResources();
        o.LJIIIIZZ(resources, "context.resources");
        if ((resources.getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 23) {
                Window window2 = getWindow();
                o.LJIIIIZZ(window2, "activity.window");
                LLILLL(window2, false);
            } else {
                String str = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str)) {
                    ujb.o.LJJJJIZL("Meizu", str, true);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            Window window3 = getWindow();
            o.LJIIIIZZ(window3, "activity.window");
            LLILLL(window3, true);
        } else {
            String str2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str2)) {
                ujb.o.LJJJJIZL("Meizu", str2, true);
            }
        }
        Object systemService = getSystemService("sensor");
        if (!(systemService instanceof SensorManager)) {
            systemService = null;
        }
        SensorManager sensorManager = (SensorManager) systemService;
        this.LJLILLLLZI = sensorManager;
        if (sensorManager != null) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = {5};
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "8071451674755920392");
            C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
            if (LIZJ.LIZ) {
                c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
                sensor = (Sensor) LIZJ.LIZIZ;
            } else {
                sensor = sensorManager.getDefaultSensor(5);
                c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensor, objArr, sensorManager, c65300Pk0, true);
            }
        } else {
            sensor = null;
        }
        this.LJLLILLLL = sensor;
        OcrViewModel ocrViewModel = this.LJLIL;
        if (ocrViewModel != null) {
            ocrViewModel.LJLIL.observe(this, new AObserverS83S0100000_15(this, 91));
        } else {
            o.LJIJI("viewModel");
            throw null;
        }
    }

    public static void LLILLL(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            o.LJIIIIZZ(decorView, "window.decorView");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | FileUtils.BUFFER_SIZE;
            } else {
                i = systemUiVisibility & (-8193);
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    public final void LLILZ(Integer num, Integer num2) {
        String str;
        if (num == null || num.intValue() != 1) {
            if (num2 != null) {
                if (num2.intValue() == 105) {
                    str = "cancel";
                } else if (num2.intValue() == 102) {
                    str = "service busy";
                } else if (num2.intValue() == 104) {
                    str = "permission denied";
                } else if (num2.intValue() == 101 || num2.intValue() == 103 || num2.intValue() == 108 || num2.intValue() == 106 || num2.intValue() == 107) {
                    str = "system error";
                }
                this.LJLJL = str;
                return;
            }
            str = "undefined error";
            this.LJLJL = str;
            return;
        }
        this.LJLJL = "success";
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        android.net.Uri data;
        super.onActivityResult(i, i2, intent);
        if (i == 252) {
            if (i2 == -1) {
                this.LJLJJL = Y6L.LIZIZ;
                if (intent != null && (data = intent.getData()) != null) {
                    LJII();
                    OcrViewModel ocrViewModel = this.LJLIL;
                    if (ocrViewModel != null) {
                        XIA dispatcher = C78613UtF.LIZJ;
                        o.LJIIIZ(dispatcher, "dispatcher");
                        XKX.LIZLLL(ViewModelKt.getViewModelScope(ocrViewModel), dispatcher, null, new Y5M(ocrViewModel, data, null), 2);
                        return;
                    }
                    o.LJIJI("viewModel");
                    throw null;
                }
                LLIIJI(0, 108, "choose image uri null", null, "scan");
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("choose phone not ok : ");
            LIZ.append(i2);
            X1D.LIZIZ(LIZ);
            LLILLJJLI();
        }
    }

    public void LLIIJI(int i, int i2, String str, PipoOcrResult pipoOcrResult, String type) {
        o.LJIIIZ(type, "type");
        runOnUiThread(new Y5P(this, i, i2, str, pipoOcrResult, type));
    }
}
