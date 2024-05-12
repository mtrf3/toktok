package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC32054Ci2;
import X.ActivityC45651qj;
import X.C31947CgJ;
import X.C38131Exr;
import X.InterfaceC65349Pkn;
import X.KL2;
import Y.AObjectS42S0101000_5;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.utils.crop.CropFragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ChooseImageMethod extends AbstractC32054Ci2<Params, Result> {
    public String LJLJI;
    public Params LJLJJI;

    /* loaded from: classes6.dex */
    public static final class Params {

        @InterfaceC65349Pkn("max_height")
        public int max_height;

        @InterfaceC65349Pkn("max_size")
        public int max_size;

        @InterfaceC65349Pkn("max_width")
        public int max_width;

        @InterfaceC65349Pkn("min_height")
        public int min_height;

        @InterfaceC65349Pkn("min_width")
        public int min_width;

        @InterfaceC65349Pkn("width_to_height_ratio")
        public float width_to_height_ratio = 1.0f;
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        this.LJLILLLLZI = null;
    }

    /* loaded from: classes6.dex */
    public static final class Result {

        @InterfaceC65349Pkn("tempFiles")
        public PhotoFile[] files;

        public Result(PhotoFile[] photoFileArr) {
            this.files = photoFileArr;
        }

        /* loaded from: classes6.dex */
        public static class PhotoFile {

            @InterfaceC65349Pkn("base64Data")
            public String base64;

            @InterfaceC65349Pkn("path")
            public String path;

            @InterfaceC65349Pkn("size")
            public int size;

            public PhotoFile(String str, int i, String str2) {
                this.path = str;
                this.size = i;
                this.base64 = str2;
            }
        }
    }

    public ChooseImageMethod(BaseFragment baseFragment) {
        super(baseFragment);
    }

    public ChooseImageMethod(SparkContext sparkContext) {
        super(sparkContext);
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Object obj, C38131Exr c38131Exr) {
        this.LJLJJI = (Params) obj;
        this.LJLJI = String.valueOf(System.currentTimeMillis());
        C31947CgJ.LJIIIIZZ(40003, this.LJLILLLLZI.mo49getActivity(), this.LJLILLLLZI);
    }

    @Override // X.InterfaceC31231CNn
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 40003) {
            if (i2 != -1 || intent == null || intent.getData() == null) {
                finishWithFailure();
                return;
            }
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity == null) {
                finishWithFailure();
                return;
            }
            Uri uri = intent.getData();
            if (BitmapFactory.decodeStream(mo49getActivity.getContentResolver().openInputStream(uri)) != null) {
                float f = this.LJLJJI.width_to_height_ratio;
                o.LJIIIZ(uri, "uri");
                CropFragment cropFragment = new CropFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("arg_origin_uri", uri);
                bundle.putFloat("arg_width_to_height_ratio", f);
                cropFragment.setArguments(bundle);
                cropFragment.LJLJJLL = new AObjectS42S0101000_5(0, this, 12);
                cropFragment.show(this.LJLILLLLZI.getChildFragmentManager(), "upload_photo");
                return;
            }
            KL2.LJ(mo49getActivity, R.drawable.cpa, mo49getActivity.getString(R.string.t00));
            finishWithFailure();
        }
    }
}
