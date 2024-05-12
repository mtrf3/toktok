package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import X.C16880lQ;
import X.C207668Da;
import Y.ARunnableS3S1200000_4;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InteractStickerViewModel extends ViewModel {
    public InteractStickerWidget LJLJI;
    public Thread LJLJJI;
    public final HashMap<String, Object> LJLIL = new HashMap<>();
    public final HashMap<String, NextLiveData<C207668Da>> LJLILLLLZI = new HashMap<>();
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLIL.clear();
        this.LJLILLLLZI.clear();
        this.LJLJI = null;
    }

    public final <T> T get(String str) {
        T t = (T) this.LJLIL.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public final void gv0(String str, Observer observer) {
        o.LJIIIZ(observer, "observer");
        hv0(str, observer, false);
    }

    public final void iv0(Object obj, String key) {
        o.LJIIIZ(key, "key");
        if (this.LJLJJI == null) {
            this.LJLJJI = C16880lQ.LLJJJJ().getThread();
        }
        if (C16880lQ.LLLLIIIILLL() == this.LJLJJI) {
            this.LJLIL.put(key, obj);
            NextLiveData<C207668Da> nextLiveData = this.LJLILLLLZI.get(key);
            if (nextLiveData != null) {
                nextLiveData.setValue(new C207668Da(key, obj));
                return;
            }
            return;
        }
        this.LJLJJL.post(new ARunnableS3S1200000_4(this, key, obj, 2));
    }

    public final void hv0(String str, Observer observer, boolean z) {
        if (TextUtils.isEmpty(str) || observer == null) {
            return;
        }
        NextLiveData<C207668Da> nextLiveData = this.LJLILLLLZI.get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData<>();
            if (this.LJLIL.containsKey(str)) {
                nextLiveData.setValue(new C207668Da(str, this.LJLIL.get(str)));
            }
            this.LJLILLLLZI.put(str, nextLiveData);
        }
        InteractStickerWidget interactStickerWidget = this.LJLJI;
        o.LJI(interactStickerWidget);
        nextLiveData.observe(interactStickerWidget, observer, z);
    }
}
