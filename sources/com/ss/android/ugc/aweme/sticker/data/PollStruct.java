package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class PollStruct implements Serializable {
    public List<OptionsBean> options;

    @InterfaceC65349Pkn("vote_id")
    public long pollId;
    public String question;

    @InterfaceC65349Pkn("ref_id")
    public long refId;

    @InterfaceC65349Pkn("ref_type")
    public int refType;

    @InterfaceC65349Pkn("select_option_id")
    public long selectOptionId;

    /* loaded from: classes3.dex */
    public static class OptionsBean implements Serializable {

        @InterfaceC65349Pkn("option_id")
        public long optionId;

        @InterfaceC65349Pkn("option_text")
        public String optionText;

        @InterfaceC65349Pkn("vote_count")
        public long pollCount;

        @InterfaceC65349Pkn("option")
        public String postOption;

        public int hashCode() {
            return ((int) this.optionId) * 31;
        }

        public long getOptionId() {
            return this.optionId;
        }

        public String getOptionText() {
            return this.optionText;
        }

        public long getPollCount() {
            return this.pollCount;
        }

        public String getPostOption() {
            return this.postOption;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OptionsBean optionsBean = (OptionsBean) obj;
            String str = this.optionText;
            if (str == null ? optionsBean.optionText != null : !str.equals(optionsBean.optionText)) {
                return false;
            }
            if (this.optionId != optionsBean.optionId || this.pollCount != optionsBean.pollCount) {
                return false;
            }
            String str2 = this.postOption;
            String str3 = optionsBean.postOption;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }

        public void setOptionId(long j) {
            this.optionId = j;
        }

        public void setOptionText(String str) {
            this.optionText = str;
        }

        public void setPollCount(long j) {
            this.pollCount = j;
        }

        public void setPostOption(String str) {
            this.postOption = str;
        }
    }

    public int hashCode() {
        return ((int) this.pollId) * 31;
    }

    public List<OptionsBean> getOptions() {
        return this.options;
    }

    public long getPollId() {
        return this.pollId;
    }

    public String getQuestion() {
        return this.question;
    }

    public long getRefId() {
        return this.refId;
    }

    public int getRefType() {
        return this.refType;
    }

    public long getSelectOptionId() {
        return this.selectOptionId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PollStruct pollStruct = (PollStruct) obj;
        String str = this.question;
        if (str == null ? pollStruct.question != null : !str.equals(pollStruct.question)) {
            return false;
        }
        if (this.pollId != pollStruct.pollId || this.selectOptionId != pollStruct.selectOptionId) {
            return false;
        }
        List<OptionsBean> list = this.options;
        List<OptionsBean> list2 = pollStruct.options;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public void setOptions(List<OptionsBean> list) {
        this.options = list;
    }

    public void setPollId(long j) {
        this.pollId = j;
    }

    public void setQuestion(String str) {
        this.question = str;
    }

    public void setRefId(long j) {
        this.refId = j;
    }

    public void setRefType(int i) {
        this.refType = i;
    }

    public void setSelectOptionId(long j) {
        this.selectOptionId = j;
    }
}
