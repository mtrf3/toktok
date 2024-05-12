package com.ss.android.ugc.aweme.services.external.ability;

import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.InterfaceC88474Ynu;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes8.dex */
public interface IAVInfoService {

    /* loaded from: classes8.dex */
    public interface IFilterMedia<T> {
        boolean filter(T t);
    }

    /* loaded from: classes8.dex */
    public interface IGetInfoCallback<T> {
        void finish(T t);
    }

    /* loaded from: classes8.dex */
    public interface VEFrameAvailableListener {
        boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3);
    }

    void audioLegal(Context context, List<? extends MusicModel> list, IFilterMedia<Integer> iFilterMedia, IGetInfoCallback<List<MusicModel>> iGetInfoCallback);

    void audioLegal(String str, int i, IGetInfoCallback<Integer> iGetInfoCallback);

    void audioLegal(List<String> list, IGetInfoCallback<List<Integer>> iGetInfoCallback);

    int getMusicDuration(String str);

    void importLegal(Context context, String str, boolean z, int i, int i2, InterfaceC88471Ynr<? super String, ? super Long, C76800UCe> interfaceC88471Ynr, InterfaceC88474Ynu<? super String, ? super Long, ? super Integer, ? super String, C76800UCe> interfaceC88474Ynu);

    void mp3Legal(Context context, String str, IGetInfoCallback<Integer> iGetInfoCallback);

    void mp3Legal(String str, IGetInfoCallback<Integer> iGetInfoCallback);

    int[] photoInfo(String str);

    boolean supportTrimmedMuisc(MusicModel musicModel);

    void videoCover(AwemeDraft awemeDraft, IGetInfoCallback<Bitmap> iGetInfoCallback);

    void videoFrame(String str, int[] iArr, VEFrameAvailableListener vEFrameAvailableListener);

    void videoInfo(String str, boolean z, IGetInfoCallback<int[]> iGetInfoCallback);
}
