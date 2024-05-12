package com.ss.android.ugc.aweme.shortvideo.inlinecaption.als;

import X.AnonymousClass694;
import X.AnonymousClass695;
import X.C29901Fi;
import X.C6AT;
import X.C6AY;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditCaptionFontViewModel extends LifecycleAwareViewModel<EditCaptionFontState> implements C6AT {
    public List<TextStickerData> LJLJL = new ArrayList();
    public final MutableLiveData<Integer> LJLJLJ = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJLLL = new MutableLiveData<>();
    public final MutableLiveData<OSZ<String, Integer>> LJLL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLLI = new MutableLiveData<>();
    public final MutableLiveData<C6AY> LJLLILLLL = new MutableLiveData<>();
    public final C29901Fi<ArrayList<TextStickerData>> LJLLJ;
    public final LiveEvent<ArrayList<TextStickerData>> LJLLL;
    public boolean LJLLLL;

    @Override // X.C6AT
    public void hide() {
        this.LJLLLL = false;
        setStateImmediate(AnonymousClass694.LJLIL);
    }

    @Override // X.C6AT
    public void show() {
        this.LJLLLL = true;
        setStateImmediate(AnonymousClass695.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public EditCaptionFontState kv0() {
        return new EditCaptionFontState(null, 1, 0 == true ? 1 : 0);
    }

    public EditCaptionFontViewModel() {
        C29901Fi<ArrayList<TextStickerData>> c29901Fi = new C29901Fi<>();
        this.LJLLJ = c29901Fi;
        this.LJLLL = c29901Fi;
    }

    @Override // X.C6AT
    public MutableLiveData<Integer> E0() {
        return this.LJLJLJ;
    }

    @Override // X.C6AT
    public MutableLiveData<Integer> J9() {
        return this.LJLLI;
    }

    @Override // X.C6AT
    public boolean LLIIIJ() {
        return this.LJLLLL;
    }

    @Override // X.C6AT
    public LiveEvent<ArrayList<TextStickerData>> Ug() {
        return this.LJLLL;
    }

    @Override // X.C6AT
    public MutableLiveData<C6AY> VI() {
        return this.LJLLILLLL;
    }

    @Override // X.C6AT
    public MutableLiveData<OSZ<String, Integer>> p3() {
        return this.LJLL;
    }

    @Override // X.C6AT
    public MutableLiveData<Integer> z1() {
        return this.LJLJLLL;
    }

    @Override // X.C6AT
    public void D0(int i) {
        E0().setValue(Integer.valueOf(i));
    }

    @Override // X.C6AT
    public void Gn0(C6AY captionFont) {
        o.LJIIIZ(captionFont, "captionFont");
        VI().setValue(captionFont);
    }

    @Override // X.C6AT
    public void HG(ArrayList<TextStickerData> list) {
        o.LJIIIZ(list, "list");
        this.LJLLJ.LJII(list);
    }

    public final void Kv0(List<TextStickerData> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJL = list;
    }

    @Override // X.C6AT
    public void u8(int i) {
        z1().setValue(Integer.valueOf(i));
    }

    @Override // X.C6AT
    public void v2(int i) {
        J9().setValue(Integer.valueOf(i));
    }

    @Override // X.C6AT
    public void Gn(String type, int i) {
        o.LJIIIZ(type, "type");
        p3().setValue(new OSZ<>(type, Integer.valueOf(i)));
    }
}
