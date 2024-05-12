package com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SurveyDetailResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyDetailResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurveyDetailResponse) && o.LJ(this.data, ((SurveyDetailResponse) obj).data);
    }

    public final int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SurveyDetailResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Data {

        @InterfaceC65349Pkn("stars_title_array")
        public List<String> starsTitleList;

        @InterfaceC65349Pkn("survey_title")
        public final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.title, data.title) && o.LJ(this.starsTitleList, data.starsTitleList);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.starsTitleList;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(title=");
            LIZ.append(this.title);
            LIZ.append(", starsTitleList=");
            return C1NE.LIZIZ(LIZ, this.starsTitleList, ')', LIZ);
        }

        public Data(String str, List<String> list) {
            this.title = str;
            this.starsTitleList = list;
        }

        public /* synthetic */ Data(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }
    }

    public SurveyDetailResponse(Data data) {
        this.data = data;
    }

    public /* synthetic */ SurveyDetailResponse(Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : data);
    }
}
