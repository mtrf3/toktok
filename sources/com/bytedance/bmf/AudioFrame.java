package com.bytedance.bmf;

import com.bytedance.hmp.EnumUtil;
import com.bytedance.hmp.Ptr;
import com.bytedance.hmp.ScalarType;
import com.bytedance.hmp.Tensor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;

/* loaded from: classes34.dex */
public class AudioFrame extends Ptr {

    /* renamed from: com.bytedance.bmf.AudioFrame$1, reason: invalid class name */
    /* loaded from: classes34.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$bmf$OpaqueDataKey;

        static {
            int[] iArr = new int[OpaqueDataKey.values().length];
            $SwitchMap$com$bytedance$bmf$OpaqueDataKey = iArr;
            try {
                iArr[OpaqueDataKey.kJsonParam.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public boolean defined() {
        return API.bmf_af_defined(this.ptr);
    }

    public ScalarType dtype() {
        return (ScalarType) EnumUtil.fromValue(ScalarType.class, Integer.valueOf(API.bmf_af_dtype(this.ptr)));
    }

    public void free() {
        if (this.own) {
            API.bmf_af_free(this.ptr);
        }
    }

    public int nchannels() {
        return API.bmf_af_nchannels(this.ptr);
    }

    public int nplanes() {
        return API.bmf_af_nplanes(this.ptr);
    }

    public int nsamples() {
        return API.bmf_af_nsamples(this.ptr);
    }

    public boolean planer() {
        return API.bmf_af_planer(this.ptr);
    }

    public Tensor[] planes() {
        long[] bmf_af_planes = API.bmf_af_planes(this.ptr);
        int length = bmf_af_planes.length;
        Tensor[] tensorArr = new Tensor[length];
        for (int i = 0; i < length; i++) {
            tensorArr[i] = Tensor.wrap(bmf_af_planes[i], true);
        }
        return tensorArr;
    }

    public long pts() {
        return API.bmf_af_pts(this.ptr);
    }

    public float sampleRate() {
        return API.bmf_af_sample_rate(this.ptr);
    }

    public Rational timeBase() {
        int[] bmf_af_time_base = API.bmf_af_time_base(this.ptr);
        return new Rational(bmf_af_time_base[0], bmf_af_time_base[1]);
    }

    public void copyProps(AudioFrame audioFrame) {
        API.bmf_af_copy_props(this.ptr, audioFrame.ptr);
    }

    public Tensor plane(int i) {
        return Tensor.wrap(API.bmf_af_plane(this.ptr, i), true);
    }

    public Object privateGet(OpaqueDataKey opaqueDataKey) {
        if (AnonymousClass1.$SwitchMap$com$bytedance$bmf$OpaqueDataKey[opaqueDataKey.ordinal()] == 1) {
            return GsonProtectorUtils.fromJson(new Gson(), API.bmf_json_param_dump(API.bmf_af_private_get_json_param(this.ptr)), m.class);
        }
        throw new IllegalArgumentException("Unknown opaque data key in PrivateGet");
    }

    public void privateMerge(AudioFrame audioFrame) {
        API.bmf_af_private_merge(this.ptr, audioFrame.ptr);
    }

    public void setPts(long j) {
        API.bmf_af_set_pts(this.ptr, j);
    }

    public void setSampleRate(float f) {
        API.bmf_af_set_sample_rate(this.ptr, f);
    }

    public void setTimeBase(Rational rational) {
        API.bmf_af_set_time_base(this.ptr, rational.num, rational.den);
    }

    public AudioFrame(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static AudioFrame wrap(long j, boolean z) {
        return new AudioFrame(j, z);
    }

    public void privateAttach(OpaqueDataKey opaqueDataKey, Object obj) {
        if (AnonymousClass1.$SwitchMap$com$bytedance$bmf$OpaqueDataKey[opaqueDataKey.ordinal()] == 1) {
            API.bmf_af_private_attach_json_param(this.ptr, API.bmf_json_param_parse(((j) obj).toString()));
            return;
        }
        throw new IllegalArgumentException("Unknown opaque data key in PrivateAttach");
    }

    public AudioFrame(Tensor[] tensorArr, int i, int i2, boolean z) {
        int length = tensorArr.length;
        long[] jArr = new long[length];
        for (int i3 = 0; i3 < length; i3++) {
            jArr[i3] = tensorArr[i3].getPtr();
        }
        this.ptr = API.bmf_af_make_from_data(jArr, i, i2, z);
        this.own = true;
    }

    public AudioFrame(int i, int i2, boolean z, ScalarType scalarType) {
        this.ptr = API.bmf_af_make(i, i2, z, scalarType.getValue());
        this.own = true;
    }
}
