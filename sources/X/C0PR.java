package X;

import Y.AUListenerS90S0100000_1;
import Y.IDCListenerS135S0100000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0PR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PR extends FrameLayout {
    public static final /* synthetic */ int LJLLI = 0;
    public int LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final IHostCreativeTool LJLJI;
    public String LJLJJI;
    public final C30691Ij LJLJJL;
    public WeakReference<DataChannel> LJLJJLL;
    public LiveEffect LJLJL;
    public InterfaceC88471Ynr<? super String, ? super String, Integer> LJLJLJ;
    public boolean LJLJLLL;
    public final C30781Is LJLL;

    public final int getFromStickerPanel() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Is, X.I2R] */
    public C0PR(Context context) {
        super(context, null, 0);
        DataChannel dataChannel;
        DataChannel dataChannel2;
        new LinkedHashMap();
        LifecycleOwner lifecycleOwner = null;
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class);
        this.LJLJI = iHostCreativeTool;
        this.LJLJJI = C0TY.LIZIZ;
        String panelName = this.LJLJJI;
        o.LJIIIIZZ(panelName, "panelName");
        C30691Ij c30691Ij = new C30691Ij(panelName);
        this.LJLJJL = c30691Ij;
        ?? r1 = new I2R() { // from class: X.1Is
            @Override // X.I2R
            public final void LJIIZILJ(String str) {
                String str2;
                LiveEffect.StickerSDKExtra stickerSDKExtra;
                LiveEffect.PlDataBean plDataBean;
                C0PR c0pr = C0PR.this;
                IHostCreativeTool iHostCreativeTool2 = c0pr.LJLJI;
                LiveEffect liveEffect = c0pr.LJLJL;
                if (liveEffect == null || (stickerSDKExtra = liveEffect.sdkExtraModel) == null || (plDataBean = stickerSDKExtra.pl) == null || (str2 = plDataBean.getImgK()) == null) {
                    str2 = "";
                }
                iHostCreativeTool2.resizePhoto(str2, str);
                C30691Ij c30691Ij2 = C0PR.this.LJLJJL;
                c30691Ij2.getClass();
                if (!o.LJ(C30691Ij.LJLJJI, str)) {
                    c30691Ij2.notifyDataSetChanged();
                }
            }

            @Override // X.I2R
            public final void LJJJJLI(List<String> list) {
                C30691Ij c30691Ij2 = C0PR.this.LJLJJL;
                c30691Ij2.getClass();
                ((ArrayList) c30691Ij2.LJLIL).clear();
                ((ArrayList) c30691Ij2.LJLIL).addAll(list);
                c30691Ij2.notifyDataSetChanged();
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [X.0Ta, O] */
            @Override // X.I2R
            public final void LJJLIIIJL(String str, String str2) {
                DataChannel dataChannel3;
                WeakReference<DataChannel> weakReference = C0PR.this.LJLJJLL;
                if (weakReference != null && (dataChannel3 = weakReference.get()) != null) {
                    ((C32537Cpp) dataChannel3.gv0(C54532Cb.class)).LIZ = new Object(str, str2) { // from class: X.0Ta
                        public final String LIZ;
                        public final String LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C07980Ta)) {
                                return false;
                            }
                            C07980Ta c07980Ta = (C07980Ta) obj;
                            return o.LJ(this.LIZ, c07980Ta.LIZ) && o.LJ(this.LIZIZ, c07980Ta.LIZIZ);
                        }

                        public final int hashCode() {
                            String str3 = this.LIZ;
                            int hashCode = (str3 == null ? 0 : str3.hashCode()) * 31;
                            String str4 = this.LIZIZ;
                            return hashCode + (str4 != null ? str4.hashCode() : 0);
                        }

                        public final String toString() {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("StickerImageModel(key=");
                            LIZ.append(this.LIZ);
                            LIZ.append(", filePath=");
                            return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
                        }

                        {
                            this.LIZ = str;
                            this.LIZIZ = str2;
                        }
                    };
                }
                InterfaceC88471Ynr<? super String, ? super String, Integer> interfaceC88471Ynr = C0PR.this.LJLJLJ;
                if (interfaceC88471Ynr == null || str == null || str2 == null) {
                    return;
                }
                interfaceC88471Ynr.invoke(str, str2);
            }
        };
        this.LJLL = r1;
        FrameLayout.inflate(context, R.layout.dio, this);
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
        if (LIZIZ != null) {
            iHostCreativeTool.Ku0(LIZIZ, r1);
        }
        C29306Beo.LJI(this);
        findViewById(R.id.j7n).getBackground().setAlpha(255);
        View findViewById = findViewById(R.id.jls);
        C16880lQ.LJIILJJIL((FrameLayout) findViewById, new IDCListenerS135S0100000(this, 60));
        this.LJLILLLLZI = (ViewGroup) findViewById;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.fl9);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(c30691Ij);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        WeakReference<DataChannel> weakReference = this.LJLJJLL;
        if (weakReference != null && (dataChannel = weakReference.get()) != null) {
            WeakReference<DataChannel> weakReference2 = this.LJLJJLL;
            if (weakReference2 != null && (dataChannel2 = weakReference2.get()) != null) {
                lifecycleOwner = dataChannel2.LJLJJI;
            }
            dataChannel.ov0(lifecycleOwner, GreenScreenCreatorBlockChannel.class, new IDqS416S0100000(this, 133));
        }
    }

    public final boolean LIZ(LiveEffect liveEffect) {
        Boolean bool;
        if (liveEffect != null) {
            bool = Boolean.valueOf(liveEffect.isGreenScreen);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && this.LJLJLLL) {
            C29306Beo.LJI(getRootView());
            return true;
        }
        return false;
    }

    public final void setFromStickerPanel(int i) {
        this.LJLIL = i;
    }

    public final void LIZIZ(final LiveEffect liveEffect, boolean z) {
        LiveEffect.StickerSDKExtra stickerSDKExtra;
        String str;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (!z && liveEffect != null) {
            if (o.LJ(this.LJLJJI, C0TY.LIZJ)) {
                C32031Nn c32031Nn = C32031Nn.LIZ;
                WeakReference<DataChannel> weakReference = this.LJLJJLL;
                if (weakReference != null) {
                    dataChannel2 = weakReference.get();
                } else {
                    dataChannel2 = null;
                }
                c32031Nn.LIZ(liveEffect, dataChannel2, 0, false);
            } else {
                WeakReference<DataChannel> weakReference2 = this.LJLJJLL;
                if (weakReference2 != null && (dataChannel = weakReference2.get()) != null) {
                    dataChannel.qv0(StickerSelectedEvent.class, new C19680pw(liveEffect, this.LJLJJI, "", C29306Beo.LJIILJJIL()));
                }
            }
        }
        this.LJLJL = liveEffect;
        if (LIZ(liveEffect)) {
            return;
        }
        LiveEffect liveEffect2 = this.LJLJL;
        if (liveEffect2 == null || (stickerSDKExtra = liveEffect2.sdkExtraModel) == null || stickerSDKExtra.pl == null) {
            this.LJLJJL.LJLJI = null;
            C30691Ij.LJLJJI = null;
            C29306Beo.LJI(this);
            return;
        }
        if (Build.VERSION.SDK_INT <= 32) {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        } else {
            str = "android.permission.READ_MEDIA_IMAGES";
        }
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(getContext());
        if (LIZIZ == null) {
            return;
        }
        new C77276UUm(LIZIZ, TokenCert.Companion.with("bpea-green_screen_effect_read_gallery")).LIZ(new InterfaceC78910Uy2() { // from class: X.1It
            @Override // X.InterfaceC78910Uy2
            public final /* synthetic */ void LIZ(String... strArr) {
            }

            @Override // X.InterfaceC78910Uy2
            public final /* synthetic */ void LIZJ(String... strArr) {
            }

            @Override // X.InterfaceC78910Uy2
            public final /* synthetic */ void LJ(String str2, String... strArr) {
            }

            @Override // X.InterfaceC78910Uy2
            public final /* synthetic */ void LJFF(String... strArr) {
            }

            @Override // X.InterfaceC78910Uy2
            public final void LIZIZ(String... permissions) {
                o.LJIIIZ(permissions, "permissions");
                C30868C9o.LIZJ(R.string.kzo);
            }

            @Override // X.InterfaceC78910Uy2
            public final void LIZLLL(String... permissions) {
                o.LJIIIZ(permissions, "permissions");
                C0PR.this.LJLJI.scanPhotoList();
                if (o.LJ(C0PR.this.LJLJJI, C0TY.LIZIZ) || o.LJ(C0PR.this.LJLJJI, "livebackground")) {
                    C29306Beo.LJJLJLI(C0PR.this);
                } else {
                    C0PR c0pr = C0PR.this;
                    o.LJIIIZ(c0pr, "<this>");
                    C29306Beo.LJJLJLI(c0pr);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(400L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new AUListenerS90S0100000_1(c0pr, 66));
                    ofFloat.start();
                }
                C30691Ij c30691Ij = C0PR.this.LJLJJL;
                LiveEffect liveEffect3 = liveEffect;
                if (!o.LJ(c30691Ij.LJLJI, liveEffect3)) {
                    c30691Ij.LJLJI = liveEffect3;
                    C30691Ij.LJLJJI = null;
                    c30691Ij.notifyDataSetChanged();
                }
            }
        }, str);
    }
}
