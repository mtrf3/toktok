package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.pumbaa.hybrid.base.BridgeConfig;
import com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fez, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39509Fez extends C39586FgE {
    public final /* synthetic */ BridgeConfig LJLJLJ;

    @Override // X.C39586FgE
    public final void LIZLLL() {
        Iterator<C39514Ff4> it;
        WebView webView = this.LJLJJI;
        o.LJIIIIZZ(webView, "webView");
        Object tag = webView.getTag(R.id.nhy);
        if (!C65777Prh.LJI(tag)) {
            tag = null;
        }
        List list = (List) tag;
        if (list != null) {
            for (Object obj : list) {
                List<C39514Ff4> list2 = C39516Ff6.LIZ.get(obj);
                if (list2 != null && (it = list2.iterator()) != null) {
                    while (it.hasNext()) {
                        if (o.LJ(it.next().LJLIL, webView)) {
                            it.remove();
                        }
                    }
                }
                ConcurrentHashMap<Object, List<C39514Ff4>> concurrentHashMap = C39516Ff6.LIZ;
                List<C39514Ff4> list3 = concurrentHashMap.get(obj);
                if (list3 == null || list3.isEmpty()) {
                    concurrentHashMap.remove(obj);
                }
            }
        }
        super.LIZLLL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39509Fez(BridgeConfig bridgeConfig) {
        super(7);
        this.LJLJLJ = bridgeConfig;
    }

    @Override // X.C39586FgE
    public final void LJIIJ(String str) {
        if (this.LJLJLJ.enable && str != null && ujb.o.LJJJLIIL(str, "javascript:", false)) {
            BridgeHookDispatcher.INSTANCE.hookWebCallback(str, null);
        }
        super.LJIIJ(str);
    }

    @Override // X.C39586FgE
    public final void LIZ(Object jsiObject, String name) {
        o.LJIIIZ(jsiObject, "jsiObject");
        o.LJIIIZ(name, "name");
        if (this.LJLJLJ.enable) {
            WebView webView = this.LJLJJI;
            o.LJIIIIZZ(webView, "webView");
            Object tag = webView.getTag(R.id.nhy);
            if (!C65777Prh.LJI(tag)) {
                tag = null;
            }
            List list = (List) tag;
            if (list == null) {
                list = new ArrayList();
            }
            int hashCode = jsiObject.hashCode();
            list.add(Integer.valueOf(hashCode));
            webView.setTag(R.id.nhy, list);
            ConcurrentHashMap<Object, List<C39514Ff4>> concurrentHashMap = C39516Ff6.LIZ;
            if (concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                List<C39514Ff4> list2 = concurrentHashMap.get(Integer.valueOf(hashCode));
                if (list2 != null) {
                    list2.add(new C39514Ff4(webView, name));
                }
            } else {
                Integer valueOf = Integer.valueOf(hashCode);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C39514Ff4(webView, name));
                concurrentHashMap.put(valueOf, arrayList);
            }
        }
        super.LIZ(jsiObject, name);
    }

    @Override // X.C39586FgE
    public final void LJ(ValueCallback valueCallback, String str) {
        if (this.LJLJLJ.enable) {
            BridgeHookDispatcher.INSTANCE.hookWebCallback(str, valueCallback);
        }
        super.LJ(valueCallback, str);
    }
}
