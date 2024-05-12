package X;

import Y.ARunnableS18S0400000_15;
import Y.ARunnableS8S0301000_7;
import Y.IDRunnableS0S1201000;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.effecteditor.swig.EffectEditorJniJNI;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAsset;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class RunnableC82878Wfq implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Serializable LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ Object LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str = "";
        int i = 0;
        switch (this.LJLIL) {
            case 0:
                XNE xne = (XNE) this.LJLILLLLZI;
                String[] strArr = (String[]) this.LJLJI;
                UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) this.LJLJJI;
                C2V c2v = (C2V) this.LJLJJL;
                U u = xne.LIZJ;
                if (u != 0) {
                    str = ((UIAnnotationAsset) u).getCallbackType();
                }
                if (EffectEditorJniJNI.kUIAnnotationCallbackTypeVlExtra().equals(str)) {
                    if (strArr.length > 0) {
                        String str2 = strArr[0];
                        C82887Wfz.LIZ();
                        C38995FSd.LIZJ().execute(new IDRunnableS0S1201000(str2, 1, xne, c2v, 2));
                        C82887Wfz.LIZIZ();
                        return;
                    }
                    C83573Wr3.LIZ(c2v);
                    C82887Wfz.LIZIZ();
                    return;
                }
                C82887Wfz.LIZ();
                C38995FSd.LIZJ().execute(new ARunnableS18S0400000_15(xne, strArr, c2v, uIAnnotationUpdateType, 7));
                C82887Wfz.LIZIZ();
                return;
            case 1:
                Context context = (Context) this.LJLILLLLZI;
                String str3 = (String) this.LJLJI;
                String key = (String) this.LJLJJI;
                String value = (String) this.LJLJJL;
                o.LJIIIZ(context, "$context");
                o.LJIIIZ(key, "$key");
                o.LJIIIZ(value, "$value");
                try {
                    AccountManager accountManager = AccountManager.get(context);
                    if (str3 != null) {
                        str = str3;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = context.getPackageName();
                        o.LJIIIIZZ(str, "context.packageName");
                    }
                    Account[] LIZIZ = QM5.LIZIZ(accountManager, str);
                    o.LJIIIIZZ(LIZIZ, "accountManager.getAccountsByType(realAccountType)");
                    int length = LIZIZ.length;
                    while (i < length) {
                        Account account = LIZIZ[i];
                        i++;
                        AccountManager.get(context).setUserData(account, key, value);
                    }
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    QM7 qm7 = new QM7();
                    qm7.LIZJ("share_sdk_save_account_info_failed");
                    qm7.LIZIZ(e.getMessage(), "err_msg");
                    qm7.LIZIZ(android.util.Log.getStackTraceString(e), "err_msg_stack");
                    qm7.LIZLLL();
                    return;
                }
            default:
                C82876Wfo this$0 = (C82876Wfo) this.LJLILLLLZI;
                Serializable url = this.LJLJI;
                Object callback = this.LJLJJI;
                String md5 = (String) this.LJLJJL;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(url, "$url");
                o.LJIIIZ(callback, "$callback");
                o.LJIIIZ(md5, "$md5");
                List list = (List) ((LinkedHashMap) this$0.LJLJI).get(url);
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    this$0.LJLJI.put(url, arrayList);
                    arrayList.add(callback);
                    C82869Wfh c82869Wfh = this$0.LJLIL;
                    c82869Wfh.getClass();
                    c82869Wfh.LJII = md5;
                    C44976Hky c44976Hky = (C44976Hky) ((LinkedHashMap) c82869Wfh.LJ).get(url);
                    int i2 = 2;
                    if (c44976Hky != null) {
                        if (c44976Hky.LIZ != null || c44976Hky.LIZIZ != 0) {
                            c82869Wfh.LJFF.post(new ARunnableS8S0301000_7(2, c44976Hky, url, c82869Wfh, 1));
                            return;
                        }
                        return;
                    }
                    c82869Wfh.LIZLLL.add(url);
                    ServiceConnectionC40639FxD serviceConnectionC40639FxD = c82869Wfh.LIZJ;
                    if (serviceConnectionC40639FxD != null) {
                        InterfaceC40638FxC value2 = serviceConnectionC40639FxD.LJLIL.getValue();
                        if (value2 == null) {
                            return;
                        }
                        c82869Wfh.LIZ(value2);
                        return;
                    }
                    Intent intent = new Intent("com.ss.android.ugc.cut_downloader.DOWNLOAD");
                    intent.setComponent(c82869Wfh.LIZIZ);
                    intent.setPackage(c82869Wfh.LIZ.getPackageName());
                    List<ResolveInfo> queryIntentServices = c82869Wfh.LIZ.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices.size() > 0) {
                        intent.setComponent(new ComponentName(((ResolveInfo) ListProtector.get(queryIntentServices, 0)).serviceInfo.packageName, ((ResolveInfo) ListProtector.get(queryIntentServices, 0)).serviceInfo.name));
                        ServiceConnectionC40639FxD serviceConnectionC40639FxD2 = new ServiceConnectionC40639FxD(new MutableLiveData());
                        if (C16880lQ.LLLJL(c82869Wfh.LIZ, intent, serviceConnectionC40639FxD2, 1)) {
                            c82869Wfh.LIZJ = serviceConnectionC40639FxD2;
                            serviceConnectionC40639FxD2.LJLIL.observeForever(new C82867Wff(i2, c82869Wfh));
                            return;
                        }
                    }
                    for (String str4 : c82869Wfh.LIZLLL) {
                        C82876Wfo c82876Wfo = c82869Wfh.LJI;
                        if (c82876Wfo != null) {
                            c82876Wfo.onError(-11, str4);
                        }
                    }
                    c82869Wfh.LIZLLL.clear();
                    return;
                }
                list.add(callback);
                return;
        }
    }

    public /* synthetic */ RunnableC82878Wfq(Object obj, Serializable serializable, Object obj2, Object obj3, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = serializable;
        this.LJLJJI = obj2;
        this.LJLJJL = obj3;
    }
}
