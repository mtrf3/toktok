package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.ArrayMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import defpackage.a1;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.KMa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51576KMa extends C51583KMh {
    public static boolean LLIILZL;
    public static boolean LLIIZ;
    public String LLIIJLIL;
    public static boolean LLIIL = true;
    public static final ArrayMap<String, SoftReference<InterfaceC46330IGg>> LLIILII = new ArrayMap<>();
    public static final C62822Ol8 LLIL = C221108m2.LIZIZ(C51579KMd.LJLIL);

    @Override // X.C51583KMh, X.KMZ, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.KMZ, X.AbstractC79989VaL
    public final void LIZIZ() {
        if (LLIILZL) {
            return;
        }
        super.LIZIZ();
    }

    @Override // X.KMZ
    public final void LJIIIIZZ() {
        InterfaceC46330IGg interfaceC46330IGg;
        if (LLIILZL) {
            C48679J8p mVideoControl = getMVideoControl();
            if (mVideoControl != null && (interfaceC46330IGg = mVideoControl.LIZIZ) != null && interfaceC46330IGg.LJJLIIIJLJLI(mVideoControl.LIZ) && 1 != 0) {
                interfaceC46330IGg.LJJJLL(null);
                return;
            }
            return;
        }
        super.LJIIIIZZ();
    }

    @Override // X.KMZ
    public final InterfaceC46330IGg LJIIIZ() {
        boolean z;
        SoftReference<InterfaceC46330IGg> softReference;
        String str = this.LLIIJLIL;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z || LLIILZL) {
            return null;
        }
        if (!LLIIL) {
            C51577KMb.LIZJ(str);
            LLIILII.put(str, new SoftReference<>(IQQ.LIZ.LIZ()));
        } else {
            ArrayMap<String, SoftReference<InterfaceC46330IGg>> arrayMap = LLIILII;
            if (!arrayMap.containsKey(str) || (softReference = arrayMap.get(str)) == null || softReference.get() == null) {
                arrayMap.put(str, new SoftReference<>(IQQ.LIZ.LIZ()));
            }
        }
        SoftReference<InterfaceC46330IGg> softReference2 = LLIILII.get(str);
        if (softReference2 == null) {
            return null;
        }
        return softReference2.get();
    }

    @Override // X.KMZ
    public InterfaceC46330IGg getPlayer() {
        String str = this.LLIIJLIL;
        if (str == null || o.LJJJJJL(str) || LLIILZL) {
            return null;
        }
        return super.getPlayer();
    }

    @Override // X.KMZ, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (LLIIL && C51577KMb.LIZ()) {
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // X.KMZ, X.AbstractC79989VaL
    public final void pause() {
        if (LLIILZL && C51577KMb.LIZ()) {
            return;
        }
        super.pause();
    }

    @Override // X.KMZ
    public final void release() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ContextWrapper contextWrapper;
        InterfaceC46330IGg interfaceC46330IGg;
        if (!LLIILZL && LLIIL) {
            C48679J8p mVideoControl = getMVideoControl();
            if (mVideoControl != null && (interfaceC46330IGg = mVideoControl.LIZIZ) != null) {
                interfaceC46330IGg.LJI(0.0f);
            }
            if (C51577KMb.LIZ()) {
                LJIIJJI();
            }
        }
        Context context = getContext();
        Object obj = null;
        if ((context instanceof ContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
            obj = contextWrapper.getBaseContext();
        }
        if ((obj instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) obj) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51576KMa(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LLIIJLIL = "";
    }

    @Override // X.KMZ, X.AbstractC79989VaL
    public final void LJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (LLIILZL) {
            return;
        }
        super.LJ(interfaceC65784Pro);
    }

    @Override // X.KMZ
    public final Aweme LJIILIIL(String str) {
        if (!C51577KMb.LIZ()) {
            return super.LJIILIIL(str);
        }
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = JSONObjectProtectorUtils.getString(jSONObject, "aweme_id");
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "video");
                JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "play_addr");
                String string2 = JSONObjectProtectorUtils.getString(jSONObject3, "uri");
                String string3 = JSONObjectProtectorUtils.getString(jSONObject3, "url_key");
                String string4 = JSONArrayProtectorUtils.getString(JSONObjectProtectorUtils.getJSONArray(jSONObject3, "url_list"), 0);
                int i = JSONObjectProtectorUtils.getInt(jSONObject2, "width");
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject2, "height");
                String string5 = JSONObjectProtectorUtils.getString(jSONObject2, "ratio");
                Aweme aweme = new Aweme();
                aweme.setAid(string);
                Video video = new Video();
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setUri(string2);
                videoUrlModel.setUrlKey(string3);
                ArrayList arrayList = new ArrayList();
                arrayList.add(string4);
                videoUrlModel.setUrlList(arrayList);
                video.setPlayAddr(videoUrlModel);
                video.setWidth(i);
                video.setHeight(i2);
                video.setRatio(string5);
                aweme.setVideo(video);
                return aweme;
            } catch (Throwable unused) {
            }
        }
        return super.LJIILIIL(str);
    }

    @Override // X.KMZ, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (LJIILLIIL(str)) {
            int completeCount = getCompleteCount();
            setCompleteCount(completeCount + 1);
            LJIIL("onCompleted", C113554cx.LJJJLZIJ(new OSZ("times", Integer.valueOf(completeCount))));
            if (!LLIILZL || !C51577KMb.LIZ()) {
                LJIIJJI();
            }
        }
    }

    @Override // X.KMZ, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG error) {
        kotlin.jvm.internal.o.LJIIIZ(error, "error");
        if (LJIILLIIL(error.LIZ)) {
            LJIIL("onPlayFailed", C113554cx.LJJJLZIJ(new OSZ("code", Integer.valueOf(error.LJ))));
        }
    }

    @Override // X.AbstractC79989VaL
    public void setSinglePlayerScene(String singleScene) {
        boolean z;
        kotlin.jvm.internal.o.LJIIIZ(singleScene, "singleScene");
        this.LLIIJLIL = singleScene;
        if (o.LJJJLIIL(singleScene, "non_single_", false)) {
            z = true;
        } else {
            z = false;
        }
        LLIIL = !z;
        if (LLIIZ) {
            LLIIZ = false;
            InterfaceC46330IGg LIZIZ = C51577KMb.LIZIZ(this.LLIIJLIL);
            if (LIZIZ != null) {
                LIZIZ.LJI(0.0f);
            }
        }
    }
}
