package X;

import Y.IDComparatorS338S0100000_5;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ci4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32056Ci4 extends AbstractC32057Ci5 implements InterfaceC31231CNn {
    public InterfaceC32060Ci8 LJLJJLL;
    public CompletionBlock<InterfaceC32058Ci6> LJLJL;
    public final int LJLJJL = 40003;
    public final String LJLJLJ = "ChooseImageForGameMethod";

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity LIZLLL;
        String str;
        Object obj;
        SparkContext sparkContext;
        InterfaceC32060Ci8 interfaceC32060Ci8 = (InterfaceC32060Ci8) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
            this.LJLJJLL = interfaceC32060Ci8;
            this.LJLJL = c37356ElM;
            C39359FcZ c39359FcZ = SparkContext.Companion;
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            Fragment fragment = null;
            if (interfaceC38263Ezz2 != null) {
                str = interfaceC38263Ezz2.LIZIZ();
            } else {
                str = null;
            }
            c39359FcZ.getClass();
            C60737Nsb LIZIZ = C39359FcZ.LIZIZ(str);
            if ((LIZIZ instanceof SparkContext) && (sparkContext = (SparkContext) LIZIZ) != null) {
                obj = sparkContext.LJIILL();
            } else {
                obj = null;
            }
            if (obj instanceof SparkPopup) {
                fragment = (Fragment) obj;
            }
            C31947CgJ.LJIIIIZZ(this.LJLJJL, LIZLLL, fragment);
            if (obj instanceof InterfaceC32055Ci3) {
                ((InterfaceC32055Ci3) obj).ec(new C32061Ci9(this));
            }
        }
    }

    @Override // X.InterfaceC31231CNn
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC38263Ezz interfaceC38263Ezz;
        Activity LIZLLL;
        InputStream inputStream;
        Integer num;
        Integer num2;
        Integer num3;
        View view;
        InterfaceC32060Ci8 interfaceC32060Ci8;
        Number maxSize;
        Number maxSize2;
        Number maxSize3;
        if (i == this.LJLJJL && (interfaceC38263Ezz = this.LJLIL) != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
            if (i2 != -1 || intent == null || intent.getData() == null) {
                C30868C9o.LJFF(C16880lQ.LLLLL(LIZLLL), C15380j0.LJIILJJIL(R.string.t01));
                return;
            }
            android.net.Uri data = intent.getData();
            if (data == null) {
                return;
            }
            InputStream inputStream2 = null;
            String str = null;
            inputStream2 = null;
            try {
            } catch (Exception e) {
                C0NB.LJ(this.LJLJLJ, e.toString());
            }
            if (BitmapFactory.decodeStream(LIZLLL.getContentResolver().openInputStream(data)) != null) {
                try {
                    try {
                        inputStream = LIZLLL.getContentResolver().openInputStream(data);
                        if (inputStream == null) {
                            num = null;
                        } else {
                            try {
                                num = Integer.valueOf(inputStream.available());
                            } catch (Exception e2) {
                                e = e2;
                                inputStream2 = inputStream;
                                C16880lQ.LLLLIIL(e);
                                C30868C9o.LJFF(C16880lQ.LLLLL(LIZLLL), C15380j0.LJIILJJIL(R.string.t01));
                                if (inputStream2 == null) {
                                    return;
                                }
                                inputStream2.close();
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        }
                        String str2 = this.LJLJLJ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("fileSize: ");
                        LIZ.append(num);
                        LIZ.append(", maxSize: ");
                        InterfaceC32060Ci8 interfaceC32060Ci82 = this.LJLJJLL;
                        if (interfaceC32060Ci82 != null && (maxSize3 = interfaceC32060Ci82.getMaxSize()) != null) {
                            num2 = Integer.valueOf(maxSize3.intValue());
                        } else {
                            num2 = null;
                        }
                        LIZ.append(num2);
                        C0NB.LIZIZ(str2, X1D.LIZIZ(LIZ));
                        InterfaceC32060Ci8 interfaceC32060Ci83 = this.LJLJJLL;
                        if (interfaceC32060Ci83 != null && (maxSize2 = interfaceC32060Ci83.getMaxSize()) != null) {
                            num3 = Integer.valueOf(maxSize2.intValue());
                        } else {
                            num3 = null;
                        }
                        if (new IDComparatorS338S0100000_5(0).compare(num3, num) < 0) {
                            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
                            if (interfaceC38263Ezz2 != null && (view = interfaceC38263Ezz2.getView()) != null && (interfaceC32060Ci8 = this.LJLJJLL) != null && (maxSize = interfaceC32060Ci8.getMaxSize()) != null) {
                                int intValue = maxSize.intValue();
                                C26045AKb c26045AKb = new C26045AKb(view);
                                c26045AKb.LJIIIZ(C15380j0.LJIILL(R.string.svb, Integer.valueOf((intValue / 1024) / 1024)));
                                c26045AKb.LJIIJ();
                            }
                            CompletionBlock<InterfaceC32058Ci6> completionBlock = this.LJLJL;
                            if (completionBlock != null) {
                                C31626Cb8.LIZ(completionBlock, 0, "request error.", 4);
                            }
                            if (inputStream == null) {
                                return;
                            }
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("uri", data);
                            jSONObject.put("file_name", data.getPath());
                            XBaseModel LIZJ = ED5.LIZJ(InterfaceC32058Ci6.class, null);
                            InterfaceC32058Ci6 interfaceC32058Ci6 = (InterfaceC32058Ci6) LIZJ;
                            InterfaceC32059Ci7[] interfaceC32059Ci7Arr = new InterfaceC32059Ci7[1];
                            XBaseModel LIZJ2 = ED5.LIZJ(InterfaceC32059Ci7.class, null);
                            InterfaceC32059Ci7 interfaceC32059Ci7 = (InterfaceC32059Ci7) LIZJ2;
                            interfaceC32059Ci7.setPath(jSONObject.toString());
                            if (num != null) {
                                str = num.toString();
                            }
                            interfaceC32059Ci7.setSize(str);
                            interfaceC32059Ci7.setBase64Data("");
                            interfaceC32059Ci7Arr[0] = (InterfaceC32059Ci7) LIZJ2;
                            interfaceC32058Ci6.setTempFiles(C47261Igj.LJII(interfaceC32059Ci7Arr));
                            InterfaceC32058Ci6 interfaceC32058Ci62 = (InterfaceC32058Ci6) LIZJ;
                            CompletionBlock<InterfaceC32058Ci6> completionBlock2 = this.LJLJL;
                            if (completionBlock2 != null) {
                                completionBlock2.onSuccess(interfaceC32058Ci62, "");
                            }
                            if (inputStream == null) {
                                return;
                            }
                        }
                        inputStream.close();
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                }
            } else {
                C0NB.LIZIZ(this.LJLJLJ, "bitmap is null, pic doesn't exist.");
                KL2.LJ(LIZLLL, R.drawable.cpa, LIZLLL.getString(R.string.t00));
                C30868C9o.LJFF(C16880lQ.LLLLL(LIZLLL), C15380j0.LJIILJJIL(R.string.t01));
            }
        }
    }
}
